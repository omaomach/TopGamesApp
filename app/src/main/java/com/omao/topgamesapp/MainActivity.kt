package com.omao.topgamesapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // AdapterView: Recycler  (CardView)
        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this,
            LinearLayoutManager.VERTICAL,
            false
        )

        // 2- Data Source: List of Game Objects
        var gamesList: ArrayList<GameModel> = ArrayList()

        val game1 = GameModel(R.drawable.card1, "Horizon Chase")
        val game2 = GameModel(R.drawable.card2, "PUBG")
        val game3 = GameModel(R.drawable.card3, "Head Ball 2")
        val game4 = GameModel(R.drawable.card4, "FIFA 22")
        val game5 = GameModel(R.drawable.card5, "Fortnite")
        val game6 = GameModel(R.drawable.card6, "Hooked on You")

        gamesList.add(game1)
        gamesList.add(game2)
        gamesList.add(game3)
        gamesList.add(game4)
        gamesList.add(game5)
        gamesList.add(game6)

        // Adapter
        val adapter = GameAdapter(gamesList)
        recyclerView.adapter = adapter

    }
}