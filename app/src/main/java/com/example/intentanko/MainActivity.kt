package com.example.intentanko

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.view.View
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnAmarillo.setOnClickListener {
            val miintent= Intent(this,Activity_Detalle::class.java)
            miintent.putExtra("color","Amarillo") //Color es la key que vamos a recoger en el ActivityDetalle,es el mismo para ambos botones
            startActivity(miintent)
                    }


        btnRojo.setOnClickListener {
            val miintent= Intent(this,Activity_Detalle::class.java)
            miintent.putExtra("color","Rojo")
            startActivity(miintent)
        }
    }

}


