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
            if(count != 0) {
                count = 0
                number2 = 0
                res = 0
                sign = "0"
            }
            if(sign == "0"){
                number1 = number1 * 10 + n
                expression = number1.toString()
                binding.num.text = expression
            } else {
                number2 = number2 * 10 + n
                expression += n.toString()
                binding.num.text = expression
            }
        }

        fun sign(s:Int) {
            if(count != 0) {
                count = 0
                number1 = res
                res = 0
                number2 = 0
            }
            if(number2 == 0) {
                when(s) {
                    1->sign = "+"
                    2->sign = "-"
                    3->sign = "*"
                    4->sign = "/"
                }
                expression = number1.toString() + sign
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

        binding.minus.setOnClickListener {
            if(count == 0) {
                if(number2 == 0) {
                    number1 = number1 * -1
                    if(sign == "0") {
                        expression = number1.toString()
                    } else {
                        expression = number1.toString() + sign
                    }
                } else {
                    number2 = number2 * -1
                    expression = number1.toString() + sign + number2.toString()
                }
                binding.num.text = expression
            } else {
                res = res * -1
                binding.num.text = res.toString()
            }
        }

        binding.square.setOnClickListener {
            if(count == 0) {
                if (number2 == 0) {
                    number1 = number1 * number1
                    if (sign == "0") {
                        expression = number1.toString()
                    } else {
                        expression = number1.toString() + sign
                    }
                } else {
                    number2 = number2 * number2
                    expression = number1.toString() + sign + number2.toString()
                }
                binding.num.text = expression
            } else {
                res = res * res
                binding.num.text = res.toString()
            }
        }

        binding.result.setOnClickListener {
            if(count != 0) {
                when(sign) {
                    "+" -> res += number2
                    "-" -> res -= number2
                    "*" -> res *= number2
                    "/" -> res /= number2
                }
            } else {
                when(sign) {
                    "+" -> res = number1+number2
                    "-" -> res = number1-number2
                    "*" -> res = number1*number2
                    "/" -> res = number1/number2
                }
            }
            count++

            binding.num.text = res.toString()
            number1 = 0
            expression = ""
        }

        binding.clear.setOnClickListener {
            res = 0
            sign = "0"
            count = 0
            number1 = 0
            number2 = 0
            expression = ""
            binding.num.text = number1.toString()
        }
    }
}