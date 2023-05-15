package com.example.listfragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.fragment.app.ListFragment


class MyLstFragment : ListFragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_my_lst, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val arrayAdapter= activity?.let {
            ArrayAdapter.createFromResource(it,R.array.cars,android.R.layout.simple_list_item_1) }

        listAdapter=arrayAdapter
        
        listView.setOnItemClickListener { adapterView, view, position, l ->
            val intent=Intent(activity,SecondActivity::class.java)
            intent.putExtra("Position",position)
            startActivity(intent)
        }
    }
}