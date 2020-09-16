package com.example.testexauppg

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MotionEvent
import android.widget.ImageView


class MainActivity : AppCompatActivity() {

    lateinit var zebraImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        zebraImage = findViewById<ImageView>(R.id.zebraImage)

        firstQuestion()

    }

    fun firstQuestion(){
        zebraImage.setOnTouchListener { v, event ->
            when(event?.action){
                MotionEvent.ACTION_DOWN -> {
                    Log.d("!!!","Up")


                }
                MotionEvent.ACTION_UP -> {
                    Log.d("!!!", "Down")
                }
            }
            true
        }
    }
    fun secondQuestion(){

    }

}