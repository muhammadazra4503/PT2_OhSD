package org.d3ifcool3046.pt2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import org.d3ifcool3046.pt2.databinding.ActivityEasyquizBinding



class EasyQuizActivity: AppCompatActivity() {
    private lateinit var binding: ActivityEasyquizBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEasyquizBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}