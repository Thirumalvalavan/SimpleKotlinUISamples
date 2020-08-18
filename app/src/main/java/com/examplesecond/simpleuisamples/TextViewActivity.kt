package com.examplesecond.simpleuisamples

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.util.Log
import android.view.View
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_text_view.*

class TextViewActivity : AppCompatActivity() {
    val TAG = "MainActivity"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_text_view)


        //set textView to clickable
        textView.isClickable = true
//        textView.setOnClickListener{ textView.text = resources.getString(R.string.app_name) }

//        textView.setOnClickListener { view ->
//            textView.text = resources.getString(R.string.app_name)
//            Log.d("View id is", "" + view.id)
//            Log.d("New text", "New text")
//        }

        textView.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                textView.text = resources.getString(R.string.app_name)
                Log.d("View id is", "" + v?.id)
                Log.d("New text", "New text")
            }
        })


        textViewClickMe.setOnClickListener { textViewClickMe.setTextColor(Color.WHITE) }

        textViewEllipsize.ellipsize = TextUtils.TruncateAt.MARQUEE
        textViewEllipsize.setHorizontallyScrolling(true)
        textViewEllipsize.marqueeRepeatLimit = -1
        textViewEllipsize.isSelected = true

        val mipMapDrawable = ContextCompat.getDrawable(this, R.mipmap.ic_launcher)
        textViewOpacity.setCompoundDrawablesWithIntrinsicBounds(mipMapDrawable,null,mipMapDrawable,null)

    }
}