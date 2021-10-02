package com.example.birthdaygreet

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun createBirthdayCard(view: View) {
        val name = nameInput.editableText.toString()
        if (name.isEmpty()) {
            Toast.makeText(this, "name is empty", Toast.LENGTH_SHORT
            ).show()
        } else {
            val intent = Intent(this, BirthdayGreetActivity::class.java)
            intent.putExtra(BirthdayGreetActivity.NAME_EXXTRA, name)
            startActivity(intent)
        }
    }




}