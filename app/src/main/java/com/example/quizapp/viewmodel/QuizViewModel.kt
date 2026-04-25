package com.example.quizapp.viewmodel

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.quizapp.data.Question
import com.example.quizapp.data.QuestionRepository

class QuizViewModel : ViewModel() {
    private val repository = QuestionRepository()
    private val questions = repository.getQuestions()

    // State: Current Question Index
    private val _currentIndex = mutableStateOf(0)
    val currentIndex: State<Int> = _currentIndex

    // State: Current Score
    private val _score = mutableStateOf(0)
    val score: State<Int> = _score

    // State: Show Result Dialog
    private val _showDialog = mutableStateOf(false)
    val showDialog: State<Boolean> = _showDialog

    // Get current question based on index
    val currentQuestion: Question?
        get() = if (_currentIndex.value < questions.size) questions[_currentIndex.value] else null

    val totalQuestions = questions.size

    fun onAnswerSelected(selectedIndex: Int) {
        val question = currentQuestion ?: return

        // 1. Check if correct
        if (selectedIndex == question.correctAnswerIndex) {
            _score.value++
        }

        // 2. Move to next or show result
        if (_currentIndex.value < questions.size - 1) {
            _currentIndex.value++
        } else {
            _showDialog.value = true
        }
    }

    fun restartQuiz() {
        _currentIndex.value = 0
        _score.value = 0
        _showDialog.value = false
    }
}