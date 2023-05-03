package com.example.viralfuture

import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView : TextView = findViewById<TextView>(R.id.campo)
        var face : Typeface = Typeface.createFromAsset(assets, "fonts/TangoSans.ttf")
        textView.typeface = face


    }
}