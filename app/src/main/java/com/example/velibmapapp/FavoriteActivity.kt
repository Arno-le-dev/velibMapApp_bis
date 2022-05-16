package com.example.velibmapapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView

class FavoriteActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_favorite)


        val bottom_navigation = findViewById<BottomNavigationView>(R.id.bottom_navigation)

        val intent1 = Intent(this, SearchActivity::class.java)
        val intent3 = Intent(this, MapsActivity::class.java)

        bottom_navigation.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.ic_search -> startActivity(intent1)
                R.id.ic_map -> startActivity(intent3)
            }
            true
        }
    }
}