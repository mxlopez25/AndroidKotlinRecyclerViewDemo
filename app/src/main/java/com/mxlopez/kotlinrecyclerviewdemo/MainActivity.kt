package com.mxlopez.kotlinrecyclerviewdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.mxlopez.kotlinrecyclerviewdemo.databinding.ActivityMainBinding

class MainActivity: AppCompatActivity() {
    private lateinit var layoutManager: RecyclerView.LayoutManager
    private lateinit var adapter: RecyclerView.Adapter<RecyclerAdapter.ViewHolder>
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val languages = resources.getStringArray(R.array.programming_languages)
        val descriptions = resources.getStringArray(R.array.description)

        adapter = RecyclerAdapter(languages, descriptions)
        layoutManager = LinearLayoutManager(this)

        binding.rvMain.layoutManager = layoutManager
        binding.rvMain.adapter = adapter
    }
}