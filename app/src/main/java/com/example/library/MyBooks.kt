package com.example.library

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MyBooks : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.mybooks_main)

        val myBooksText = findViewById<TextView>(R.id.mybooksband)


        val books = intent.getStringArrayListExtra("selected_books")

        if (books != null && books.isNotEmpty()) {
            val titles = books.joinToString("\n") { "• $it" }
            myBooksText.text = "Tanlangan kitoblar:\n$titles"
        } else {
            myBooksText.text = "hali kitob band qilmadingiz"
        }
    }
}
