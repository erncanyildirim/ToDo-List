package com.suer.todolist

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.suer.todolist.adapter.TodoAdapter
import com.suer.todolist.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: TodoAdapter
    private var nextId = 1L  // basit ID üretimi

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initRecyclerView()
        binding.btnAdd.setOnClickListener { addTask() }
    }

    private fun initRecyclerView() {
        adapter = TodoAdapter(mutableListOf()) { itemToDelete ->
            adapter.remove(itemToDelete)
        }
        binding.rvTasks.layoutManager = LinearLayoutManager(this)
        binding.rvTasks.adapter = adapter
    }

    private fun addTask() {
        val text = binding.etTask.text.toString().trim()
        if (text.isEmpty()) return

        val newItem = com.suer.todolist.model.TodoItem(id = nextId++, text = text)
        adapter.add(newItem)
        binding.etTask.setText("")
        binding.rvTasks.scrollToPosition(0)
    }
}
