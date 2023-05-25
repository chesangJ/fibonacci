package dev.mitingi.myfibonacci

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

import androidx.recyclerview.widget.RecyclerView

class Adaptor( val numbers: List<Long>) :
    RecyclerView.Adapter<Adaptor.FibonacciViewHolder>() {

    class FibonacciViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvnumber: TextView = itemView.findViewById(R.id.tvnumber)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FibonacciViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.activity_numbers_list,parent,false)
        return FibonacciViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: FibonacciViewHolder, position: Int) {
        val number = numbers[position]
        holder.tvnumber.text = number.toString()
    }

    override fun getItemCount(): Int {
        return numbers.size
    }
}



