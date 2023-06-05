package org.d3ifcool3046.pt2

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import org.d3ifcool3046.pt2.databinding.ActivityMenuBinding

class MenuActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMenuBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val name = intent.getStringExtra(Util.NAME)
        binding.textName.setText(name)

        binding.quizButton.setOnClickListener{
            val intent = Intent(this, QuizActivity::class.java)
            intent.putExtra(Util.NAME, binding.textName.text.toString())
            startActivity(intent)
            finish()
        }
        binding.materiButton.setOnClickListener{
            val intent = Intent(this, MateriActivity::class.java)
            startActivity(intent)
        }
        binding.aboutButton.setOnClickListener{
            val intent = Intent(this, AboutActivity::class.java)
            startActivity(intent)
        }
    }
}