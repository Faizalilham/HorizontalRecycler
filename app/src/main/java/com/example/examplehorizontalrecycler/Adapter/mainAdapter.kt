package com.example.examplehorizontalrecycler.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.examplehorizontalrecycler.Model.dataModel
import com.example.examplehorizontalrecycler.databinding.ListItemBinding

class mainAdapter(val user : List<dataModel>) : RecyclerView.Adapter<mainAdapter.userViewHolder>() {

    inner class userViewHolder(val binding : ListItemBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): userViewHolder {
        return userViewHolder(ListItemBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: userViewHolder, position: Int) {
        holder.binding.apply {
            listImage.setImageResource(user[position].image)
            listTitle.text = user[position].title
            listPrice.text = user[position].price
        }
    }

    override fun getItemCount(): Int {
       return user.size
    }
}