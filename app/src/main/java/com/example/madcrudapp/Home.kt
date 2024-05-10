package com.example.madcrudapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class Home : AppCompatActivity() {
    private val handler = Handler()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        handler.postDelayed({
            val intent = Intent(this, AddNoteActivity::class.java)
            startActivity(intent)
            finish()
        }, 2000L)
    }
}