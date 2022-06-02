package com.marlonncarvalhosa.recyclerview

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recycler_View = findViewById<RecyclerView>(R.id.recyclerView_main)
        recycler_View.layoutManager = LinearLayoutManager(this)
        recycler_View.adapter = MainAdapter()
    }
}