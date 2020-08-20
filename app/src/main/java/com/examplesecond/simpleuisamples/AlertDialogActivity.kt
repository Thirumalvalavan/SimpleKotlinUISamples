package com.examplesecond.simpleuisamples

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_alert_dialog.*

class AlertDialogActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alert_dialog)


        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            //set title for alert dialog
            builder.setTitle(R.string.dialogTitle)
            //set message for alert dialog
            builder.setMessage(R.string.dialogMessage)
            builder.setIcon(android.R.drawable.ic_dialog_alert)

            //performing positive action
            builder.setPositiveButton("Yes"){dialogInterface, which ->
                Toast.makeText(applicationContext,"clicked yes", Toast.LENGTH_LONG).show()
            }
            //performing cancel action
            builder.setNeutralButton("Cancel"){dialogInterface , which ->
                Toast.makeText(applicationContext,"clicked cancel\n operation cancel",Toast.LENGTH_LONG).show()
            }
            //performing negative action
            builder.setNegativeButton("No"){dialogInterface, which ->
                Toast.makeText(applicationContext,"clicked No",Toast.LENGTH_LONG).show()
            }
            // Create the AlertDialog
            val alertDialog: AlertDialog = builder.create()
            // Set other dialog properties
            alertDialog.setCancelable(false)
            alertDialog.show()
        }



        // custom dialog button
        customDialogButton.setOnClickListener {

            val dialog = Dialog(this)
            dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
            dialog.setCancelable(false)

            dialog.setContentView(R.layout.custom_dialog)

            val customTitle = dialog.findViewById(R.id.customDialogTitleTextView) as TextView
            customTitle.text = "Custom dialog Title"

            val customBody = dialog.findViewById<TextView>(R.id.customDialogBodyTextView)
            customBody.text = "custom dialog body"


            val okBtn = dialog.findViewById(R.id.customDialogOkButton) as Button
            okBtn.setOnClickListener {
                Toast.makeText(this@AlertDialogActivity, "Ok Button Clicked!!", Toast.LENGTH_LONG).show()
                dialog.dismiss()
            }

            val cancelBtn = dialog.findViewById<Button>(R.id.customDialogCancelButton)
            cancelBtn.setOnClickListener {
                Toast.makeText(this@AlertDialogActivity, "Cancel Button Clicked!!", Toast.LENGTH_LONG).show()
                dialog.dismiss()
            }

            dialog.show()

        }


    }
}
