package com.example.ta_raihanmaulana_crc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Form : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form)

        val btnAdd = findViewById<Button>(R.id.buttonAddComic)

        btnAdd.setOnClickListener {
            val intent = Intent(this, cmview::class.java)
            startActivity(intent)
        }
    }
}