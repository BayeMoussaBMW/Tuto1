package com.kalamou.tuto1

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class HomeActivity: AppCompatActivity() {

    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        val icon = findViewById(R.id.ic1) as? ImageView
        icon?.setOnClickListener {
            Toast.makeText(this, "Vous avez cliquez sur l'image", Toast.LENGTH_SHORT).show()
        }
    }


}