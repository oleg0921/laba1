package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider


class MainActivity : AppCompatActivity() {
    private lateinit var viewModel:MainActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProvider(this)[MainActivityViewModel::class.java]
        val textView = findViewById<TextView>(R.id.text_id)
        val button = findViewById<Button>(R.id.button_id)

        textView.text = viewModel.text

        button.setOnClickListener {
            Toast.makeText(applicationContext, "Text when you click on button", Toast.LENGTH_SHORT).show()
        }
    }
}