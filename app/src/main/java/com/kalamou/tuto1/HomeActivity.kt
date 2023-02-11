package com.kalamou.tuto1

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
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
            Toast.makeText(this, "Vous avez cliqué sur l'image", Toast.LENGTH_SHORT).show()
            startActivity(Intent(this, DiarraActivity::class.java))
        }
    }

    //TODO You dont need to use this method down below
    //TODO The switch will be handled inside the DiarraActivity
    /*private fun onClickSwitchActivity(view: Any, function: () -> Unit): Any {
        intent = onNewIntent(this, DiarraActivity.class));
        startActivity (intent);
        return

    }*/



}