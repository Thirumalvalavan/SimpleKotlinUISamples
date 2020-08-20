package com.examplesecond.simpleuisamples

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textViewButton.setOnClickListener {
            val intent = Intent(this, TextViewActivity::class.java)
            startActivity(intent)
        }

        editTextViewButton.setOnClickListener {
            val intent = Intent(this, EditTextActivity::class.java)
            startActivity(intent)
        }

        autoCompleteTextViewButton.setOnClickListener {
            val intent = Intent(this, AutoCompleteTextViewActivity::class.java)
            startActivity(intent)
        }

        toggleButton.setOnClickListener {
            val intent = Intent(this, ToggleButtonActivity::class.java)
            startActivity(intent)
        }

        checkBoxButton.setOnClickListener {
            val intent = Intent(this, CheckBoxActivity::class.java)
            startActivity(intent)
        }

        radioButtonRadioGroup.setOnClickListener {
            val intent = Intent(this, RadioButtonActivity::class.java)
            startActivity(intent)
        }

        progressBarButton.setOnClickListener {
            val intent = Intent(this, ProgressBarActivity::class.java)
            startActivity(intent)
        }

        spinnerButton.setOnClickListener {
            val intent = Intent(this, SpinnerActivity::class.java)
            startActivity(intent)
        }

        timePickerButton.setOnClickListener {
            val intent = Intent(this, TimePickerActivity::class.java)
            startActivity(intent)
        }

        datePickerButton.setOnClickListener {
            val intent = Intent(this, DatePickerActivity::class.java)
            startActivity(intent)
        }

        seekBarButton.setOnClickListener {
            val intent = Intent(this, SeekBarActivity::class.java)
            startActivity(intent)
        }

        alertDialogButton.setOnClickListener {
            val intent = Intent(this, AlertDialogActivity::class.java)
            startActivity(intent)
        }

        switchButton.setOnClickListener {
            val intent = Intent(this, SwitchActivity::class.java)
            startActivity(intent)
        }

        ratingBarButton.setOnClickListener {
            val intent = Intent(this, RatingBarActivity::class.java)
            startActivity(intent)
        }
    }
}