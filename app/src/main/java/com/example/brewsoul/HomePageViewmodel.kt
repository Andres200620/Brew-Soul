package com.example.brewsoul

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomePageViewModel: ViewModel() {

    var expCoffeQuantity = 0
    var expCoffeAmount = 200

    var capCoffeQuantity = 0
    var capCoffeAmount = 250

    var coldCoffeQuantity = 0
    var coldCoffeAmount = 150

    var hotChocoQuantity = 0
    var hotChocoAmount = 200

    var mochaCoffeQuantity = 0
    var mochaCoffeAmount = 300

   val grandTotalLiveData : MutableLiveData<Int> by lazy {
       MutableLiveData<Int>()
   }


    fun incrementCountButton1(){
        expCoffeQuantity +=1
    }

    fun decrementCountButton1(){
        expCoffeQuantity -=1
    }

    fun incrementCountButton2(){
        capCoffeQuantity +=1
    }

    fun decrementCountButton2(){
        capCoffeQuantity -=1
    }

    fun incrementCountButton3(){
        coldCoffeQuantity +=1
    }

    fun decrementCountButton3(){
        coldCoffeQuantity -=1
    }

    fun incrementCountButton4(){
        hotChocoQuantity +=1
    }

    fun decrementCountButton4(){
        hotChocoQuantity -=1
    }

    fun incrementCountButton5(){
        mochaCoffeQuantity +=1
    }

    fun decrementCountButton5(){
        mochaCoffeQuantity -=1
    }




    fun grandTotal(){
        val c1Total = expCoffeAmount * expCoffeQuantity
        val c2Total = capCoffeAmount * capCoffeQuantity
        val c3Total = coldCoffeAmount * coldCoffeQuantity
        val c4Total = hotChocoAmount * hotChocoQuantity
        val c5Total = mochaCoffeAmount * mochaCoffeQuantity


        grandTotalLiveData.value = c1Total + c2Total + c3Total + c4Total + c5Total
    }
}