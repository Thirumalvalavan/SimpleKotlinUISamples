package com.examplesecond.simpleuisamples

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_auto_complete_text_view.*;

class AutoCompleteTextViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auto_complete_text_view)

        // Initialize a new array with elements
        val colors = arrayOf(
            "Red","Green","Blue","Maroon","Magenta",
            "Gold","GreenYellow"
        )


        // Initialize a new array adapter object
        val adapter = ArrayAdapter<String>(
            this, // Context
            android.R.layout.simple_dropdown_item_1line, // Layout
            colors // Array
        )


        // Set the AutoCompleteTextView adapter
        autoCompleteTextView.setAdapter(adapter)


        // Auto complete threshold
        // The minimum number of characters to type to show the drop down
        autoCompleteTextView.threshold = 1


        // Set an item click listener for auto complete text view
        autoCompleteTextView.onItemClickListener = AdapterView.OnItemClickListener{
                parent,view,position,id->
            val selectedItem = parent.getItemAtPosition(position).toString()
            // Display the clicked item using toast
            Toast.makeText(applicationContext,"Selected : $selectedItem",Toast.LENGTH_SHORT).show()
        }


        // Set a dismiss listener for auto complete text view
        autoCompleteTextView.setOnDismissListener {
            Toast.makeText(applicationContext,"Suggestion closed.",Toast.LENGTH_SHORT).show()
        }


        // Set a click listener for root layout
        clickButton.setOnClickListener{
            val text = autoCompleteTextView.text
            Toast.makeText(applicationContext,"Inputted : $text",Toast.LENGTH_SHORT).show()
        }


        // Set a focus change listener for auto complete text view
        autoCompleteTextView.onFocusChangeListener = View.OnFocusChangeListener{
                view, hasFocus ->
            if(hasFocus){
                // Display the suggestion dropdown on focus
                autoCompleteTextView.showDropDown()
            }
        }
    }


    }
