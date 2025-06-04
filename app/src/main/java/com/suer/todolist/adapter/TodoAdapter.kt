package com.suer.todolist.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.suer.todolist.databinding.ItemTaskBinding

class TodoAdapter(
    private val items: MutableList<com.suer.todolist.model.TodoItem>,
    private val onDelete: (com.suer.todolist.model.TodoItem) -> Unit
) : RecyclerView.Adapter<TodoAdapter.TodoViewHolder>() {

    inner class TodoViewHolder(val binding: ItemTaskBinding)
        : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: com.suer.todolist.model.TodoItem) {
            binding.tvTask.text = item.text
            binding.root.setOnLongClickListener {
                onDelete(item)
                true
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoViewHolder {
        val binding = ItemTaskBinding
            .inflate(LayoutInflater.from(parent.context), parent, false)
        return TodoViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TodoViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount() = items.size

    fun add(item: com.suer.todolist.model.TodoItem) {
        items.add(0, item)
        notifyItemInserted(0)
    }

    fun remove(item: com.suer.todolist.model.TodoItem) {
        val index = items.indexOfFirst { it.id == item.id }
        if (index != -1) {
            items.removeAt(index)
            notifyItemRemoved(index)
        }
    }
}
