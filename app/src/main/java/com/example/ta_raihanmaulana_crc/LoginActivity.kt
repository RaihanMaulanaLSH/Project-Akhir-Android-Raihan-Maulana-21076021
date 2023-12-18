package com.example.ta_raihanmaulana_crc


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val btnLoginActivity = findViewById<Button>(R.id.btn_login)

        btnLoginActivity.setOnClickListener {
            val intent = Intent(this, hm::class.java)
            startActivity(intent)
        }
    }
}