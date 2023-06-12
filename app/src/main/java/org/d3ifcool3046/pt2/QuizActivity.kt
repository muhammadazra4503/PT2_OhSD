package org.d3ifcool3046.pt2

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import org.d3ifcool3046.pt2.databinding.ActivityQuizBinding

class QuizActivity:AppCompatActivity() {
    private lateinit var binding: ActivityQuizBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuizBinding.inflate(layoutInflater)
        val name = intent.getStringExtra(Util.NAME)
        setContentView(binding.root)

        binding.mudahButton.setOnClickListener{
            val intent = Intent(this, EasyQuizActivity::class.java)
            intent.putExtra(Util.NAME, name)
            startActivity(intent)
            finish()
        }
        binding.sedangButton.setOnClickListener{
            val intent = Intent(this, EasyQuizActivity::class.java)
            intent.putExtra(Util.NAME, name)
            startActivity(intent)
            finish()
        }
        binding.sulitButton.setOnClickListener{
            val intent = Intent(this, EasyQuizActivity::class.java)
            intent.putExtra(Util.NAME, name)
            startActivity(intent)
            finish()
        }
    }
}
