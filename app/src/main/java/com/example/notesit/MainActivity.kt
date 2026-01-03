package com.example.notesit

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.notesit.advancejava.advancejavatopic
import com.example.notesit.ai.aitopic
import com.example.notesit.java.javatopic
import com.example.notesit.pyth.pythtopic

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        // Find the ImageButtons
        val aiButton: ImageButton = findViewById(R.id.Ai)
        val javaButton: ImageButton = findViewById(R.id.Java)
        val javaAdv: ImageButton =findViewById(R.id.Advance_Java)
        val python: ImageButton =findViewById(R.id.Python)


        // Click listener for AI Button
        aiButton.setOnClickListener {
            Toast.makeText(this, "AI❤️❤️", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, aitopic::class.java)
            startActivity(intent)
        }

        // Click listener for Java Button
        javaButton.setOnClickListener {
            Toast.makeText(this, "Java💕💕", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, javatopic::class.java)
            startActivity(intent)
        }
        javaAdv.setOnClickListener {
            Toast.makeText(this, "Java Advance😍😍", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, advancejavatopic::class.java)
            startActivity(intent)
        }
        python.setOnClickListener {
            Toast.makeText(this, "Python👌👌", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, pythtopic::class.java)
            startActivity(intent)
        }
    }
}
