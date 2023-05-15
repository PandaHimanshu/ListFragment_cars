package com.example.listfragment

import android.icu.text.Transliterator.Position
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.FragmentManager

class SecondFragment : Fragment() {

        lateinit var imageView: ImageView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view=inflater.inflate(R.layout.fragment_second, container, false)
        imageView=view.findViewById(R.id.imageView)
        val position= arguments?.getInt("Position",0)
       when(position){
           0->imageView.setImageResource(R.drawable.mercedes)
           1->imageView.setImageResource(R.drawable.honda)
           2->imageView.setImageResource(R.drawable.mahindra)
           3->imageView.setImageResource(R.drawable.lambo)
           4->imageView.setImageResource(R.drawable.rangerover)
       }
        return view

    }
}