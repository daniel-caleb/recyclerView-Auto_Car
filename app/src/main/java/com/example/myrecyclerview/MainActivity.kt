package com.example.myrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerview = findViewById<RecyclerView>(R.id.recyclerview)

        recyclerview.layoutManager = LinearLayoutManager(this)

        val data = ArrayList<ItemsViewModel>()

        for (i in 1..4) {
            data.add(ItemsViewModel(R.drawable.range1, "Range Rover Sport " + i))
        }
        for (i in 5..10){
            data.add(ItemsViewModel(R.drawable.benz1, "Mercedes Benz " + i))
        }
        for (i in 10..15){
            data.add(ItemsViewModel(R.drawable.vw, "VolksWagen TSI " + i))
        }
        for (i in 15..20){
            data.add(ItemsViewModel(R.drawable.audi1, "Audi A " + i))
        }

        val adapter=CustomAdapter(data)

        recyclerview.adapter=adapter
    }
}