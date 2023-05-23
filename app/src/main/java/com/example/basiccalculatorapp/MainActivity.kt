package com.example.basiccalculatorapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.inputmethod.InputBinding
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.basiccalculatorapp.databinding.ActivityMainBinding
import com.example.basiccalculatorapp.ui.theme.BasiccalculatorappTheme

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
        val input1= binding.edittext1.text.toString().toInt()
        val input2= binding.edittext2.text.toString().toInt()

        val total= ( input1 + input2)
        binding.result.text = total.toString()
    }

    private fun subResult() {
        val input1= binding.edittext1.text.toString().toInt()
        val input2= binding.edittext2.text.toString().toInt()

        val total= ( input1 - input2)
        binding.result.text = total.toString()
    }

    private fun divResult() {
        val input1= binding.edittext1.text.toString().toInt()
        val input2= binding.edittext2.text.toString().toInt()

        val total= ( input1 / input2)
        binding.result.text = total.toString()
    }

    private fun mulResult() {
        val input1= binding.edittext1.text.toString().toInt()
        val input2= binding.edittext2.text.toString().toInt()

        val total= ( input1 * input2)
        binding.result.text = total.toString()
    }
}





