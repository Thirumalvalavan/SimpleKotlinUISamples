package com.examplesecond.simpleuisamples

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RatingBar
import kotlinx.android.synthetic.main.activity_rating_bar.*

class RatingBarActivity : AppCompatActivity(), RatingBar.OnRatingBarChangeListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rating_bar)

        ratingBar1.onRatingBarChangeListener = this
        ratingBar2.onRatingBarChangeListener = this
        ratingBar3.onRatingBarChangeListener = this
        ratingBar4.onRatingBarChangeListener = this
        ratingBar5.onRatingBarChangeListener = this
        ratingBar6.onRatingBarChangeListener = this
        ratingBar7.onRatingBarChangeListener = this
        ratingBar8.onRatingBarChangeListener = this
        ratingBar9.onRatingBarChangeListener = this
    }

    override fun onRatingChanged(p0: RatingBar?, p1: Float, p2: Boolean) {
        textView.text = "$p1"
    }
}