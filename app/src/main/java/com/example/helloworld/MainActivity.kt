package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val clickRed=findViewById<TextView>(R.id.clickButton2)
        val clickBlue=findViewById<TextView>(R.id.clickButton)
        val clickGreen=findViewById<TextView>(R.id.clickButton1)
        val clickResult=findViewById<TextView>(R.id.clickCountView)

        clickRed.setOnClickListener{
            clickResult.text="Red was Clicked"
        }
        clickBlue.setOnClickListener{
            clickResult.text="Blue was Clicked"
        }
        clickGreen.setOnClickListener{
            clickResult.text="Green was Clicked"
        }




    }
}