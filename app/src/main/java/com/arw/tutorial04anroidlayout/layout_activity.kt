package com.arw.tutorial04anroidlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class layout_activity : AppCompatActivity() {

    lateinit var edtName: EditText
    lateinit var btnWellcome: Button
    lateinit var btnGoodBye: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_layout)


        edtName=findViewById(R.id.edtName)
        btnWellcome=findViewById(R.id.btnWellcome)
        btnGoodBye=findViewById(R.id.btnGoodBye)


        btnWellcome.setOnClickListener {

             sayHellow()

            }

            btnGoodBye.setOnClickListener {
               sayGoodBye()

            }

        }

            fun sayHellow(){

                Toast.makeText(this, "Hello, ${edtName.text.toString()}",Toast.LENGTH_LONG).show()
            }

           fun sayGoodBye(){

               Toast.makeText(this, "Good Bye, ${edtName.text.toString()}",Toast.LENGTH_LONG).show()


    }


}