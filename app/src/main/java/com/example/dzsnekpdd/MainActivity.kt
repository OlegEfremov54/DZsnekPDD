package com.example.dzsnekpdd

import android.os.Bundle
import android.widget.CheckBox
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var toolbarMain: Toolbar
    private lateinit var checkboxTextTV: TextView
    private lateinit var checkboxTextCB: CheckBox
    private lateinit var rulesPDDTextTV: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        toolbarMain = findViewById(R.id.toolbarMain)
        setSupportActionBar(toolbarMain)
        title = "ДЗ Checkbox, Snackbar"
        toolbarMain.subtitle = "Задание 2. Правила дорожного движения"
        toolbarMain.setLogo(R.drawable.ic_android_black_24dp)
        checkboxTextTV = findViewById(R.id.checkboxTextTV)
        checkboxTextCB = findViewById(R.id.checkboxTextCB)
        rulesPDDTextTV = findViewById(R.id.rulesPDDTextTV)

        checkboxTextCB.setOnCheckedChangeListener { buttonView, isCheked ->
            if (isCheked) {
                checkboxTextTV.text = "ПДД Правила дорожного движения"
                rulesPDDTextTV.setText(R.string.text_PDD)
            }
            else {
                checkboxTextTV.text = "Информация"
                rulesPDDTextTV.text = ""
            }
        }
    }


}
