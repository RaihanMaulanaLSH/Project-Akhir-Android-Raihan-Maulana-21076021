package com.example.ta_raihanmaulana_crc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)


        val btnSignUpActivity = findViewById<Button>(R.id.btn_signup)

        btnSignUpActivity.setOnClickListener {
            val intent = Intent(this, hm::class.java)
            startActivity(intent)

        }



        fun register(){

        }

    }





}