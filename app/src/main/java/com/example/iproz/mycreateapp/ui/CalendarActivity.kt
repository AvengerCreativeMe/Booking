package com.example.iproz.mycreateapp.ui

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import com.example.iproz.mycreateapp.R
import kotlinx.android.synthetic.main.toolbar_layout_default.*

class CalendarActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calendar)

        setSupportActionBar(toolbar)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_booking,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        if (item?.itemId == R.id.book_menu){
            startActivity(Intent(this, Booking::class.java))
        }else if (item?.itemId == R.id.go_back_menu){
            finish()
        }

        return super.onOptionsItemSelected(item)
    }

}
