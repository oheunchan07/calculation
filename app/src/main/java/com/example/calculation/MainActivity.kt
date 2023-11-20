package com.example.calculation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.calculation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    var number = 0
    var number1 = 0
    var sign = ""
    var sign1 = ""
    var signCase = 0
    var result1 = 0
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button1.setOnClickListener {
            if (signCase == 0) {
                number = number * 10 + 1
                sign = number.toString()
                binding.num.text = sign.toString()
            } else {
                number1 = number1 * 10 + 1
                sign1 = sign + number1.toString()
                binding.num.text = sign1.toString()
            }
        }

        binding.button2.setOnClickListener {
            if (signCase == 0) {
                number = number * 10 + 2
                sign = number.toString()
                binding.num.text = sign.toString()
            } else {
                number1 = number1 * 10 + 2
                sign1 = sign + number1.toString()
                binding.num.text = sign1.toString()
            }
        }

        binding.button3.setOnClickListener {
            if (signCase == 0) {
                number = number * 10 + 3
                sign = number.toString()
                binding.num.text = sign.toString()
            } else {
                number1 = number1 * 10 + 3
                sign1 = sign + number1.toString()
                binding.num.text = sign1.toString()
            }
        }

        binding.button4.setOnClickListener {
            if (signCase == 0) {
                number = number * 10 + 4
                sign = number.toString()
                binding.num.text = sign.toString()
            } else {
                number1 = number1 * 10 + 4
                sign1 = sign + number1.toString()
                binding.num.text = sign1.toString()
            }
        }

        binding.button5.setOnClickListener {
            if (signCase == 0) {
                number = number * 10 + 5
                sign = number.toString()
                binding.num.text = sign.toString()
            } else {
                number1 = number1 * 10 + 5
                sign1 = sign + number1.toString()
                binding.num.text = sign1.toString()
            }
        }

        binding.button6.setOnClickListener {
            if (signCase == 0) {
                number = number * 10 + 6
                sign = number.toString()
                binding.num.text = sign.toString()
            } else {
                number1 = number1 * 10 + 6
                sign1 = sign + number1.toString()
                binding.num.text = sign1.toString()
            }
        }

        binding.button7.setOnClickListener {
            if (signCase == 0) {
                number = number * 10 + 7
                sign = number.toString()
                binding.num.text = sign.toString()
            } else {
                number1 = number1 * 10 + 7
                sign1 = sign + number1.toString()
                binding.num.text = sign1.toString()
            }
        }

        binding.button8.setOnClickListener {
            if (signCase == 0) {
                number = number * 10 + 8
                sign = number.toString()
                binding.num.text = sign.toString()
            } else {
                number1 = number1 * 10 + 8
                sign1 = sign + number1.toString()
                binding.num.text = sign1.toString()
            }
        }

        binding.button9.setOnClickListener {
            if (signCase == 0) {
                number = number * 10 + 9
                sign = number.toString()
                binding.num.text = sign.toString()
            } else {
                number1 = number1 * 10 + 9
                sign1 = sign + number1.toString()
                binding.num.text = sign1.toString()
            }
        }

        binding.button0.setOnClickListener {
            if (signCase == 0) {
                number = number * 10
                sign = number.toString()
                binding.num.text = sign.toString()
            } else {
                number1 = number1 * 10
                sign1 = sign + number1.toString()
                binding.num.text = sign1.toString()
            }
        }

        binding.clear.setOnClickListener {
            sign = 0.toString()
            number = 0
            number1 = 0
            signCase = 0
            binding.num.text = sign.toString()
        }

        binding.add.setOnClickListener {
            if(signCase == 0&&number != 0) {
            sign = sign +  "+"
            signCase = 1
            binding.num.text = sign.toString()
            }
        }

        binding.sub.setOnClickListener {
            if(signCase == 0&&number != 0) {
            sign = sign +  "-"
            signCase = 2
            binding.num.text = sign.toString()
            }
        }

        binding.mul.setOnClickListener {
            if (signCase == 0&&number != 0) {
                sign = sign + "*"
                signCase = 3
                binding.num.text = sign.toString()
            }
        }

        binding.div.setOnClickListener {
            if(signCase == 0 && number != 0) {
            sign = sign +  "/"
            signCase = 4
            binding.num.text = sign.toString()
            }
        }

        binding.result.setOnClickListener {
            if(signCase != 0) {
                if (signCase == 1)
                    result1 = number + number1
                if (signCase == 2)
                    result1 = number - number1
                if (signCase == 3)
                    result1 = number * number1
                if (signCase == 4)
                    result1 = number / number1
                binding.num.text = result1.toString()
                sign = result1.toString()
                number = result1
                number1 = 0
                signCase = 0
            }
        }
    }
}