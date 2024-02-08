package com.example.appaprovechategui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    /** Called when the user taps the Migas button */
    fun sendMigas(view: View) {

        val intent = Intent(this, MigasActivity::class.java).apply {
        }
        startActivity(intent)
    }
    fun sendSalmorejo(view: View) {

        val intent = Intent(this, SalmorejoActivity::class.java).apply {
        }
        startActivity(intent)
    }
}