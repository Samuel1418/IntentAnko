package com.example.intentanko

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity__detalle.*

class Activity_Detalle : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity__detalle)

        val message = intent.getStringExtra("color")
        miColor.setText(message) //el texto que añadimos a parte de la Key se le añade
        if(message=="Amarillo") //Si el texto es Amarillo pues las letras cambian de color
        miColor.setTextColor(Color.YELLOW)
        else
            miColor.setTextColor(Color.RED)


    }
}

