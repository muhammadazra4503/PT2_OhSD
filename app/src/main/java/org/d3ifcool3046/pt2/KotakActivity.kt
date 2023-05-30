package org.d3ifcool3046.pt2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class KotakActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotak)

        val Rumus = intent.getParcelableExtra<Rumus>("rumus")
        if(Rumus !=null){
            val textView : TextView = findViewById(R.id.kotaktext)
            val imageView : ImageView = findViewById(R.id.kotakimg)

            textView.text= Rumus.name
            imageView.setImageResource(Rumus.image)
        }
    }
}