package com.example.basiccalculator

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import com.example.basiccalculatorapp.databinding.ActivityMainBinding


class MainActivity : ComponentActivity() {

    private lateinit var binding: ActivityMainBinding

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnplus.setOnClickListener { addResult() }
        binding.btnminus.setOnClickListener { subResult() }
        binding.btndivide.setOnClickListener { divResult() }
        binding.btnmultiply.setOnClickListener { mulResult() }
    }

    private fun addResult() {
        val input1= binding.edittext1.text.toString().toDouble()
        val input2= binding.edittext2.text.toString().toDouble()

        val total= ( input1 + input2)
        binding.result.text = total.toString()
    }

    private fun subResult() {
        val input1= binding.edittext1.text.toString().toDouble()
        val input2= binding.edittext2.text.toString().toDouble()

        val total= ( input1 - input2)
        binding.result.text = total.toString()
    }

    private fun divResult() {
        val input1= binding.edittext1.text.toString().toDouble()
        val input2= binding.edittext2.text.toString().toDouble()

        val total= ( input1 / input2)
        binding.result.text = total.toString()
    }

    private fun mulResult() {
        val input1= binding.edittext1.text.toString().toDouble()
        val input2= binding.edittext2.text.toString().toDouble()

        val total= ( input1 * input2)
        binding.result.text = total.toString()
    }
}





