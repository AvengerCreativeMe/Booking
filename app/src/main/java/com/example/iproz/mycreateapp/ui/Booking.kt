package com.example.iproz.mycreateapp.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.iproz.mycreateapp.R

class Booking : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_booking)

        Toast.makeText(this, "HelloWorld", Toast.LENGTH_LONG).show()
    }
}
