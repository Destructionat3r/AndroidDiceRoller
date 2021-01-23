package com.sid1818713.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
        val countButton: Button = findViewById(R.id.count_button)
        val resetButton: Button = findViewById(R.id.reset_button)
        rollButton.setOnClickListener { rollDice() }
        countButton.setOnClickListener { countUp() }
        resetButton.setOnClickListener { reset() }
    }

    private fun rollDice() {
        val resultText: TextView = findViewById(R.id.result_text)
        val randomInt = (1..6).random()
        resultText.text = randomInt.toString()
        //Toast.makeText(this, "button clicked",
            //Toast.LENGTH_SHORT).show()
    }

    private fun reset() {
        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = "0"
    }

    private fun countUp() {
        val resultText: TextView = findViewById(R.id.result_text)

        if (resultText.text == "Dice Rolled!") {
            resultText.text = "1"
        } else {
            var resultInt = resultText.text.toString().toInt()

            if (resultInt < 6) {
                resultInt++
                resultText.text = resultInt.toString()
            }
        }
    }
}