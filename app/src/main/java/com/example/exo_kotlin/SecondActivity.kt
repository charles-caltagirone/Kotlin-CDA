package com.example.exo_kotlin

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second)

        var register = intent.action
        Log.i("Second activity", "action: $register")
        val isUserViewer = intent.hasCategory("user")
        val extras: Bundle? = intent.extras
        val name = extras?.getString("name")
        val job = extras?.getString("job")
        val company = extras?.getString("company")

        val nameTextView = findViewById<TextView>(R.id.name)
        val jobTextView = findViewById<TextView>(R.id.job)
        val companyTextView = findViewById<TextView>(R.id.company)

        nameTextView?.text = name
        jobTextView?.text = job
        companyTextView?.text = company


        val btnValidate = findViewById<Button>(R.id.validateBtn)
        btnValidate.setOnClickListener {
            val intent = Intent(this, ThirdActivity::class.java)

            intent.action = Intent.ACTION_VIEW
            intent.addCategory("user")
            intent.putExtra("name", name)
            intent.putExtra("job", job)
            intent.putExtra("company", company)
            startActivity(intent)
        }

        Log.i(
            "Action Activity",
            "action: $register, isUserViewer: $isUserViewer, name: $name, job: $job, company: $company"
        )

    }
}