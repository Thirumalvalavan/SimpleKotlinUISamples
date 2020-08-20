package com.examplesecond.simpleuisamples

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Switch
import android.widget.Toast

class SwitchActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_switch)

        val sw1 = findViewById<Switch>(R.id.switch1)
        sw1?.setOnCheckedChangeListener { _, isChecked ->
            val message = if (isChecked) "Switch1:ON" else "Switch1:OFF"
            Toast.makeText(this@SwitchActivity, message, Toast.LENGTH_SHORT).show()
        }

        val sw2 = findViewById<Switch>(R.id.switch2)
        sw2?.setOnCheckedChangeListener { _, isChecked ->
            val message = if (isChecked) "Switch2:ON" else "Switch2:OFF"
            Toast.makeText(this@SwitchActivity, message, Toast.LENGTH_SHORT).show()
        }
    }
}

