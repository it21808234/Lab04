package com.arw.tutorial04anroidlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {


    lateinit var edtName:EditText
    lateinit var btnWellcome:Button
    lateinit var btnGoodBye:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edtName=findViewById(R.id.edtName)
        btnWellcome=findViewById(R.id.btnWellcome)
        btnGoodBye=findViewById(R.id.btnGoodBye)










    }
}