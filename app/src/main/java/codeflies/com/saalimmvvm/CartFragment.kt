package codeflies.com.saalimmvvm

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import codeflies.com.saalimmvvm.Cart.ShowDataActivity
import codeflies.com.saalimmvvm.databinding.FragmentCartBinding


class CartFragment : Fragment(R.layout.fragment_cart) {


    private lateinit var binding: FragmentCartBinding


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding= FragmentCartBinding.bind(view)
        (requireActivity() as ShowDataActivity).hideCartIcon()


    }
}