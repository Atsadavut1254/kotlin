package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var rdb = " "
        val Rrbg = findViewById<RadioGroup>(R.id.radio1)
        val btn = findViewById<Button>(R.id.button)

        final CheckBox checkBox = (CheckBox) findViewById(R.id.checkbox_id);
        if (checkBox.isChecked()) {
            checkBox.setChecked(false);
        }
        
        Rrbg.setOnCheckedChangeListener { group, checkedId ->
            rdb = findViewById<RadioButton>(checkedId).text.toString()
        }
        btn.setOnClickListener {
            val username = findViewById<EditText>(R.id.editText1).text.toString()
            val password = findViewById<EditText>(R.id.editText2).text.toString()
            val name = findViewById<EditText>(R.id.editText3).text.toString()
            val phone = findViewById<EditText>(R.id.editText4).text.toString()

            val intent = Intent(this, Main2Activity::class.java)
            intent.putExtra("username", username)
            intent.putExtra("password", password)
            intent.putExtra("name", name)
            intent.putExtra("phone", phone)
            intent.putExtra("gender", rdb)
            startActivity(intent)
        }


    }
}
