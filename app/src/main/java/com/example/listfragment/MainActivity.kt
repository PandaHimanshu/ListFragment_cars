package com.example.listfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentmanager:FragmentManager=supportFragmentManager
        val fragmentTransaction:FragmentTransaction=fragmentmanager.beginTransaction()

        val myListFragment=MyLstFragment()
        fragmentTransaction.add(R.id.frame,myListFragment)
        fragmentTransaction.commit()
    }
}