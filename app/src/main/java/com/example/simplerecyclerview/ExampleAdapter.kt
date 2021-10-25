package com.example.simplerecyclerview

import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.lifecycle.ViewModel
import androidx.recyclerview.widget.RecyclerView
import com.example.simplerecyclerview.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.example_item.view.*

class ExampleAdapter(private val exampleList: List<ExampleItem>) : RecyclerView.Adapter<ExampleAdapter.ExampleViewHolder>() {

    class ExampleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val imageView: ImageView = itemView.image_view
        val textView1: TextView = itemView.text_view_1
        val textView2: TextView = itemView.text_view_2
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExampleViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ExampleViewHolder, position: Int) {
        holder.
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}