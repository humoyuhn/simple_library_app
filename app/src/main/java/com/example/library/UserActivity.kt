package com.example.library

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class UserActivity : AppCompatActivity() {

    private val selectedBooks = mutableSetOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.user_main)

        val myBooksText = findViewById<TextView>(R.id.mybooks_text)
        myBooksText.setOnClickListener {
            val intent = Intent(this, MyBooks::class.java)
            intent.putStringArrayListExtra("selected_books", ArrayList(selectedBooks))
            startActivity(intent)
        }


        val bookCardOne = findViewById<CardView>(R.id.book_cardone)
        val bookTitleOne = findViewById<TextView>(R.id.bookTitleone)
        bookCardOne.setOnClickListener {
            val title = bookTitleOne.text.toString()
            if (selectedBooks.add(title)) {
                bookCardOne.alpha = 0.5f
                bookCardOne.isClickable = false
            }
        }


        val bookCardTwo = findViewById<CardView>(R.id.book_cardtwo)
        val bookTitleTwo = findViewById<TextView>(R.id.bookTitletwo)
        bookCardTwo.setOnClickListener {
            val title = bookTitleTwo.text.toString()
            if (selectedBooks.add(title)) {
                bookCardTwo.alpha = 0.5f
                bookCardTwo.isClickable = false
            }
        }


        val bookCardThree = findViewById<CardView>(R.id.book_cardthree)
        val bookTitleThree = findViewById<TextView>(R.id.bookTitlethree)
        bookCardThree.setOnClickListener {
            val title = bookTitleThree.text.toString()
            if (selectedBooks.add(title)) {
                bookCardThree.alpha = 0.5f
                bookCardThree.isClickable = false
            }
        }


        val bookCardFour = findViewById<CardView>(R.id.book_cardfour)
        val bookTitleFour = findViewById<TextView>(R.id.bookTitlefour)
        bookCardFour.setOnClickListener {
            val title = bookTitleFour.text.toString()
            if (selectedBooks.add(title)) {
                bookCardFour.alpha = 0.5f
                bookCardFour.isClickable = false
            }
        }
    }
}
