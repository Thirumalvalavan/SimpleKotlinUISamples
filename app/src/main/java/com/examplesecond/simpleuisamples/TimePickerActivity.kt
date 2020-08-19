package com.examplesecond.simpleuisamples

import android.app.TimePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_time_picker.*
import java.text.SimpleDateFormat
import java.util.*

class TimePickerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_time_picker)

        // first spinner time picker
        spinnerTimePicker.setOnTimeChangedListener { view, hourOfDay, minute ->
            var hour = hourOfDay
            var am_pm = ""
            // AM_PM decider logic
            when {
                hour == 0 -> {
                    hour += 12
                    am_pm = "AM"
                }
                hour == 12 -> am_pm = "PM"
                hour > 12 -> {
                    hour -= 12
                    am_pm = "PM"
                }
                else -> am_pm = "AM"
            }
            if (spinnerTimeTextView != null) {
                val hour = if (hour < 10) "0" + hour else hour
                val min = if (minute < 10) "0" + minute else minute
                // display format of time
                val msg = "Time is: $hour : $min $am_pm"
                spinnerTimeTextView.text = msg
            }
        }


        // second clock time picker
        clockTimePicker.setIs24HourView(true) // we can set 24 hours & 12 hours also.
        clockTimePicker.setOnTimeChangedListener { view, hourOfDay, minute ->
            clockTimeTextView.text = "Time is: $hourOfDay : $minute "
        }


        // Button click timer dialog
        timerDialogButton.setOnClickListener {
            val cal = Calendar.getInstance()
            val timeSetListener = TimePickerDialog.OnTimeSetListener { timePickerView, hour, minute ->
                cal.set(Calendar.HOUR_OF_DAY, hour)
                cal.set(Calendar.MINUTE, minute)
                spinnerTimeTextView.text = SimpleDateFormat("HH:mm").format(cal.time)
            }
            TimePickerDialog(this, timeSetListener, cal.get(Calendar.HOUR_OF_DAY), cal.get(Calendar.MINUTE), true).show()
        }


    }
}