package com.example.fajer2pr2403

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    lateinit var M: RadioButton
    lateinit var K: RadioButton
    lateinit var Wiek: TextInputEditText
    lateinit var Sport: CheckBox
    lateinit var Muzyka: CheckBox
    lateinit var Turystyka: CheckBox
    lateinit var Gry: CheckBox
    lateinit var Wyslij: Button
    lateinit var Odblokuj: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        M = findViewById(R.id.m)
        K = findViewById(R.id.k)
        Wiek = findViewById(R.id.textInputEditText)
        Sport = findViewById(R.id.checkBox)
        Muzyka = findViewById(R.id.checkBox2)
        Turystyka = findViewById(R.id.checkBox3)
        Gry = findViewById(R.id.checkBox4)
        Wyslij = findViewById(R.id.button)
        Odblokuj = findViewById(R.id.button2)

        Wyslij.setOnClickListener {

            val result = StringBuilder()
            result.append("Selected Items")
            if (M.isChecked) {
                result.append("\nPłeć: Mężczyzna")

            }
            if (K.isChecked) {
                result.append("\nPłeć: Kobieta")

            }
            if (Sport.isChecked) {
                result.append("\nSport")

            }
            if (Muzyka.isChecked) {
                result.append("\nMuzyka")

            }
            if (Turystyka.isChecked) {
                result.append("\nTurystyka")

            }
            if (Gry.isChecked) {
                result.append("\nGry")

            }
            result.append("\nTotal: " + "Wiek:" + Wiek.text)
            Toast.makeText(applicationContext, result.toString(), Toast.LENGTH_SHORT).show()
        }
    }
}