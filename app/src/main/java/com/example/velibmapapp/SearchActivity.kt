package com.example.velibmapapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView

class SearchActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)


        val bottom_navigation = findViewById<BottomNavigationView>(R.id.bottom_navigation)

        val intent2 = Intent(this, FavoriteActivity::class.java)
        val intent3 = Intent(this, MapsActivity::class.java)

        bottom_navigation.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.ic_search -> startActivity(intent2)
                R.id.ic_map -> startActivity(intent3)
            }
            true
        }
    }
}