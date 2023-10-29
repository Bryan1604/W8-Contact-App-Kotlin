package com.example.w6_kotlin_listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    lateinit var customAdapter: CustomAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Khai bao danh sach item list
        var list = mutableListOf<ItemData>()
        list.add(ItemData("E","Edurila.com","$19 Only. Are you looking for coures","12:34 PM"))
        list.add(ItemData("C","Chris Phan","Hello. Are you looking for coures","12:30 PM"))
        list.add(ItemData("T","Toto.com","Hey. Im the manager of all basse","11:34 PM"))
        list.add(ItemData("H","Hola Base","click to the link below to see all advantages of our service","12:34 PM"))
        list.add(ItemData("E","Edurila.com","$19 Only. Are you looking for coures","12:34 PM"))

        customAdapter = CustomAdapter(this,list)

        //khai bao bien den listEmail
        val listEmail = findViewById<ListView>(R.id.listEmail)
        listEmail.adapter = customAdapter
    }
}