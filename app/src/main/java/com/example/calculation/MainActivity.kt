package com.example.calculation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.calculation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    var number1 = 0
    var number2 = 0
    var sign = ""
    var sign1 = ""
    var signCase = 0
    var res = 0
    var resBool = true
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        fun cal(num:Int) {
            when (resBool) {
                false -> {
                    number1 = 0
                    number2 = 0
                    signCase = 0
                    resBool = true
                }true -> null
            }
            when (signCase){
                0 -> {
                    number1 = number1 * 10 + num
                    sign = number1.toString()
                    binding.num.text = sign.toString()
                }else -> {
                    number2 = number2 * 10 + num
                    sign1 = sign + number2.toString()
                    binding.num.text = sign1.toString()
                }
            }
        }

        fun signCase (s:Int) {
                when {
                    s == 1 && (resBool == false || number2 == 0) -> sign = number1.toString() + "+"
                    s == 2 && (resBool == false || number2 == 0)-> sign = number1.toString() + "-"
                    s == 3 && (resBool == false || number2 == 0)-> sign = number1.toString() + "*"
                    s == 4 && (resBool == false || number2 == 0)-> sign = number1.toString() + "/"
                }
                when {
                    resBool == false || number2 == 0 -> {
                        resBool = true
                        signCase = s
                        number2 = 0
                        binding . num . text = sign . toString ()}
                }
        }

        binding.button1.setOnClickListener {
            cal(1)
        }

        binding.button2.setOnClickListener {
            cal(2)
        }

        binding.button3.setOnClickListener {
            cal(3)
        }

        binding.button4.setOnClickListener {
            cal(4)
        }

        binding.button5.setOnClickListener {
            cal(5)
        }

        binding.button6.setOnClickListener {
            cal(6)
        }

        binding.button7.setOnClickListener {
            cal(7)
        }

        binding.button8.setOnClickListener {
            cal(8)
        }

        binding.button9.setOnClickListener {
            cal(9)
        }

        binding.button0.setOnClickListener {
            cal(0)
        }

        binding.minus.setOnClickListener {
            when (number2) {
                0->{
                    number1 = number1  * -1
                    sign = number1.toString()
                    binding.num.text = sign.toString()
                } else->{
                    number2 = number2 * -1
                    sign1 = sign + number2.toString()
                    binding.num.text = sign1.toString()}
            }
        }

        binding.clear.setOnClickListener {
            sign = 0.toString()
            number1 = 0
            number2 = 0
            signCase = 0
            binding.num.text = sign.toString()
        }

        binding.add.setOnClickListener {
            signCase(1)
        }

        binding.sub.setOnClickListener {
            signCase(2)
        }

        binding.mul.setOnClickListener {
            signCase(3)
        }

        binding.div.setOnClickListener {
            signCase(4)
        }

        binding.square.setOnClickListener {
            when (resBool) {
                false -> {
                    res = res * res
                    sign = res.toString()
                    binding.num.text = sign.toString()
                } true -> when (signCase) {
                0 -> {
                        number1 = number1 * number1
                        sign = number1.toString()
                        binding.num.text = sign.toString()
                    }
                    else -> {
                        number2 = number2 * number2
                        sign1 = sign + number2.toString()
                        binding.num.text = sign1.toString()
                    }
                }
            }
        }

        binding.result.setOnClickListener {
            when(signCase) {
                1->res = number1 + number2
                2->res = number1 - number2
                3->res = number1 * number2
                4->res = number1 / number2
                else -> res = number1
            }
            binding.num.text = res.toString ()
            sign = res.toString ()
            number1 = res
            resBool = false
        }
    }
}