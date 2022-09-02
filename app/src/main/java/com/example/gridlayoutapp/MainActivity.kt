package com.example.gridlayoutapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.gridlayoutapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    var binding:ActivityMainBinding?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        val adapter=MainAdapter(TaskList.taskList)

        binding?.taskRv?.adapter=adapter
        binding?.taskRv?.layoutManager=LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
//        binding?.taskRv?.layoutManager=GridLayoutManager(this,2)

    }

    override fun onDestroy() {
        super.onDestroy()

        binding=null
    }
}