package com.example.my

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val bottomNav = findViewById<BottomNavigationView>(R.id.bottomNav)

        replaceScreen(Frag_1())

        bottomNav.setOnItemSelectedListener {
            when(it.itemId)
            {
                R.id.Fragment_1 -> replaceScreen(Frag_1())
                R.id.Fragment_2 -> replaceScreen(Frag_2())
                R.id.Fragment_3 -> replaceScreen(Frag_3())
            }
            true }
    }

    fun replaceScreen(frag: Fragment)
    {
        val fManager = supportFragmentManager
        val fTransaction = fManager.beginTransaction()
        fTransaction.replace(R.id.frameLayout,frag)
        fTransaction.commit()
    }
}