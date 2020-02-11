package com.example.myapplication

import android.os.Bundle
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


        val username = intent.getStringExtra("username")
        val password = intent.getStringExtra("password")
        val name = intent.getStringExtra("name")
        val phone = intent.getStringExtra("phone")
        val gender = intent.getStringExtra("gender")

        val textView = findViewById<TextView>(R.id.result)

        textView.text = "Username : "+username+"\nPassword : "+password+"\nName : "+name+"\nPhone : "+phone+"\nGender : "+gender
        }
    }

