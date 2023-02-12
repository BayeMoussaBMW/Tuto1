package com.kalamou.tuto1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class DiarraActivity : AppCompatActivity() {
    lateinit var userInformations: UserInformations

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_diarra)
        val prenom = findViewById<EditText>(R.id.tv_prenom)
        val nom = findViewById<EditText>(R.id.tv_nom)
        val age = findViewById<EditText>(R.id.tv_age)
        val btContinue = findViewById<Button>(R.id.bt_continue)

        btContinue.setOnClickListener {
            userInformations = UserInformations(prenom = prenom.text.toString(),
                nom = nom.text.toString(),
                age = age.text.toString())
            if (prenom.text.isNotEmpty() && nom.text.isNotEmpty() && age.text.isNotEmpty()){
                DataStore.setData(userInformations)
            }else{
                Toast.makeText(this, "Veuillez remplir les champs avant de continuer", Toast.LENGTH_SHORT).show()
            }
            DataStore.getData()
            startActivity(Intent(this, GreetingActivity::class.java))
        }
    }
}