package com.example.ta_raihanmaulana_crc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RelativeLayout
import androidx.cardview.widget.CardView

class yrcom : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_yrcom)

        val btnNew = findViewById<Button>(R.id.buttonAddNewComic)

        btnNew.setOnClickListener {
            val intent = Intent(this, Form::class.java)
            startActivity(intent)
        }

        val btnView = findViewById<RelativeLayout>(R.id.relativeLayoutComic1)

        btnView.setOnClickListener {
            val intent = Intent(this, cmview::class.java)
            startActivity(intent)
        }
    }
}