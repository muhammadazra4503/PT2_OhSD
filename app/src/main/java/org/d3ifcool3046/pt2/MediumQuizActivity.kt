package org.d3ifcool3046.pt2

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import org.d3ifcool3046.pt2.databinding.ActivityMediumquizBinding
import org.d3ifcool3046.pt2.model.Question

class MediumQuizActivity: AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityMediumquizBinding

    private var mPosisiSekarang = 1
    private var mListPertanyaan: ArrayList<Question>? = null
    private var opsiDipilih: Int = 0
    private var mNama: String? = null
    private var mJawabanBenar: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMediumquizBinding.inflate(layoutInflater)
        setContentView(binding.root)
        mListPertanyaan = Util.setMediumQuestion()
        mNama = intent.getStringExtra(Util.NAME)
        setQuestion()
        binding.tvOpsi1.setOnClickListener(this)
        binding.tvOpsi2.setOnClickListener(this)
        binding.tvOpsi3.setOnClickListener(this)
        binding.submitButton.setOnClickListener(this)
    }

    @SuppressLint("SetTextI18n")
    private fun setQuestion(){
        val pertanyaan: Question = mListPertanyaan!![mPosisiSekarang - 1]
        defaultOptionView()
        if (mPosisiSekarang == mListPertanyaan!!.size){
            binding.submitButton.text = "Finish"
        } else
            binding.submitButton.text = "Submit"
        binding.progressBar.progress = mPosisiSekarang
        binding.tvProgress.text = "$mPosisiSekarang" + "/" + binding.progressBar.max
        binding.tvQuestion.text = pertanyaan.pertanyaan
        binding.tvOpsi1.text = pertanyaan.opsiSatu
        binding.tvOpsi2.text = pertanyaan.opsiDua
        binding.tvOpsi3.text = pertanyaan.opsiTiga


    }

    private fun defaultOptionView(){
        val options = ArrayList<TextView>()
        options.add(0, binding.tvOpsi1)
        options.add(1, binding.tvOpsi2)
        options.add(2, binding.tvOpsi3)

        for (option in options) {
            option.setTextColor(Color.parseColor("#7a8089"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(
                this,
                R.drawable.default_option_border
            )
        }
    }

    private fun optionSelected(tv: TextView, OpsiDipilih: Int){
        defaultOptionView()
        opsiDipilih = OpsiDipilih
        tv.setTextColor(Color.parseColor("#363A43"))
        tv.setTypeface(tv.typeface, Typeface.BOLD)
        tv.background = ContextCompat.getDrawable(
            this,
            R.drawable.selected_option
        )
    }

    private fun answerView(answer: Int, drawableView: Int){
        when(answer){
            1 ->{
                binding.tvOpsi1.background = ContextCompat.getDrawable(
                    this, drawableView
                )
            }
            2 ->{
                binding.tvOpsi2.background = ContextCompat.getDrawable(
                    this, drawableView
                )
            }
            3 ->{
                binding.tvOpsi3.background = ContextCompat.getDrawable(
                    this, drawableView
                )
            }
        }
    }

    @SuppressLint("SetTextI18n")
    override fun onClick(v: View?) {
        when(v?.id){
            R.id.tvOpsi1 ->
                optionSelected(binding.tvOpsi1, 1)
            R.id.tvOpsi2 ->
                optionSelected(binding.tvOpsi2, 2)
            R.id.tvOpsi3 ->
                optionSelected(binding.tvOpsi3, 3)
            R.id.submitButton ->{
                if(opsiDipilih == 0){
                    mPosisiSekarang++
                    when{
                        mPosisiSekarang <= mListPertanyaan!!.size ->{
                            setQuestion()
                        }else ->{
                        val intent = Intent(this, ResultActivity::class.java)
                        intent.putExtra(Util.NAME, mNama)
                        intent.putExtra(Util.JAWABAN_BENAR, mJawabanBenar)
                        intent.putExtra(Util.TOTAL_PERTANYAAN, mListPertanyaan!!.size)
                        startActivity(intent)
                        finish()
                    }
                    }
                }else{
                    val pertanyaan = mListPertanyaan?.get(mPosisiSekarang-1)
                    if(pertanyaan!!.jawaban != opsiDipilih){
                        answerView(opsiDipilih, R.drawable.wrong_border)
                    }else{
                        answerView(opsiDipilih, R.drawable.correct_border)
                    }
                    if (mPosisiSekarang == mListPertanyaan!!.size) binding.submitButton.text = "Selesai"
                    else binding.submitButton.text = "Lanjut"
                    opsiDipilih = 0
                }
            }
        }
    }
}