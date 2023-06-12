package org.d3ifcool3046.pt2

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import org.d3ifcool3046.pt2.databinding.ActivityEasyquizBinding
import org.d3ifcool3046.pt2.databinding.ActivityResultBinding

class ResultActivity: AppCompatActivity() {
    private lateinit var binding: ActivityResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val nama = intent.getStringExtra(Util.NAME)
        binding.tvName.text = nama
        val score = intent.getIntExtra(Util.JAWABAN_BENAR,0)
        val totalPertanyaan = intent.getIntExtra(Util.TOTAL_PERTANYAAN,0)
        binding.tvScore.text = "Kamu menyelesaikan quiz dengan score $score dari $totalPertanyaan!"
        binding.doneButton.setOnClickListener{
            val intent = Intent(this, MenuActivity::class.java)
            intent.putExtra(Util.NAME, binding.tvName.text.toString())
            startActivity(intent)
            finish()
        }
    }
}