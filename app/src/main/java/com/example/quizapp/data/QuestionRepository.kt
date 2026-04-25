package com.example.quizapp.data

class QuestionRepository {
    fun getQuestions(): List<Question> {
        return listOf(
            Question("She ___ to the gym every morning.", listOf("go", "goes", "going", "gone"), 1),
            Question("I have been waiting here ___ two hours.", listOf("for", "since", "at", "from"), 0),
            Question("Which sentence is correct?", listOf("He don't like tea", "He doesn't likes tea", "He doesn't like tea", "He not like tea"), 2),
            Question("If it rains, we ___ at home.", listOf("stay", "will stay", "stayed", "would stay"), 1),
            Question("Choose the synonym of 'Quick'.", listOf("Slow", "Fast", "Lazy", "Heavy"), 1)
        )
    }
}