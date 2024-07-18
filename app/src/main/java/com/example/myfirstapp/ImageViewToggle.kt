package com.example.myfirstapp

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import android.widget.ToggleButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ImageViewToggle : AppCompatActivity() {
    lateinit var image:ImageView
    lateinit var button:Button

    lateinit var image1:ImageView
    lateinit var toggle:ToggleButton
    lateinit var result: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_imageview)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        image=findViewById<ImageView>(R.id.imageView)


         button=findViewById(R.id.button3)

        button.setOnClickListener()
        {
            var toast= Toast.makeText(applicationContext, "Image changed", Toast.LENGTH_LONG)
            toast.show()

            image.setImageResource(R.drawable.img_1)
        }


        //Image toggle
    image1=findViewById(R.id.imageView2)
        toggle=findViewById(R.id.toggleButton)
        result=findViewById(R.id.textView5)

        toggle.setOnCheckedChangeListener { compoundButton, isChecked ->

            if(isChecked)
            {
                image1.visibility= View.INVISIBLE
                result.text="Image is invisible"
            }
            else{
                image1.visibility= View.VISIBLE
                result.text="Image is visible"
            }



        }


    }
}