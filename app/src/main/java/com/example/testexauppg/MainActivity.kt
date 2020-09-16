package com.example.testexauppg

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MotionEvent
import android.widget.ImageView


class MainActivity : AppCompatActivity() {
    lateinit var giraffeImage: ImageView
    lateinit var hippoImage: ImageView
    lateinit var zebraImage: ImageView
    lateinit var horseImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        giraffeImage = findViewById<ImageView>(R.id.giraffeImage)
        hippoImage = findViewById<ImageView>(R.id.hippoImage)
        zebraImage = findViewById<ImageView>(R.id.zebraImage)
        horseImage = findViewById<ImageView>(R.id.horseImage)

        firstQuestion()

    }

    fun firstQuestion(){
        zebraImage.setOnTouchListener { v, event ->
            when(event?.action){
                MotionEvent.ACTION_UP -> {
                    Log.d("!!!","bra")

                }
                MotionEvent.ACTION_DOWN -> {

                }
            }
            true
        }
    }
    fun secondQuestion(){
    //hej

    }

}