package com.example.myfirstapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        val button = findViewById<Button>(R.id.button)
        val button4=findViewById<Button>(R.id.button4)
        val button5=findViewById<Button>(R.id.button5)

        button.setOnClickListener() {


           var toast= Toast.makeText(applicationContext, "Signup page", Toast.LENGTH_LONG)
            toast.show()

            intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)

        }


        button4.setOnClickListener(){

            intent=Intent(this,ChangeBackgroundActivity::class.java)
            startActivity(intent)

        }

        button5.setOnClickListener(){

            intent=Intent(this,ImageViewToggle::class.java)
            startActivity(intent)

        }



    }
}