package com.example.birthdaygreet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_birthday_greet.*
import kotlinx.android.synthetic.main.activity_main.*

class BirthdayGreetActivity : AppCompatActivity() {
    companion object{
        const val NAME_EXXTRA :String =""
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greet)
        val name = intent.getStringExtra(NAME_EXXTRA)
        Birthdaygreet.text = "Happy Birthday \n $name"
    }
}