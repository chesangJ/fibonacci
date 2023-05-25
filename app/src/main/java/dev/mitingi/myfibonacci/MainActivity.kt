package dev.mitingi.myfibonacci

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView=findViewById(R.id.rvnumber)
        recyclerView.layoutManager=LinearLayoutManager(this)

        val number=fibonacci()
        val adapter=Adaptor(number)
        recyclerView.adapter=adapter

    }

    fun fibonacci():List<Long>{
        val numbers= mutableListOf<Long>()

        var z=0
        var y=1

        for (i in 1..100) {
            numbers.add(z.toLong())
            val sum = z + y
            z = y
            y = sum
        }
        return  numbers



    }




}