package com.example.fajer2pr2403

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
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
            result.append("WYNIK")
            if (M.isChecked) {
                result.append("\nPłeć: Mężczyzna\n")

            }
            if (K.isChecked) {
                result.append("\nPłeć: Kobieta\n")

            }
            if (Sport.isChecked) {
                result.append("Sport")

            }
            if (Muzyka.isChecked) {
                result.append("Muzyka,")

            }
            if (Turystyka.isChecked) {
                result.append("Turystyka,")

            }
            if (Gry.isChecked) {
                result.append("Gry,")

            }
            result.append(":To Zainteresowania\n " + "Wiek:" + Wiek.text)
            findViewById<TextView>(R.id.textView4).text = result.toString()


            M.setEnabled(false)
            K.setEnabled(false)
            Wiek.setEnabled(false)
            Sport.setEnabled(false)
            Muzyka.setEnabled(false)
            Turystyka.setEnabled(false)
            Gry.setEnabled(false)


        }
        Odblokuj.setOnClickListener{
            M.setEnabled(true)
            K.setEnabled(true)
            Wiek.setEnabled(true)
            Sport.setEnabled(true)
            Muzyka.setEnabled(true)
            Turystyka.setEnabled(true)
            Gry.setEnabled(true)

        }


    }
}