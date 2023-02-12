package com.kalamou.tuto1

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class GreetingActivity: AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_greeting)
        val welcome = findViewById<TextView>(R.id.tv_greeting)
        var user = findViewById<TextView>(R.id.tv_user_name)
        DataStore.getData()
        user.text = DataStore.userInformations.prenom.toString()
    }
}