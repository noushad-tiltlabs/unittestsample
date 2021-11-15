package com.example.unittestsample

import android.content.Context
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.constraintlayout.motion.widget.TransitionBuilder.validate

class MainActivity internal constructor(mMockContext: Context) : AppCompatActivity() {


    fun MainActivity(context: Context?) {

    }

    var login:EditText?=null
    var password:EditText?=null
    var btnLogin:AppCompatButton?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        login = findViewById(R.id.edit_email_address)
        password = findViewById(R.id.edit_password)
        btnLogin = findViewById(R.id.btn_login)
        var utils = Utils()
        btnLogin?.setOnClickListener {
            Toast.makeText(
                this,
                utils.validate(login?.text.toString(), password?.text.toString()),
                Toast.LENGTH_LONG
            ).show()
        }

    }
}