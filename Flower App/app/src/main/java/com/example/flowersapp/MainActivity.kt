package com.example.flowersapp

import MyArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import java.util.ArrayList

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myListView = findViewById<View>(R.id.my_list_view) as ListView
        val layoutID = R.layout.custom_view
        val myStringArray = ArrayList<String>()
        val myAdapterInstance: ArrayAdapter<String>
        myAdapterInstance = ArrayAdapter(this, layoutID, myStringArray)
        myListView.adapter = myAdapterInstance
        val myClassesArray = ArrayList<MyClass>()
        myClassesArray.add(MyClass(R.drawable.bluepoppy,"Blue Poppy"))
        myClassesArray.add(MyClass(R.drawable.batikiris,"Batik Iris"))
        myClassesArray.add(MyClass(R.drawable.crownimperial,"Crown Imperial"))


        val myArrayAdapter = MyArrayAdapter(
            this,
            myClassesArray
        )
        myListView.adapter = myArrayAdapter
    }
}