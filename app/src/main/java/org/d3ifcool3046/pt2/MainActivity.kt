package org.d3ifcool3046.pt2
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import org.d3ifcool3046.pt2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonMasuk.setOnClickListener{
            if (TextUtils.isEmpty(binding.inputName.text.toString())) {
                binding.textInput.error = "Enter Name"
            } else {
                val intent = Intent(this, MenuActivity::class.java)
                startActivity(intent)
            }
        }
    }
}