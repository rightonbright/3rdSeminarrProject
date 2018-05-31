package com.example.imsihyun.a3thseminarrproject

import android.graphics.Color
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class BusAdapter(var busItems : ArrayList<BusData>)
    : RecyclerView.Adapter<BusViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BusViewHolder {
        val mainView : View = LayoutInflater.from(parent.context)
                .inflate(R.layout.bus_item, parent, false)
        return BusViewHolder(mainView)
    }

    override fun getItemCount(): Int = busItems.size

    override fun onBindViewHolder(holder: BusViewHolder, position: Int) {

        holder.BusColor.setBackgroundColor(Color.parseColor("#00FF00"))

        holder.BusNumber.text = busItems[position].Number
        holder.BusNumber.setTextColor(Color.parseColor("#00FF00"))
        holder.BusNumber.setTextColor(Color.parseColor("#FF0000"))
        holder.BusNumber.setTextColor(Color.parseColor("#0000FF"))

        holder.BusText.text = busItems[position].text

    }
}