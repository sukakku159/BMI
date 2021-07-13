package com.example.ibmcalculator


import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import androidx.constraintlayout.widget.ConstraintLayout
import java.text.Format
import android.widget.SeekBar.OnSeekBarChangeListener as OnSeekBarChangeListener1

class MainActivity : AppCompatActivity() {
    private lateinit var btnMale : ConstraintLayout
    private lateinit var btnFemale : ConstraintLayout
    private lateinit var skBar: SeekBar
    private lateinit var txVolume : TextView
    private lateinit var btnWeightPlus: ImageButton
    private lateinit var btnWeightMinus: ImageButton
    private lateinit var btnAgePlus: ImageButton
    private lateinit var btnAgeMinus: ImageButton
    private lateinit var valWeight : TextView
    private lateinit var valAge : TextView
    private lateinit var btnCalculate : Button
    private lateinit var testbmi : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mapping()

        valWeight
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



        val valueHeight = txVolume.text.toString().toFloat()
        var valueWeight = valWeight.text.toString().toFloat()
        var valueAge = valAge.text.toString().toFloat()
        txVolume.setOnClickListener() {
            Toast.makeText(this, "${txVolume.text}", Toast.LENGTH_SHORT).show()
        }
        valWeight.setOnClickListener() {
            Toast.makeText(this, "${valWeight.text}", Toast.LENGTH_SHORT).show()
        }
        valAge.setOnClickListener() {
            Toast.makeText(this, "${valAge.text}", Toast.LENGTH_SHORT).show()
        }
        btnWeightPlus.setOnClickListener() {
           valueWeight ++
           valWeight.text = valueWeight.toInt().toString()
        }
        btnWeightMinus.setOnClickListener() {
            valueWeight --
            valWeight.text = valueWeight.toInt().toString()
        }
        btnAgePlus.setOnClickListener() {
            valueAge ++
            valAge.text = valueAge.toInt().toString()
        }
        btnAgeMinus.setOnClickListener() {
            valueAge --
            valAge.text = valueAge.toInt().toString()
        }

        btnCalculate.setOnClickListener() {
            val i = Intent(this, activity_result :: class.java)
            val BMI= "%.1f".format(valueWeight/((valueHeight/100) * (valueHeight/100)))
            i.putExtra("data", BMI.toString())
            startActivity(i)
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
            valWeight = findViewById(R.id.val_weight)
            valAge = findViewById(R.id.val_age)
            btnCalculate = findViewById(R.id.btn_calculate)
            testbmi = findViewById(R.id.test_bmi)
        }


}