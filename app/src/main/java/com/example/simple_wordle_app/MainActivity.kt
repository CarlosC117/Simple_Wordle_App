package com.example.simple_wordle_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var guessButton: Button
    lateinit var guessText: EditText
    lateinit var first: TextView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        guessText = findViewById(R.id.guessText)
        guessButton = findViewById(R.id.guessButton)
        first = findViewById(R.id.one)

        guessButton.setOnClickListener {
            var word = guessText.text
            first.text = word
            guessText.setText("")
        }

    }
}