package com.example.gamenumber

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.gamenumber.databinding.ActivityMainBinding

class MainActivity: AppCompatActivity() {

    private lateinit var ui : ActivityMainBinding
    private lateinit var numberGame: EmojiGame
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ui = ActivityMainBinding.inflate(layoutInflater)
        setContentView(ui.root)
        initialize()

    }

    private fun initialize() {
        ui.rvMain.adapter = EmojiAdapter()
    }
}