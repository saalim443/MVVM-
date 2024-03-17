package codeflies.com.saalimmvvm.fragment

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import codeflies.com.saalimmvvm.Cart.ShowDataActivity
import codeflies.com.saalimmvvm.R
import codeflies.com.saalimmvvm.adapter.AllCateAdapter
import codeflies.com.saalimmvvm.adapter.MaintainenceAdapter
import codeflies.com.saalimmvvm.adapter.ParentAdapter
import codeflies.com.saalimmvvm.adapter.SliderAdapter
import codeflies.com.saalimmvvm.adapter.SliderAdapter2
import codeflies.com.saalimmvvm.databinding.FragmentHomeBinding
import codeflies.com.saalimmvvm.model.responseClass.home.HomeItem
import codeflies.com.saalimmvvm.model.responseClass.home.HomeResponse
import codeflies.com.saalimmvvm.network.ApiClientTwo
import codeflies.com.saalimmvvm.repository.MainRepository
import codeflies.com.saalimmvvm.viewmodel.MainViewModel
import codeflies.com.saalimmvvm.viewmodelfactory.MainViewModelFactory
import kotlinx.coroutines.async
import kotlinx.coroutines.launch


class Home : Fragment(R.layout.fragment_home) {
    private lateinit var binding: FragmentHomeBinding
    private lateinit var viewModel: MainViewModel
    private lateinit var mainadapter: AllCateAdapter
    private lateinit var sliderAdapter: SliderAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentHomeBinding.bind(view)
        (requireActivity() as ShowDataActivity).showcarticon()
        (requireActivity() as ShowDataActivity).hideNavigattion()


//        binding.btn.setOnClickListener {
//            findNavController().navigate(R.id.action_home2_to_login)
//        }
//    /*    binding.btn.setOnClickListener {
//            findNavController().popBackStack()
//        }*/

        // val apiservice = ApiClient.apiInterface
        val apiservice = ApiClientTwo.apiInterface
        val repository = MainRepository(apiservice)
        viewModel =
            ViewModelProvider(this, MainViewModelFactory(repository))[MainViewModel::class.java]
        binding.viewmodel = viewModel
        initApicalls()
        initobservere()
        initViewPager()

    }

    private fun initViewPager() {
        sliderAdapter = SliderAdapter(requireContext(), emptyList())
    }

    private fun initobservere() {
        val diiffer = lifecycleScope.async {
            viewModel.postdataHomeresponse.observe(requireActivity()) { it ->
                sliderAdapter = SliderAdapter(requireContext(), it.sliderArray)
                binding.viewPager.adapter = sliderAdapter
            }
        }

        lifecycleScope.launch {
            diiffer.await() // Wait for the first coroutine to complete


            viewModel.postdataHomeresponse.observe(requireActivity()) { it ->
                val list = ArrayList<HomeItem>()
                list.addAll(it.topCategoryArray)
                list.add(HomeItem("4", "View All", ""))
                val allcateadapter = AllCateAdapter(list, requireActivity())
                binding.rvAllCate.adapter = allcateadapter

                val response = ArrayList<HomeResponse>()
                response.add(it)
                val adapter = ParentAdapter(response, requireActivity())
                binding.rvTopCategoryArray.adapter = adapter
            }

            // Handle other observed data as needed
            viewModel.postdataMaintainresponse.observe(requireActivity()) { response ->
                binding.txtSlider2.text = response[0].name
                val slideradapter = SliderAdapter2(requireActivity(), response[0].arraydata)
                binding.viewPager2.adapter = slideradapter
                Log.e("postdataMaintainresponseMainactivity", response.toString())
                val adapter = MaintainenceAdapter(response, requireActivity())
                binding.recyclerMaintainence.adapter = adapter
            }

            viewModel.loading.observe(requireActivity()) { isLoading ->
                binding.progressBar.visibility = if (isLoading) View.VISIBLE else View.GONE
            }
        }
    }


    private fun initApicalls() {
        viewModel.getpostHome()
        viewModel.getpostMainta()

    }

}
