package com.example.sclivisa7alumnes.lab3pis2020

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Act3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_act3)
    }

    fun showWebPage(view: View){
        val intent2 = Intent(Intent.ACTION_VIEW, Uri.parse("https//:www.google.es"))
        startActivity(intent2)
    }
}
