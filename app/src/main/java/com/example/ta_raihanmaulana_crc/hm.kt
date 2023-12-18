package com.example.ta_raihanmaulana_crc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class hm : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hm)

        val cardView = findViewById<CardView>(R.id.rounded_box)
        cardView.setOnClickListener { // Intent untuk membuka aktivitas atau fragmen yang diinginkan
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }

        val cardView2 = findViewById<CardView>(R.id.rounded1_box)
        cardView2.setOnClickListener { // Intent untuk membuka aktivitas atau fragmen yang diinginkan
            val intent = Intent(this, yrcom::class.java)
            startActivity(intent)
        }

        val cardView3 = findViewById<CardView>(R.id.rounded2_box)
        cardView3.setOnClickListener { // Intent untuk membuka aktivitas atau fragmen yang diinginkan
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }

        val cardView4 = findViewById<CardView>(R.id.rounded3_box)
        cardView4.setOnClickListener { // Intent untuk membuka aktivitas atau fragmen yang diinginkan
            val intent = Intent(this, yrprofil::class.java)
            startActivity(intent)
        }
    }
}