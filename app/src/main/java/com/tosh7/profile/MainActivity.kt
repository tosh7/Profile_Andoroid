package com.tosh7.profile

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        my_image_view.visibility = View.INVISIBLE
//        my_text.visibility = View.INVISIBLE
//
//        my_name_button.setOnClickListener {
//            my_image_view.visibility = View.VISIBLE
//            my_text.visibility = View.VISIBLE
//        }

        my_name_button.setOnClickListener {
            my_name_button.setBackgroundColor(Color.parseColor( "#29abe2"))
            my_like_sports_button.setBackgroundColor(Color.parseColor("#929292"))
            my_like_food_button.setBackgroundColor(Color.parseColor("#929292"))
            my_like_hobby_button.setBackgroundColor(Color.parseColor("#929292"))
            my_image_view.setImageResource(R.drawable.tobisuke)
            my_text.text = "とびすけ"
        }

        my_like_sports_button.setOnClickListener {
            my_name_button.setBackgroundColor(Color.parseColor( "#929292"))
            my_like_sports_button.setBackgroundColor(Color.parseColor("#29abe2"))
            my_like_food_button.setBackgroundColor(Color.parseColor("#929292"))
            my_like_hobby_button.setBackgroundColor(Color.parseColor("#929292"))
            my_image_view.setImageResource(R.drawable.soccer)
            my_text.text = "サッカー"
        }

        my_like_food_button.setOnClickListener {
            my_name_button.setBackgroundColor(Color.parseColor( "#929292"))
            my_like_sports_button.setBackgroundColor(Color.parseColor("#929292"))
            my_like_food_button.setBackgroundColor(Color.parseColor("#29abe2"))
            my_like_hobby_button.setBackgroundColor(Color.parseColor("#929292"))
            my_image_view.setImageResource(R.drawable.sushi)
            my_text.text = "寿司"
        }

       my_like_hobby_button.setOnClickListener {
            my_name_button.setBackgroundColor(Color.parseColor( "#929292"))
            my_like_sports_button.setBackgroundColor(Color.parseColor("#929292"))
            my_like_food_button.setBackgroundColor(Color.parseColor("#929292"))
            my_like_hobby_button.setBackgroundColor(Color.parseColor("#29abe2"))
            my_image_view.setImageResource(R.drawable.dance)
            my_text.text = "ダンス"
        }
    }
}
