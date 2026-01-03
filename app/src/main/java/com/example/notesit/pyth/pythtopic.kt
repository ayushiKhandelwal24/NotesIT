package com.example.notesit.pyth

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

class pythtopic : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pythtopic)
        val aiButton: ImageButton = findViewById(R.id.aiii)
        val intro: TextView = findViewById(R.id.intro)
        val intr: TextView = findViewById(R.id.introd)
        val intro1: TextView = findViewById(R.id.intro1)
        val introo: TextView = findViewById(R.id.introdu)
        val introo2: TextView = findViewById(R.id.intro)


        aiButton.setOnClickListener {
            Toast.makeText(this, "😒😒", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        intr.setOnClickListener {
            Toast.makeText(this, "Python 👌👌", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, python::class.java)
            startActivity(intent)

        }
        introo2.setOnClickListener {
            Toast.makeText(this, "Python 👌👌", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, Unit2::class.java)
            startActivity(intent)

        }
        introo.setOnClickListener {
            Toast.makeText(this, "Python 👌👌", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, PythonUnit3::class.java)
            startActivity(intent)
        }
        intro.setOnClickListener {
            Toast.makeText(this, "Python 👌👌", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, pythonunit4::class.java)
            startActivity(intent)
        }
        intro1.setOnClickListener {
            Toast.makeText(this, "Python 👌👌", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, pythonunit5::class.java)
            startActivity(intent)
        }
    }
}
