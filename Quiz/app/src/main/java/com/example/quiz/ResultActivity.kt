package com.example.quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ResultActivity : AppCompatActivity() {

    lateinit var tvName: TextView
    lateinit var tvResult: TextView
    lateinit var btnFinish: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        bind()
        val username = intent.getStringExtra(Constants.USER_NAME)
        val totalQuestion = intent.getIntExtra(Constants.TOTAL_QUESTIONS, 0)
        val correctAnswer = intent.getIntExtra(Constants.CORRECT_ANSWER, 0)
        tvName.text = username
        tvResult.text = "Твой результат $correctAnswer/$totalQuestion"
        goNextGame()




    }

    fun bind(){
        tvName = findViewById(R.id.tv_name)
        tvResult = findViewById(R.id.tv_result)
        btnFinish = findViewById(R.id.btn_finish)

    }

    fun goNextGame(){
        btnFinish.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java ))
        }
    }

}