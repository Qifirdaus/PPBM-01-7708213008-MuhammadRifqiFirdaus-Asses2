package com.example.muhammadrifqifirdaus_listview

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class Galaxy23Activity  : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.galaxys23)
        val backBtn = findViewById<ImageView>(R.id.imageView2)
        backBtn.setOnClickListener {
            val intent = Intent(this, SocmedActivity::class.java)
            startActivity(intent)
            finish()
        }


    }}