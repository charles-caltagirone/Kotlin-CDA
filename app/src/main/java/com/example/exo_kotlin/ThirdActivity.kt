package com.example.exo_kotlin

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_third)

        var validate = intent.action
        Log.i("Second activity", "action: $validate")
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

        Log.i(
            "Action Activity",
            "action: $validate, isUserViewer: $isUserViewer, name: $name, job: $job, company: $company"
        )

    }
}