package com.opensource.worldcupapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //adapter view
        var listView = findViewById<ListView>(R.id.listview)
        //data source
        val world_cup_array = arrayOf("germany","Usa","India","Canada")
        //adapter
        val arrayAdapter:ArrayAdapter<*>
        arrayAdapter = ArrayAdapter(
            this,
            R.layout.hello_layout,
            R.id.textView,
            world_cup_array
        )
        listView.adapter = arrayAdapter

    }

}