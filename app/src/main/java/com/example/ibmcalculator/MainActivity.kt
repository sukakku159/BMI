package com.example.ibmcalculator

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.SeekBar
import android.widget.SeekBar.OnSeekBarChangeListener
import androidx.constraintlayout.widget.ConstraintLayout
import java.util.stream.Collectors.mapping
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    private lateinit var btnMale : ConstraintLayout
    private lateinit var btnFemale : ConstraintLayout
    private lateinit var skBar: SeekBar
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
        seek_bar.setOnSeekBarChangeListener(object : OnSeekBarChangeListener) {

        }

        }


        private fun mapping() {
        btnMale = findViewById(R.id.male)
        btnFemale = findViewById(R.id.female)
        skBar = findViewById(R.id.)

    }
}