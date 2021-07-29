package com.example.practice1

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.practice1.databinding.ItemViewpagerBinding

class CustomPagerAdapter: RecyclerView.Adapter<Holder>() {
    var textList = listOf<String>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val binding = ItemViewpagerBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        //TODO("Not yet implemented")

        return Holder(binding)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        val text = textList[position]
        holder.setText(text)
       // TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        //TODO("Not yet implemented")
        return textList.size

    }
}

class Holder(val binding: ItemViewpagerBinding): RecyclerView.ViewHolder(binding.root){
    fun setText(text:String){
            binding.textView.text = text
    }
}