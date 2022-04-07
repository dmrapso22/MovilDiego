package com.example.layout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.layout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.suma.setOnClickListener{
            suma()
            val num2 = binding.ed2.text.toString()
            val num1 = binding.ed1.text.toString()
            binding.Display.setText(num1 + num2)
            //Toast.makeText(this,num1)
        }

        binding.resta.setOnClickListener{
            resta()
        }

        binding.multi.setOnClickListener{
            multipliacion()
        }

        binding.division.setOnClickListener{
            division()
        }
    }

    private fun division(num1: Int, num2: Int) :Int {
        val num2 = binding.ed2.text.toString()
        val num1 = binding.ed1.text.toString()
        val clean_value = num1.toInt()
        val clean_value2 = num2.toInt()
        var total = clean_value + clean_value2
        return total
    }

    private fun multipliacion(num1: Int, num2: Int) :Int{
        val num2 = binding.ed2.text.toString()
        val num1 = binding.ed1.text.toString()
        val clean_value = num1.toInt()
        val clean_value2 = num2.toInt()
        var total = clean_value + clean_value2
        return total
    }

    private fun resta(num1: Int, num2: Int) :Int{
        val num2 = binding.ed2.text.toString()
        val num1 = binding.ed1.text.toString()
        val clean_value = num1.toInt()
        val clean_value2 = num2.toInt()
        var total = clean_value + clean_value2
        return total
    }

    private fun suma(num1: Int, num2: Int) :Int{
        val num2 = binding.ed2.text.toString()
        val num1 = binding.ed1.text.toString()
        val clean_value = num1.toInt()
        val clean_value2 = num2.toInt()
        var total = clean_value + clean_value2
        return total
    }
}