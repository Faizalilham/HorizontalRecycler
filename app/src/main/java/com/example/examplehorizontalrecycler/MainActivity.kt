package com.example.examplehorizontalrecycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.examplehorizontalrecycler.Adapter.mainAdapter
import com.example.examplehorizontalrecycler.Model.dataModel
import com.example.examplehorizontalrecycler.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        showrecycler()
    }

    private fun showrecycler(){
        val listdata = mutableListOf<dataModel>()
        listdata.add(dataModel("Android","2.250.000",R.drawable.ic_android))
        listdata.add(dataModel("Android","2.250.000",R.drawable.ic_android))
        listdata.add(dataModel("Android","2.250.000",R.drawable.ic_android))
        listdata.add(dataModel("Android","2.250.000",R.drawable.ic_android))
        listdata.add(dataModel("Android","2.250.000",R.drawable.ic_android))
        listdata.add(dataModel("Android","2.250.000",R.drawable.ic_android))
        binding.RecyclerId.apply {
            val setadapter = com.example.examplehorizontalrecycler.Adapter.mainAdapter(listdata)
            adapter = setadapter
//            layoutManager = LinearLayoutManager(this@MainActivity,LinearLayoutManager.HORIZONTAL,false)
            StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL).apply {
                layoutManager = this

            }
        }
    }
}