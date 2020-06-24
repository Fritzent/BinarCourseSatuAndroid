package com.example.binarcoursepengenalan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.ActionBar

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //ini untuk ngehide actionbar default dari android studio
        supportActionBar?.hide()

        //ini untuk ngehubungin xml ke kotlinnya
        val qoutesText = findViewById<TextView>(R.id.QuotesText);
        val qoutesPerson = findViewById<TextView>(R.id.QuotesPerson);

        //ini buat ngatur textview nya
        qoutesText.setText("\"Action is the foundational key to all success.\"")
        qoutesPerson.setText("~Pablo Picasso")

        fun newFunction(){
            //ini new function
            //ini cari untuk membuat sebuah function baru di kotlin
        }

        //ini comment ku

    }

    //nyoba nambah gan
    
}
