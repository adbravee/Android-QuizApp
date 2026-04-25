# 🧠 QuizApp - A Simple Android Quiz Application

Welcome to **QuizApp**! This is a beginner-friendly Android application designed to help you test your knowledge through a fun and interactive quiz. 

Even if you have **no experience with Kotlin or Android development**, this guide will help you understand how the project works and how to run it.

---

## 🚀 Features

*   **Interactive UI:** A clean and modern user interface built with Jetpack Compose.
*   **Dynamic Questions:** Questions are loaded from a central repository.
*   **Score Tracking:** The app keeps track of your score as you answer.
*   **Instant Feedback:** Find out if your answer was correct immediately.
*   **Result Summary:** A final score dialog appears once you finish the quiz with an option to restart.

---

## 🛠️ Tech Stack (The "Brain" of the App)

You don't need to be an expert to understand these terms:
*   **Kotlin:** The programming language used to write the logic. It's concise and easy to read!
*   **Jetpack Compose:** A modern toolkit for building the visual parts of the app (the buttons, text, and layout).
*   **ViewModel:** This acts as the "manager" of the app. It holds the data (like your score) so it doesn't disappear if you rotate your phone.

---

## 📂 Project Structure Explained

Here is a simple breakdown of where the important files are:

*   **`MainActivity.kt`**: The entry point of the app. Think of it as the "Start" button.
*   **`data/Question.kt`**: Defines what a "Question" looks like (the text, the choices, and the correct answer).
*   **`data/QuestionRepository.kt`**: This is where all the actual questions are stored. If you want to add your own questions, this is the place!
*   **`viewmodel/QuizViewModel.kt`**: The logic center. It decides what happens when you click an answer and calculates your score.
*   **`ui/QuizScreen.kt`**: Contains the code that draws the quiz onto your screen.
*   **`ui/ResultDialog.kt`**: The pop-up box that shows your final score.

---

## 🕹️ How to Run the Project

### Prerequisites
1.  **Android Studio:** Download and install the latest version of [Android Studio](https://developer.android.com/studio).
2.  **Android Device/Emulator:** You can use your own Android phone or a "Virtual Device" (Emulator) inside Android Studio.

### Steps to Run
1.  **Clone or Download** this project to your computer.
2.  Open Android Studio and select **"Open"**. Navigate to the folder where you saved this project.
3.  Wait for the "Gradle Sync" to finish (this downloads the necessary tools to build the app).
4.  Look for the **Green Play Button (▶)** in the top toolbar and click it.
5.  The app will install and open on your device!

---

## 📝 How to Add Your Own Questions

Want to make the quiz about your favorite movie or hobby? It's easy!

1.  Navigate to `app/src/main/java/com/example/quizapp/data/QuestionRepository.kt`.
2.  You will see a list of questions.
3.  Add a new line using this format:
    ```kotlin
    Question(
        text = "Your Question Here?",
        options = listOf("Option A", "Option B", "Option C", "Option D"),
        correctAnswerIndex = 0 // 0 is the first option, 1 is the second, etc.
    )
    ```
4.  Run the app again to see your new questions!

---

## 🤝 Contributing

If you're a beginner looking to learn, feel free to fork this project, make changes, and play around with the code. It's the best way to learn!

Happy Coding! 🚀
