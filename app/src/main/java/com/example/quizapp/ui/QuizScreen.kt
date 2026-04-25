package com.example.quizapp.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.quizapp.viewmodel.QuizViewModel

@Composable
fun QuizScreen(viewModel: QuizViewModel) {
    val currentQuestion = viewModel.currentQuestion
    val currentIndex = viewModel.currentIndex.value
    val total = viewModel.totalQuestions

    // Show Result Dialog if needed
    if (viewModel.showDialog.value) {
        ResultDialog(
            score = viewModel.score.value,
            total = total,
            onRestart = { viewModel.restartQuiz() }
        )
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        if (currentQuestion != null) {
            // Progress Indicator
            Text(
                text = "Question ${currentIndex + 1} of $total",
                fontSize = 14.sp,
                color = MaterialTheme.colorScheme.secondary
            )

            Spacer(modifier = Modifier.height(16.dp))

            // Question Text
            Text(
                text = currentQuestion.text,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(32.dp))

            // Options
            currentQuestion.options.forEachIndexed { index, option ->
                Button(
                    onClick = { viewModel.onAnswerSelected(index) },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 4.dp)
                ) {
                    Text(text = option)
                }
            }
        }
    }
}