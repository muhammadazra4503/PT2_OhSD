package org.d3ifcool3046.pt2

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class RumusActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rumus)
    }
    fun panggil(view: View?) {
        val intent = Intent(this@RumusActivity, LingkaranActivity::class.java)
        startActivity(intent)
    }
    fun Segitiga(view: View?) {
        val intent = Intent(this@RumusActivity, SegitigaActivity::class.java)
        startActivity(intent)
    }
    fun Kotak(view: View?) {
        val intent = Intent(this@RumusActivity, KotakActivity::class.java)
        startActivity(intent)
    }
    fun PersegiPanjang(view: View?) {
        val intent = Intent(this@RumusActivity, PersegiPanjangActivity::class.java)
        startActivity(intent)
    }
}