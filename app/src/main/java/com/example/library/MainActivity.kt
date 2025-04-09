package com.example.library

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val emailEditText = findViewById<EditText>(R.id.email_edit)
        val passwordEditText = findViewById<EditText>(R.id.password_edit)
        val loginButton = findViewById<Button>(R.id.signup_button)

        loginButton.setOnClickListener {
            val email = emailEditText.text.toString().trim()
            val password = passwordEditText.text.toString().trim()

            if (email == "adminbek@gmail.com" && password == "Adminjon7") {
                val intent = Intent(this, AdminActivity::class.java)
                startActivity(intent)
                finish()
            } else if (email.isNotEmpty() && password.isNotEmpty()) {
                val intent = Intent(this, UserActivity::class.java)
                startActivity(intent)
                finish()
            } else {
                Toast.makeText(this, "Please, enter your email and password", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
