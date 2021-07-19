package com.example.apk1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var text:TextView
    lateinit var btn:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        text=findViewById(R.id.id_text)
        btn=findViewById(R.id.id_btn)

        btn.setOnClickListener {
            text.text="Eu te amo <3"
        }
    }
}