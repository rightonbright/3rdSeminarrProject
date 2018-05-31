package com.example.imsihyun.a3thseminarrproject

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView

class BusViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {
    var BusNumber : TextView = itemView!!.findViewById(R.id.bus_item_number) as TextView
    var BusText   : TextView = itemView!!.findViewById(R.id.bus_item_text) as TextView
    var BusColor  : LinearLayout = itemView!!.findViewById(R.id.bus_item_color) as LinearLayout
}