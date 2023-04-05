package com.example.quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var btnStart: Button
    lateinit var etName: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bind()

        btnStart.setOnClickListener{
            onIntent(etName.text.toString())
        }


    }


    private fun bind(){
        btnStart = findViewById(R.id.btn_start)
        etName = findViewById(R.id.et_name)

    }
    private fun onIntent(name: String){
        if(name.isEmpty()){
            Toast.makeText(this,
                "Введите ваше имя", Toast.LENGTH_SHORT).show()
        }else{
            val intent = Intent(this, QuizQustionsActivity::class.java)
            intent.putExtra(Constants.USER_NAME, name)
            startActivity(intent)
            finish()
        }
    }



}



