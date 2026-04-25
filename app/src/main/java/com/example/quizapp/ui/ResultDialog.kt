package com.example.quizapp.ui

import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun ResultDialog(score: Int, total: Int, onRestart: () -> Unit) {
    AlertDialog(
        onDismissRequest = { }, // Prevent dismissing by clicking outside
        title = { Text(text = "Quiz Finished!") },
        text = { Text(text = "Your final score is $score out of $total") },
        confirmButton = {
            Button(onClick = onRestart) {
                Text("Restart Quiz")
            }
        }
    )
}