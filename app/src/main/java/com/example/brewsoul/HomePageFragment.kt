package com.example.brewsoul

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.brewsoul.databinding.FragmentHomePageBinding


class HomePageFragment : Fragment() {

    private lateinit var _binding: FragmentHomePageBinding
    private val binding get() = _binding

    //view model declaration
    lateinit var viewModel: HomePageViewModel


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentHomePageBinding.inflate(inflater, container, false)
        return binding.root
    }


    @SuppressLint("SuspiciousIndentation")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //view model initialisation
        viewModel = ViewModelProvider(this)[HomePageViewModel::class.java]

        updateLatestValues()

        _binding.c1.incrementCountButton1.setOnClickListener {
            viewModel.incrementCountButton1()
            viewModel.grandTotal()
            updateLatestValues()
        }

        _binding.c1.decrementCountButton1.setOnClickListener {
            if (viewModel.expCoffeQuantity > 0)
                viewModel.decrementCountButton1()
            viewModel.grandTotal()
            updateLatestValues()
        }

        _binding.c2.incrementCountButton2.setOnClickListener {
            viewModel.incrementCountButton2()
            viewModel.grandTotal()
            updateLatestValues()
        }

        _binding.c2.decrementCountButton2.setOnClickListener {
            if (viewModel.capCoffeQuantity > 0)
                viewModel.decrementCountButton2()
            viewModel.grandTotal()
            updateLatestValues()
        }

        _binding.c3.incrementCountButton3.setOnClickListener {
            viewModel.incrementCountButton3()
            viewModel.grandTotal()
            updateLatestValues()
        }

        _binding.c3.decrementCountButton3.setOnClickListener {
            if (viewModel.coldCoffeQuantity > 0)
                viewModel.decrementCountButton3()
            viewModel.grandTotal()
            updateLatestValues()
        }

        _binding.c4.incrementCountButton4.setOnClickListener {
            viewModel.incrementCountButton4()
            viewModel.grandTotal()
            updateLatestValues()
        }

        _binding.c4.decrementCountButton4.setOnClickListener {
            if (viewModel.hotChocoQuantity > 0)
                viewModel.decrementCountButton4()
            viewModel.grandTotal()
            updateLatestValues()
        }

        _binding.c5.incrementCountButton5.setOnClickListener {
            viewModel.incrementCountButton5()
            viewModel.grandTotal()
            updateLatestValues()
        }

        _binding.c5.decrementCountButton5.setOnClickListener {
            if (viewModel.mochaCoffeQuantity > 0)
                viewModel.decrementCountButton5()
            viewModel.grandTotal()
            updateLatestValues()
        }

    }


    fun updateLatestValues() {

        _binding.c1.productAmount1.text = viewModel.expCoffeAmount.toString()
        _binding.c1.expCoffeQuantity.text = viewModel.expCoffeQuantity.toString()

        _binding.c2.productAmount2.text = viewModel.capCoffeAmount.toString()
        _binding.c2.capCoffeQuantity.text = viewModel.capCoffeQuantity.toString()

        _binding.c3.productAmount3.text = viewModel.coldCoffeAmount.toString()
        _binding.c3.coldCoffeQuantity.text = viewModel.coldCoffeQuantity.toString()

        _binding.c4.productAmount4.text = viewModel.hotChocoAmount.toString()
        _binding.c4.hotChocoQuantity.text = viewModel.hotChocoQuantity.toString()

        _binding.c5.productAmount5.text = viewModel.mochaCoffeAmount.toString()
        _binding.c5.mochaCoffeQuantity.text = viewModel.mochaCoffeQuantity.toString()

        _binding.grandTotal.text = viewModel.grandTotal.toString()

    }


}






