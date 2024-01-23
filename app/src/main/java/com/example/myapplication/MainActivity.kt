package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var tv = findViewById<TextView>(R.id.tv1)
        tv.text ="Nie zostalem jescze klikniety"

        var btn = findViewById<Button>(R.id.btn1)
        btn.setOnClickListener{
            tv.text ="Kliknales button"
        }
    }
}