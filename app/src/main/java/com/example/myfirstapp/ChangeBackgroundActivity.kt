package com.example.myfirstapp

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ChangeBackgroundActivity : AppCompatActivity() {
    lateinit var layout:LinearLayout
    lateinit var radio1:RadioButton
    lateinit var radio2:RadioButton
    lateinit var radio3:RadioButton
    lateinit var button:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_change_background)

        layout=findViewById(R.id.LinearLayout)
        radio1=findViewById(R.id.radioButtonGreen)
        radio2=findViewById(R.id.radioButtonRed)
        radio3=findViewById(R.id.radioButtonYellow)
        button=findViewById(R.id.colorButton)




        button.setOnClickListener(){
            if(radio1.isChecked)
            {
                layout.setBackgroundColor(Color.GREEN)
            }
            else  if(radio2.isChecked)
            {
                layout.setBackgroundColor(Color.RED)
            }
            else  if(radio3.isChecked)
            {
                layout.setBackgroundColor(Color.YELLOW)
            }



        }
    }
}