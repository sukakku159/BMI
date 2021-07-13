package com.example.ibmcalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class activity_result : AppCompatActivity() {
    private lateinit var text_state : TextView
    private lateinit var text_bmi : TextView
    private lateinit var text_description : TextView
    private lateinit var btn_recalculate : Button
    private lateinit var btn_back : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        text_state = findViewById(R.id.result_state)
        text_bmi = findViewById(R.id.result_bmi)
        text_description = findViewById(R.id.result_description)
        btn_recalculate = findViewById(R.id.btn_recalculate)
        btn_back = findViewById(R.id.btn_back)
        val ss:String? = intent.getStringExtra("data")
        val _BMI = ss!!.toFloat()
        when  {
            _BMI < 18.5 -> {

                text_bmi.text = ss
                text_description.text = "Average associated risk"
            }
            _BMI >= 18.5 && _BMI <= 25  -> {
                text_state.text = "Normal weight"
                text_bmi.text = ss
                text_description.text = "Normal associated risk"
            }
            _BMI > 25 && _BMI <= 30 -> {
                text_state.text = "Overweight"
                text_bmi.text = ss
                text_description.text = "Average associated risk"
            }
            _BMI > 30 && _BMI <= 40 -> {
                text_state.text = "Obesity"
                text_bmi.text = ss
                text_description.text = "Important associated risk"
            }
            _BMI > 40 -> {
                text_state.text = "Morbid Obesity"
                text_bmi.text = ss
                text_description.text = "Severe associated risk"
            }

        }
        btn_recalculate.setOnClickListener() {

                startActivity(Intent(this, MainActivity ::class.java ))
        }
        btn_back.setOnClickListener() {
            finish()
        }


    }
}