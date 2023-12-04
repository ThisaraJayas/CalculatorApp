package com.example.hello

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import com.example.hello.models.Calculator

class MainActivity : AppCompatActivity() {

    lateinit var editNumber1:EditText
    lateinit var editNumber2:EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editNumber1 = findViewById(R.id.editNumber1)
        editNumber2 = findViewById(R.id.editNumber2)
    }

    fun buttonClick(v:View){
        var ans = 0.0

        val calculator = Calculator(
            editNumber1.text.toString().toDouble(),
            editNumber2.text.toString().toDouble()
        )

        when(v.id){
            R.id.btnAdd -> ans = calculator.add()
            R.id.btnSubstract -> ans = calculator.substract()
            R.id.btnMultiply -> ans = calculator.multiply()
            R.id.btnDivide -> ans = calculator.divide()
        }
        Toast.makeText(this, "Answer = $ans", Toast.LENGTH_LONG).show()
    }
}