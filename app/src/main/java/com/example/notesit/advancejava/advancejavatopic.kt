package com.example.notesit.advancejava

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.notesit.MainActivity
import com.example.notesit.R
import com.example.notesit.ai.ai

class advancejavatopic : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_advancejavatopic)

        val aiButton: ImageButton = findViewById(R.id.aiii)
        val intro: TextView = findViewById(R.id.introd)
        val intr: TextView = findViewById(R.id.introdu)
        val intro1: TextView = findViewById(R.id.intro1)
        val intr03: TextView = findViewById(R.id.introo2)
        val introo: TextView = findViewById(R.id.intro)


        aiButton.setOnClickListener {
            Toast.makeText(this, "😒😒", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        intro.setOnClickListener {
            Toast.makeText(this, "Advance Java  👌👌", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, advancejava::class.java)
            startActivity(intent)

        }
        intr.setOnClickListener {
            Toast.makeText(this, "Advance Java  👌👌", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, advjavaunit2::class.java)
            startActivity(intent)
        }
        intro1.setOnClickListener {
            Toast.makeText(this, "Advance Java  👌👌", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, advjavaunit3::class.java)
            startActivity(intent)
        }
        intr03.setOnClickListener {
            Toast.makeText(this, "Advance Java  👌👌", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, advjavaunit4::class.java)
            startActivity(intent)
        }
        introo.setOnClickListener {
            Toast.makeText(this, "Advance Java  👌👌", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, advjava5::class.java)
            startActivity(intent)
        }
    }
}

