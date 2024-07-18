package com.example.myfirstapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.CheckBox
import android.widget.Spinner
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity(),AdapterView.OnItemSelectedListener {

    lateinit var male: CheckBox
    lateinit var female:CheckBox
    lateinit var gender:TextView

    lateinit var result:TextView
    lateinit var spinner:Spinner

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        male=findViewById(R.id.check_box1)
        female= findViewById(R.id.check_box2)
        gender=findViewById(R.id.textView2)

        male.setOnClickListener() {
            if (male.isChecked) {
                 gender.setText("Your gender is Male")
                female.isChecked=false
            }
            else{
                gender.text="Whats your gender"
            }
        }

        female.setOnClickListener() {
            if (male.isChecked) {
                gender.setText("Your gender is Female")
                male.isChecked=false
            }
            else{
                gender.text="Whats your gender"
            }
        }


        var button=findViewById<Button>(R.id.button2)

        button.setOnClickListener(){

            intent= Intent(this,ImageViewToggle::class.java)
            startActivity(intent)
        }

            // Spinner




        result=findViewById(R.id.textView6)
        spinner=findViewById(R.id.spinnerCountry)
        
        spinner.onItemSelectedListener=this

        var arrayAdapter=ArrayAdapter.createFromResource(
            this,
            R.array.countries,
            android.R.layout.simple_list_item_1
        )

        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
         spinner.adapter=arrayAdapter

    }

    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        if (parent != null) {
            result.text = parent!!.getItemAtPosition(position).toString()
           }
    }


    override fun onNothingSelected(p0: AdapterView<*>?) {

    }
}