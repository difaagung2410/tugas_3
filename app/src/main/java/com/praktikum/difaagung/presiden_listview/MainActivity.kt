package com.praktikum.difaagung.presiden_listview

import MyListAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val language = arrayOf<String>("Ir. Soekarno","Soeharto","Bacharuddin Jusuf Habibie",
                                   "Abdurrahman Wahid","Megawati Soekarnoputri","Susilo Bambang Yudhoyono",
                                   "Joko Widodo")
    val deskripsi = arrayOf<String>(
        "18 Agustus 1945 - 12 Maret 1967",
        "12 Maret 1967 - 21 Mei 1998",
        "21 Mei 1998 - 20 Oktober 1999",
        "20 Oktober 1999 - 23 Juli 2001",
        "23 Juli 2001 - 20 Oktober 2004",
        "20 Oktober 2004 - 20 Oktober 2014",
        "20 Oktober 2014 - sekarang"
    )

    val imageId = arrayOf<Int>(
        R.drawable.soekarno,R.drawable.soeharto,R.drawable.habibie,
        R.drawable.gusdur,R.drawable.megawati,R.drawable.sby,R.drawable.jokowi
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myListAdapter = MyListAdapter(this,language,deskripsi,imageId)
        list_view.adapter = myListAdapter

        list_view.setOnItemClickListener() { adapterView, view, position, id ->
            val itemAtPos = adapterView.getItemAtPosition(position)
            val itemIdAtPos = adapterView.getItemIdAtPosition(position)
            Toast.makeText(this, "${language[position]} menjabat pada ${deskripsi[position]}",
                Toast.LENGTH_LONG
            ).show()
        }
    }
}
