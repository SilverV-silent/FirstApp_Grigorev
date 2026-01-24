package com.example.firstappGrigorev

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.firstappGrigorev.R
import kotlin.random.Random
class MainActivity : Activity() {
    private lateinit var rollButton: Button
    private lateinit var resultTextView: TextView
    private lateinit var diceNumberTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Привязываем компоненты
        rollButton = findViewById(R.id.button)
        resultTextView = findViewById(R.id.textView2)
        diceNumberTextView = findViewById(R.id.textViewResult)

        // Обрабатываем клик по кнопке
        rollButton.setOnClickListener { rollDice() }
    }

    private fun rollDice() {
        val diceValue = Random.nextInt(1, 7) // Генерация случайного числа от 1 до 6

        // Отображение результата в первом тексте
        resultTextView.text = "Выпал номер: $diceValue"

        // Вывод самой цифры крупным шрифтом
        diceNumberTextView.text = "$diceValue"
    }
}
