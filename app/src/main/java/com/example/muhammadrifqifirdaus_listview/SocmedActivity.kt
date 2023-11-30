package com.example.muhammadrifqifirdaus_listview

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat
import com.example.muhammadrifqifirdaus_listview.Galaxy23Activity
import com.example.muhammadrifqifirdaus_listview.Iphone11Activity
import com.example.muhammadrifqifirdaus_listview.Oppo54Activity
import com.example.muhammadrifqifirdaus_listview.R
import com.example.muhammadrifqifirdaus_listview.listAdapter

class SocmedActivity  : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.utama)

        WindowCompat.setDecorFitsSystemWindows(
            window, false
        )


        // siapin variable array yang mempunyai nilai
        val namanama = arrayOf<String>(
            "Iphone",
            "Samsung",
            "Oppo",
            "Infinix",
            "Redmi",
            "Itel",
            "Vivo",
            "Poco"
        )

        val desc = arrayOf<String>(
            "11",
            "Galaxy S23",
            "A54",
            "GT 10 Pro",
            "Note 10",
            "S 23",
            "Iqoo Z7",
            "M3 Pro"
        )

        val fotofoto = arrayOf<Int>(
            R.drawable.iphone11,
            R.drawable.s23,
            R.drawable.oppo154,
            R.drawable.infinix10,
            R.drawable.redmi,
            R.drawable.itels23,
            R.drawable.z7,
            R.drawable.m3pro


        )

        // definisi list view
        val list = findViewById<ListView>(R.id.listview)
        list.adapter = listAdapter(this, namanama, fotofoto, desc)
        list.setOnItemClickListener { adapterView, view, position, id ->

            if (position == 0) {
                // Handle action for position 1 (open web preview in WebViewActivity)
                val intent = Intent(this,Iphone11Activity::class.java)
                startActivity(intent)
            }

            if (position == 1) {
                // Handle action for position 1 (open web preview in WebViewActivity)
                val intent = Intent(this, Galaxy23Activity::class.java)
                startActivity(intent)
            }

            if (position == 2) {
                // Handle action for position 1 (open web preview in WebViewActivity)
                val intent = Intent(this, Oppo54Activity::class.java)
                startActivity(intent)
            }

            if (position == 3) {
                // Handle action for position 1 (open web preview in WebViewActivity)
                val intent = Intent(this, Infinix10Activity::class.java)
                startActivity(intent)
            }

            if (position == 4) {
                // Handle action for position 1 (open web preview in WebViewActivity)
                val intent = Intent(this, Redmi10Activity::class.java)
                startActivity(intent)
            }

            if (position == 5) {
                // Handle action for position 1 (open web preview in WebViewActivity)
                val intent = Intent(this, Itel23Activity::class.java)
                startActivity(intent)
            }

            if (position == 6) {
                // Handle action for position 1 (open web preview in WebViewActivity)
                val intent = Intent(this, Vivoz7Activity::class.java)
                startActivity(intent)
            }

            if (position == 7) {
                // Handle action for position 1 (open web preview in WebViewActivity)
                val intent = Intent(this,Pocom3Activity::class.java)
                startActivity(intent)
            }
        }
    }}