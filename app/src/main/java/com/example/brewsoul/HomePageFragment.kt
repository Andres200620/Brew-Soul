package com.example.brewsoul

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.brewsoul.databinding.FragmentHomePageBinding


class HomePageFragment : Fragment() {

    private lateinit var _binding: FragmentHomePageBinding
    private val binding get() = _binding

    var expcoffeQuantity = 0
    var expcoffeAmount = 200

    var capcoffeQuantity = 0
    var capcoffeAmount = 250

    var coldCoffeQuantity = 0
    var coldCoffeAmount = 150

    var hotChocoQuantity = 0
    var hotChocoAmount = 200

    var mochaCoffeQuantity = 0
    var mochaCoffeAmount = 300
    var grandTotal = 0



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentHomePageBinding.inflate(inflater, container,false)
        return binding.root
    }



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        updateLatestValues()

        _binding.c1.incrementCountButton1.setOnClickListener {
            expcoffeQuantity += 1
            calculateGrandTotal()
            updateLatestValues()
        }

        _binding.c1.decrementCountButton1.setOnClickListener {
            if(expcoffeQuantity>0){
                expcoffeQuantity -= 1
               calculateGrandTotal()
                updateLatestValues()
            }

        }

        _binding.c2.incrementCountButton2.setOnClickListener {
            capcoffeQuantity += 1
            calculateGrandTotal()
             updateLatestValues()
        }

        _binding.c2.decrementCountButton2.setOnClickListener {
            if (capcoffeQuantity>0){
                capcoffeQuantity -= 1
                calculateGrandTotal()
                updateLatestValues()
            }
        }

        _binding.c3.incrementCountButton3.setOnClickListener {
            coldCoffeQuantity += 1
            calculateGrandTotal()
            updateLatestValues()
        }

        _binding.c3.decrementCountButton3.setOnClickListener {
            if (coldCoffeQuantity>0){
                coldCoffeQuantity -= 1
                calculateGrandTotal()
                updateLatestValues()
            }
        }


        _binding.c4.incrementCountButton4.setOnClickListener {
            hotChocoQuantity += 1
            calculateGrandTotal()
            updateLatestValues()
        }

        _binding.c4.decrementCountButton4.setOnClickListener {
            if (hotChocoQuantity>0){
                hotChocoQuantity -= 1
                calculateGrandTotal()
                updateLatestValues()
            }
        }

        _binding.c5.incrementCountButton5.setOnClickListener {
            mochaCoffeQuantity += 1
            calculateGrandTotal()
            updateLatestValues()
        }

        _binding.c5.decrementCountButton5.setOnClickListener {
            if (mochaCoffeQuantity>0){
                mochaCoffeQuantity-= 1
                calculateGrandTotal()
                updateLatestValues()
            }
        }

    }

    fun calculateGrandTotal(){
        val c1Total = expcoffeAmount * expcoffeQuantity
        val c2Total = capcoffeAmount * capcoffeQuantity
        val c3Total = coldCoffeAmount * coldCoffeQuantity
        val c4Total = hotChocoAmount * hotChocoQuantity
        val c5Total = mochaCoffeAmount * mochaCoffeQuantity

         grandTotal = c1Total + c2Total + c3Total + c4Total + c5Total

    }

    fun updateLatestValues(){

        _binding.c1.productAmount1.text = expcoffeAmount.toString()
        _binding.c1.quantityCount1.text = expcoffeQuantity.toString()

        _binding.c2.productAmount2.text = capcoffeAmount.toString()
        _binding.c2.quantityCount2.text = capcoffeQuantity.toString()

        _binding.c3.productAmount3.text = coldCoffeAmount.toString()
        _binding.c3.quantityCount3.text = coldCoffeQuantity.toString()

        _binding.c4.productAmount4.text = hotChocoAmount.toString()
        _binding.c4.quantityCount4.text = hotChocoQuantity.toString()

        _binding.c5.productAmount5.text = mochaCoffeAmount.toString()
        _binding.c5.quantityCount5.text = mochaCoffeQuantity.toString()


        _binding.grandTotal.text = grandTotal.toString()
    }

}



