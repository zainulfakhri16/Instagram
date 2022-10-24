package com.example.instagram

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title ="Zain"

        val recyclerview = findViewById<RecyclerView>(R.id.rv_sw)
        recyclerview.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        val data = ArrayList<ItemsViewModel>()

        for (i in 1..20){
            data.add(ItemsViewModel(R.drawable.zainul,"Zain" + i))
        }

        val adapter = CustomAdapter(data)
        recyclerview.adapter = adapter

        val recyclerView = findViewById<RecyclerView>(R.id.rv_post)
    }
}