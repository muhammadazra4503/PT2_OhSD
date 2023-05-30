package org.d3ifcool3046.pt2

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import org.d3ifcool3046.pt2.databinding.ActivityQuizBinding

class QuizActivity:AppCompatActivity() {
    private lateinit var binding: ActivityQuizBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuizBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.mudahButton.setOnClickListener{
            val intent = Intent(this, EasyQuizActivity::class.java)
            startActivity(intent)
        }
    }
}