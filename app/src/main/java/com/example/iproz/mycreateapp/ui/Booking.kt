package com.example.iproz.mycreateapp.ui

import android.annotation.TargetApi
import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.icu.text.SimpleDateFormat
import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.annotation.RequiresApi
import android.view.Menu
import android.view.MenuItem
import android.widget.DatePicker
import android.widget.TimePicker
import android.widget.Toast
import com.example.iproz.mycreateapp.R
import kotlinx.android.synthetic.main.activity_booking.*
import kotlinx.android.synthetic.main.toolbar_layout_default.*
import java.util.*

class Booking : AppCompatActivity() {

    @TargetApi(Build.VERSION_CODES.N)
    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_booking)

        setSupportActionBar(toolbar)

        Toast.makeText(this, "HelloWorld", Toast.LENGTH_LONG).show()

        val c = Calendar.getInstance()

        et_date.setOnClickListener {

            val year = c.get(Calendar.YEAR)
            val month = c.get(Calendar.MONTH)
            val day = c.get(Calendar.DAY_OF_MONTH)

            val dpd = DatePickerDialog(
                this,
                DatePickerDialog.OnDateSetListener { view: DatePicker, mYear: Int, mMonth: Int, mDay: Int ->
                    et_date.setText("" + mDay + "/" + mMonth + "/" + mYear)
                }, year, month, day
            )

            dpd.show()
        }

        et_starting.setOnClickListener {

            val hour = c.get(Calendar.HOUR_OF_DAY)
            val minute = c.get(Calendar.MINUTE)

            val tpd = TimePickerDialog(
                this,
                TimePickerDialog.OnTimeSetListener { timePicker, hour, minute ->
                    c.set(Calendar.HOUR_OF_DAY, hour)
                    c.set(Calendar.MINUTE, minute)
                    et_starting.setText(SimpleDateFormat("HH:mm").format(c.time))
                }, hour,minute, true
            )

            tpd.show()
        }

        et_ending.setOnClickListener {

            val hour = c.get(Calendar.HOUR_OF_DAY)
            val minute = c.get(Calendar.MINUTE)

            val tpd = TimePickerDialog(
                this,
                TimePickerDialog.OnTimeSetListener { timePicker, hour, minute ->
                    c.set(Calendar.HOUR_OF_DAY, hour)
                    c.set(Calendar.MINUTE, minute)
                    et_ending.setText(SimpleDateFormat("HH:mm").format(c.time))
                }, hour,minute, true
            )

            tpd.show()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_back_page, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        if (item?.itemId == R.id.back_menu) {
            finish()
        }
        return super.onOptionsItemSelected(item)

    }
}