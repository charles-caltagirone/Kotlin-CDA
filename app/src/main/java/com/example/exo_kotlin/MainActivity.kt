package com.example.exo_kotlin

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val btnRegister = findViewById<Button>(R.id.registerBtn)
        btnRegister.setOnClickListener {

            val nameEditText = findViewById<EditText>(R.id.name)
            val name = nameEditText.text.toString()
            val jobEditText = findViewById<EditText>(R.id.job)
            val job = jobEditText.text.toString()
            val companyEditText = findViewById<EditText>(R.id.company)
            val company = companyEditText.text.toString()

            val intent = Intent(this, SecondActivity::class.java)

            intent.action = Intent.ACTION_VIEW
            intent.addCategory("user")
            intent.putExtra("name", name)
            intent.putExtra("job", job)
            intent.putExtra("company", company)
            startActivity(intent)
        }

    }
}