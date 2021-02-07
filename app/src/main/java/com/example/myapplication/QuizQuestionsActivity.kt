package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class QuizQuestionsActivity : AppCompatActivity() {

    private var username: String? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_questions)

        username = intent.getStringExtra(Constants.USER_NAME)
        Toast.makeText(this, "$username", Toast.LENGTH_LONG).show()

        val questionList = Constants.getQuestions()
        Log.i("Fragen", "${questionList.size}")
    }
}