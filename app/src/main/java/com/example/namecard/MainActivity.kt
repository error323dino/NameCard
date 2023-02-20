package com.example.namecard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

//Instance Name: Type
// intCount : Integer
class MainActivity : AppCompatActivity() {
    //onCreate = main() function
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Load UI to memory
        //R =resources class
        setContentView(R.layout.activity_main)

        //Declare variable.  val = value, var = variable
        val textViewName : TextView = findViewById(R.id.nameApp)
        val imageViewQR : ImageView = findViewById(R.id.qrCode)
        val buttonShow : Button = findViewById(R.id.showButton)
        val buttonHide : Button = findViewById(R.id.hideButton)

        buttonShow.setOnClickListener{
            textViewName.visibility = View.VISIBLE
            imageViewQR.visibility = View.VISIBLE
        }
        buttonHide.setOnClickListener {
            textViewName.visibility = View.INVISIBLE
            imageViewQR.visibility = View.INVISIBLE
        }

    }
}