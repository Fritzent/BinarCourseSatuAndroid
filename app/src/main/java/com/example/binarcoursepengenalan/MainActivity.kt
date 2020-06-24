package com.example.binarcoursepengenalan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //ini untuk ngehide actionbar default dari android studio
        supportActionBar?.hide()

        //ini untuk ngehubungin xml ke kotlinnya
        val qoutesText = findViewById<TextView>(R.id.QuotesText)
        val qoutesPerson = findViewById<TextView>(R.id.QuotesPerson)

        //ini buat ngatur textview nya
        qoutesText.text = resources.getString(R.string.qoutes_text)
        qoutesPerson.text = resources.getString(R.string.qoutes_person)

        fun newFunction(){
            //ini new function
            //ini cari untuk membuat sebuah function baru di kotlin
        }

    }

    //nyoba nambah gan

    //nambah kedua

    // ini commentan ku coba bikin conflict ndra

    //ini comment fritz di branch branchDariRemote

    //nambah dari Andra di branch remote

    //tambah tag di master

}
