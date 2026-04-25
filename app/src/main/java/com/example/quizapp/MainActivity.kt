package com.example.quizapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import com.example.quizapp.ui.QuizScreen
import com.example.quizapp.viewmodel.QuizViewModel

class MainActivity : ComponentActivity() {
    // Inject ViewModel
    private val quizViewModel: QuizViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(color = MaterialTheme.colorScheme.background) {
                    QuizScreen(quizViewModel)
                }
            }
        }
    }
}