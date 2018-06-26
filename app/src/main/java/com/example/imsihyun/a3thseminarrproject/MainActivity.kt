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
                "2415",
                "[서울]지선버스"))
        busItems.add(BusData(R.drawable.ic_launcher_background,
                "4212",
                "[서울]지선버스"))
        busItems.add(BusData(R.drawable.ic_launcher_background,
                "1669",
                "[서울]지선버스"))
        busItems.add(BusData(R.drawable.ic_launcher_background,
                "8693",
                "[서울]지선버스"))
        busItems.add(BusData(R.drawable.ic_launcher_background,
                "1234",
                "[서울]지선버스"))
        busItems.add(BusData(R.drawable.ic_launcher_background,
                "3252",
                "[서울]지선버스"))
        busItems.add(BusData(R.drawable.ic_launcher_background,
                "4232",
                "[서울]지선버스"))
        busItems.add(BusData(R.drawable.ic_launcher_background,
                "1232",
                "[서울]지선버스"))

        BusAdapter = BusAdapter(busItems)

        main_rv.layoutManager = LinearLayoutManager(this)
        main_rv.adapter = BusAdapter

    }
}
