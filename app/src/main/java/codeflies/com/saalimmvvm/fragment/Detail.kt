package codeflies.com.saalimmvvm.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import codeflies.com.saalimmvvm.R
import codeflies.com.saalimmvvm.Cart.ShowDataActivity
import codeflies.com.saalimmvvm.databinding.FragmentDetailBinding


class Detail : Fragment(R.layout.fragment_detail) {


    private lateinit var binding:FragmentDetailBinding


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding=FragmentDetailBinding.bind(view)
        (requireActivity() as ShowDataActivity).showcarticon()

    }

}