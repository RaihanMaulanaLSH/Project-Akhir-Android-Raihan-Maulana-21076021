package com.example.ta_raihanmaulana_crc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class cmview : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cmview)

        val btnNew = findViewById<Button>(R.id.buttonAddNewComic)

        btnNew.setOnClickListener {
            val intent = Intent(this, Form::class.java)
            startActivity(intent)
        }
    }
}