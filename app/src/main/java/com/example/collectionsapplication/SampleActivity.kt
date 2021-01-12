package com.example.collectionsapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SampleActivity : AppCompatActivity() {

    private val words = listOf("about", "acute", "awesome", "balloon", "best", "brief", "class", "coffee", "creative")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample)


        val filteredWords = words.filter { it.startsWith("b", ignoreCase = true) }
        println(filteredWords)

        list1OP()

        listSorted()

    }

    fun list1OP(){
        val filteredWords = words.filter { it.startsWith("b", ignoreCase = true) }
                .shuffled()
                .take(2)
        println(filteredWords)
    }

    fun listSorted()
    {
        val filteredWords = words.filter { it.startsWith("b", ignoreCase = true) }
              //  .shuffled()
                .take(2)
                .sorted()
        println(filteredWords)
    }
}