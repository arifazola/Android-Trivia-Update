package com.example.android.navigation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import org.w3c.dom.Text

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        //val username = findViewById<EditText>(R.id.username)
        findViewById<Button>(R.id.login).setOnClickListener { checkLogin(it) }
    }

    private fun checkLogin(view : View){
        val username = findViewById<EditText>(R.id.username)
        val password = findViewById<EditText>(R.id.editTextTextPassword)

        if (username.text.toString() == "Jugulanfu121" && password.text.toString() == "hehehe123" ){
            //val intent = Intent(this, MainActivity::class.java)
            //startActivity(intent)
            Toast.makeText(this, "Login Sukses", Toast.LENGTH_LONG).show()
        }else{
            Toast.makeText(this, "Login Gagal", Toast.LENGTH_LONG).show()
        }
    }
}