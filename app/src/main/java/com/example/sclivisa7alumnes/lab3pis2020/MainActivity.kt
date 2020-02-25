package com.example.sclivisa7alumnes.lab3pis2020

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun action1(view: View) {
        val intent = Intent(this, Act2::class.java)
        //start you next activity
        startActivity(intent)
    }
}
