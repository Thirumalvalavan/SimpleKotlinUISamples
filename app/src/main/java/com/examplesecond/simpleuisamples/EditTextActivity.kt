package com.examplesecond.simpleuisamples

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.widget.Toast
import androidx.core.widget.addTextChangedListener
import kotlinx.android.synthetic.main.activity_edit_text.*;

class EditTextActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_text)


        firstEditText.setText("Hi hello")


        clickButton.setOnClickListener {

            if(firstEditText.text.isNotBlank()) {
                Toast.makeText(this, firstEditText.text, Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Empty", Toast.LENGTH_SHORT).show()
            }

            if(firstTextInputEditText.text!!.isNotBlank()) {

                Log.d("## EditTextActivity", firstTextInputEditText.text.toString())
            } else {
                Log.d("## EditTextActivity", "Empty")
            }
        }

        firstEditText.addTextChangedListener(object: TextWatcher {
            override fun afterTextChanged(p0: Editable?) {
                // Do something after text changed
            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                // Do something before text changed on EditText
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                // Do something on text changed in EditText
                // Display the EditText change text on TextView real time
                textView.text = firstEditText.text
            }
        })


    }

}