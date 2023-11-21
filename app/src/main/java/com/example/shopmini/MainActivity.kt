package com.example.shopmini

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val clickRegister = findViewById<Button>(R.id.loginbtn)
        clickRegister.setOnClickListener {
            val intent = Intent(this, Registration::class.java)
            startActivity(intent)
        }
        val clickLogin = findViewById<Button>(R.id.loginbtn1)
        clickLogin.setOnClickListener {
            val intent = Intent(this, tools::class.java)
            startActivity(intent)
        }
    }
}