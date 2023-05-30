package org.d3ifcool3046.pt2

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RumusActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var rumusList: ArrayList<Rumus>
    private lateinit var rumusAdapter: RumusAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rumus)

        recyclerView = findViewById(R.id.rv)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)

        rumusList = ArrayList()

        rumusList.add(Rumus(R.drawable.kotak, "Kotak"))
        rumusList.add(Rumus(R.drawable.bulat, "Lingkaran"))
        rumusList.add(Rumus(R.drawable.tri, "Segitiga"))
        rumusList.add(Rumus(R.drawable.pp, "Persegi Panjang"))



        rumusAdapter = RumusAdapter(rumusList)
        recyclerView.adapter = rumusAdapter

        rumusAdapter.onItemClick = {
            val intent = Intent(this, KotakActivity::class.java)
            intent.putExtra("rumus", it)
            startActivity(intent)


        }
        rumusAdapter.onItemClick = {
            val intent = Intent(this, LingkaranActivity::class.java)
            intent.putExtra("rumus", it)
            startActivity(intent)
        }

        rumusAdapter.onItemClick = {
            val intent = Intent(this, SegitigaActivity::class.java)
            intent.putExtra("rumus", it)
            startActivity(intent)
        }
        rumusAdapter.onItemClick = {
            val intent = Intent(this, PersegiPanjangActivity::class.java)
            intent.putExtra("rumus", it)
            startActivity(intent)
        }
    }
}

