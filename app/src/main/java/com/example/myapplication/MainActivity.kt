package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showToast("kuku")
    }

    fun showToast(message: String)
    {
        Toast.makeText(this,message,Toast.LENGTH_SHORT).show()
        //testcxvcv
    }

}