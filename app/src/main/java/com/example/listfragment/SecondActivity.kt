package com.example.listfragment

import android.icu.text.Transliterator.Position
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

       val position= intent.getIntExtra("Position",0)

        val fragmentManager:FragmentManager=supportFragmentManager
        val fragmentTransaction:FragmentTransaction=fragmentManager.beginTransaction()

        val secondFragment=SecondFragment()

        val bundle=Bundle()
        bundle.putInt("Position",position)
        secondFragment.arguments=bundle
        fragmentTransaction.add(R.id.framelayout,secondFragment)
        fragmentTransaction.commit()
    }
}