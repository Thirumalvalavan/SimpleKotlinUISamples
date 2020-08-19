package com.examplesecond.simpleuisamples

import android.app.DatePickerDialog
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_date_picker.*
import java.util.*

class DatePickerActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_date_picker)

        // spinner view. But below listener from Android O onwards
        spinnerDatePicker.setOnDateChangedListener { view, year, monthOfYear, dayOfMonth ->
            val month = monthOfYear + 1
            val msg = "You Selected: $dayOfMonth/$month/$year"
            spinnerDateTextView.text = msg
        }


        // calender view.
        calendarDatePicker.setOnDateChangedListener { view, year, monthOfYear, dayOfMonth ->
            val month = monthOfYear + 1
            val msg = "You Selected: $dayOfMonth/$month/$year"
            clockDateTextView.text = msg
        }


        // date dialog
        val dateDialogListener = DatePickerDialog.OnDateSetListener { view, year, month, dayOfMonth ->
            val finalMonth = month + 1
            val dateText = "Selected date is $dayOfMonth-$finalMonth-$year"
            dialogTimeTextView.text = dateText
        }

        timerDialogButton.setOnClickListener {
            var cal = Calendar.getInstance()
            DatePickerDialog(this@DatePickerActivity, dateDialogListener,
                // set DatePickerDialog to point to today's date when it loads up
                cal.get(Calendar.YEAR),
                cal.get(Calendar.MONTH),
                cal.get(Calendar.DAY_OF_MONTH)).show()
        }





    }
}