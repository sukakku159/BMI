import com.example.ibmcalculator.R

+package com.example.ibmcalculator

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.SeekBar
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import java.util.stream.Collectors.mapping
import kotlin.math.log
import android.widget.SeekBar.OnSeekBarChangeListener as OnSeekBarChangeListener1

class MainActivity : AppCompatActivity() {
    private lateinit var btnMale : ConstraintLayout
    private lateinit var btnFemale : ConstraintLayout
    private lateinit var skBar: SeekBar
    private lateinit var txVolume : TextView
    private lateinit var btnWeightPlus: Button
    private lateinit var btnWeightMinus: Button
    private lateinit var btnAgePlus: Button
    private lateinit var btnAgeMinus: Button
    private lateinit var valWeight : TextView
    private lateinit var valAge : TextView
    private lateinit var btnCalculate : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mapping()
        btnMale.setOnClickListener() {
            btnMale.isSelected = true
            btnFemale.isSelected = false
        }
        btnFemale.setOnClickListener() {
            btnFemale.isSelected = true
            btnMale.isSelected = false
        }
        skBar.setOnSeekBarChangeListener(object : OnSeekBarChangeListener1 {

            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                txVolume.text = progress.toString()
            }
            override fun onStartTrackingTouch(seekBar: SeekBar?) {
            }
            override fun onStopTrackingTouch(seekBar: SeekBar?) {
            }
        })
        var valueWeight = valWeight.text.toString().toInt()
        var valueAge = valAge.text.toString().toInt()
        btnWeightPlus.setOnClickListener() {
           valueWeight ++
        }
        btnWeightMinus.setOnClickListener() {
            valueWeight --
        }
        btnAgePlus.setOnClickListener() {
            valueAge ++
        }
        btnAgeMinus.setOnClickListener() {
            valueAge --
        }



        }



        private fun mapping() {
        btnMale = findViewById(R.id.male)
        btnFemale = findViewById(R.id.female)
        skBar = findViewById(R.id.seek_bar)
        txVolume = findViewById(R.id.text_volume)
        btnAgeMinus = findViewById(R.id.btn_age_minus)
        btnAgePlus = findViewById(R.id.btn_age_plus)
        btnWeightMinus = findViewById(R.id.btn_weight_minus)
        btnWeightPlus = findViewById(R.id.btn_weight_plus)
        valWeight = findViewById(R.id.text_weight)
        valAge = findViewById(R.id.text_age)
        btnCalculate = findViewById(R.id.btn_calculate)

    }
}