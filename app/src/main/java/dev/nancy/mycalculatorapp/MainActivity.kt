package dev.nancy.mycalculatorapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Telephony
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    lateinit var tilfirstNumber: TextInputLayout
    lateinit var etfirstNumber: TextInputEditText
    lateinit var tilsecondNumber: TextInputLayout
    lateinit var etsecondNumber: TextInputEditText
    lateinit var btnAdd: Button
    lateinit var btnSubtract: Button
    lateinit var btnModulus: Button
    lateinit var btnDivision: Button
    lateinit var tvResult: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        tilfirstNumber = findViewById(R.id.tilfirstNumber)
        etfirstNumber = findViewById(R.id.etfirstNumber)
        tilsecondNumber = findViewById(R.id.tilsecondNumber)
        etsecondNumber = findViewById(R.id.etsecondNumber)
        btnAdd = findViewById(R.id.btnAdd)
        btnSubtract = findViewById(R.id.btnSubtract)
        btnModulus = findViewById(R.id.btnModulus)
        btnDivision = findViewById(R.id.btnDivision)
        tvResult = findViewById(R.id.tvResult)
        Calculate()
    }

    fun Calculate() {
        tvResult.setOnClickListener {
            var etfirstNumber: Int
            var etsecondNumber: Int
//            Add=etfirstNumber + etsecondNumber
        }
        btnSubtract.setOnClickListener {
            var etfirstNumber: Int
            var etsecondNumber: Int
        }
        btnModulus.setOnClickListener {
            var etfirstNumber: Int
            var etsecondNumber: Int
        }
        btnDivision.setOnClickListener {
            var etfirstNumber: Int
            var etsecondNumber: Int
        }
        tvResult.text.toString()
        Validate()
    }

    fun Validate() {
        tilfirstNumber.error = null
        tilsecondNumber.error = null
        if (etfirstNumber.text.isNullOrBlank()){
            tilfirstNumber.error="first number is required"
        }
        if (etsecondNumber.text.isNullOrBlank()){
            tilsecondNumber.error="second number is required"
        }
    }
}



