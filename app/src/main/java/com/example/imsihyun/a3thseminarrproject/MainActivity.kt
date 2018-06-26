package com.example.imsihyun.a3thseminarrproject

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.bus_item.*

class MainActivity : AppCompatActivity() {

    lateinit var busItems : ArrayList<BusData>
    lateinit var BusAdapter : BusAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        busItems = ArrayList()
        busItems.add(BusData(R.drawable.ic_launcher_background,
                "5515",
                "[서울]지선버스"))
        busItems.add(BusData(R.drawable.ic_launcher_background,
                "720",
                "[서울]간선버스"))
        busItems.add(BusData(R.drawable.ic_launcher_background,
                "3100",
                "[서울]광역버스"))
        busItems.add(BusData(R.drawable.ic_launcher_background,
                "3600",
                "[서울]광역버스"))
        busItems.add(BusData(R.drawable.ic_launcher_background,
                "172",
                "[서울]간선버스"))
        busItems.add(BusData(R.drawable.ic_launcher_background,
                "1221",
                "[서울]지선버스"))
        busItems.add(BusData(R.drawable.ic_launcher_background,
                "1224",
                "[서울]지선버스"))
        busItems.add(BusData(R.drawable.ic_launcher_background,
                "1131",
                "[서울]지선버스"))
        busItems.add(BusData(R.drawable.ic_launcher_background,
                "1141",
                "[서울]지선버스"))

        BusAdapter = BusAdapter(busItems)

        main_rv.layoutManager = LinearLayoutManager(this)
        main_rv.adapter = BusAdapter

    }
}
