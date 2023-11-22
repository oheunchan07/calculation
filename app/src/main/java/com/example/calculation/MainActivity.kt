package com.example.calculation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.calculation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    var number1 = 0
    var number2 = 0
    var sign = "0"
    var expression = ""
    var res = 0
    var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        fun num(n:Int) {
            if(sign == "0"){
                number1 = number1 * 10 + n
                expression = number1.toString()
                binding.num.text = expression
            }
            else {
                number2 = number2 * 10 + n
                expression += number2.toString()
                binding.num.text = expression
            }
        }

        fun sign(s:Int) {
            if(sign == "0") {
                when(s) {
                    1->sign = "+"
                    2->sign = "-"
                    3->sign = "*"
                    4->sign = "/"
                }
                expression += sign
                binding.num.text = expression
            }
        }

        binding.button0.setOnClickListener {
            num(0)
        }
        binding.button1.setOnClickListener {
            num(1)
        }
        binding.button2.setOnClickListener {
            num(2)
        }
        binding.button3.setOnClickListener {
            num(3)
        }
        binding.button4.setOnClickListener {
            num(4)
        }
        binding.button5.setOnClickListener {
            num(5)
        }
        binding.button6.setOnClickListener {
            num(6)
        }
        binding.button7.setOnClickListener {
            num(7)
        }
        binding.button8.setOnClickListener {
            num(8)
        }
        binding.button9.setOnClickListener {
            num(9)
        }

        binding.add.setOnClickListener {
            sign(1)
        }
        binding.sub.setOnClickListener {
            sign(2)
        }
        binding.mul.setOnClickListener {
            sign(3)
        }
        binding.div.setOnClickListener {
            sign(4)
        }
        binding.result.setOnClickListener {
            when(sign) {
                "+" -> res = number1+number2
                "-" -> res = number1-number2
                "*" -> res = number1*number2
                "/" -> res = number1/number2
            }
            binding.num.text = res.toString()
        }

        binding.clear.setOnClickListener {
            number1 = 0
            number2 = 0
            expression = ""
            sign = "0"
            res = 0
            binding.num.text = number1.toString()
        }
    }
}