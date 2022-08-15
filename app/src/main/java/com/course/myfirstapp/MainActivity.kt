package com.course.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClickme = findViewById<Button>(R.id.mybutton)
        val textContent = findViewById<TextView>(R.id.textView)
        var timesClicked = 0
        btnClickme.setOnClickListener {
            timesClicked += 1
            textContent.text = timesClicked.toString()
            Toast.makeText(this, "IUUUHUUUUUUUl", Toast.LENGTH_LONG).show()
        }

    }
}