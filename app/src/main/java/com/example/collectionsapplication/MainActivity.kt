package com.example.collectionsapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


            val peopleAges = mutableMapOf<String, Int>(
                    "Fred" to 30,
                    "Ann" to 23
            )
            peopleAges.put("Barbara", 42)
            peopleAges["Joe"] = 51
            println(peopleAges)
        Log.d("people Ages : ", peopleAges.toString())
        Toast.makeText(baseContext, peopleAges.toString(), Toast.LENGTH_SHORT).show()

            //LIST

        val numbers = listOf("one", "two", "three", "four")
        Log.d("Number of elements:", numbers.size.toString())
        Log.d("Third element: ",numbers.get(2).toString())
        Log.d("Fourth element: ",numbers[3].toString())
        Log.d("Index of element", numbers.indexOf("two").toString())

        //LIST OPERATIONS
        val numberss = mutableListOf(1, 2, 3, 4)
        numberss.add(5)
        numberss.removeAt(1)
        numberss.add(2)
        numberss[0] = 0
        numberss.shuffle()
        Log.d("numberss element",numberss.toString())


        //SET
        val numbers_set = setOf(1, 2, 3, 4,5,6)
        println("Number of elements: ${numbers_set.size}")
        if (numbers_set.contains(1))
            println("1 is in the set")

        val numbersBackwards = setOf(4, 3, 2, 1)
        println("The sets are equal: ${numbers_set == numbersBackwards}")

        val numbershset = setOf(1, 2, 3, 4)  // LinkedHashSet is the default implementation
        val numbersBackwardshset = setOf(4, 3, 2, 1)

        println(numbershset.first() == numbersBackwardshset.first())
        println(numbershset.first() == numbersBackwardshset.last())
    }

    fun get_map(){
        val numbersMap = mapOf("key1" to 1, "key2" to 2, "key3" to 3, "key4" to 1)

        println("All keys: ${numbersMap.keys}")
        println("All values: ${numbersMap.values}")
        if ("key2" in numbersMap) println("Value by key \"key2\": ${numbersMap["key2"]}")
        if (1 in numbersMap.values) println("The value 1 is in the map")
        if (numbersMap.containsValue(1)) println("The value 1 is in the map")

        val numbersMapp = mapOf("key1" to 1, "key2" to 2, "key3" to 3, "key4" to 1)
        val anotherMap = mapOf("key2" to 2, "key1" to 1, "key4" to 1, "key3" to 3)

        println("The maps are equal: ${numbersMapp == anotherMap}")

        val numbersMap1 = mutableMapOf("one" to 1, "two" to 2)
        numbersMap1.put("three", 3)
        numbersMap1["one"] = 11

        println(numbersMap)
    }

}