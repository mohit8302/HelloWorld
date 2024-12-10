package com.example.portfolioapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.appcompat.widget.Toolbar
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(false)


        val btnSkills = findViewById<Button>(R.id.btnSkill)
        val btnEducation = findViewById<Button>(R.id.button2)
        val btnWork = findViewById<Button>(R.id.button3)
        val btnAchievements = findViewById<Button>(R.id.button4)

        // Setting onClickListeners for all buttons
        btnSkills.setOnClickListener {
            try {
                val intent = Intent(this, SkillsActivity::class.java)
                startActivity(intent)
            } catch (e: Exception) {
                Log.e("MainActivity", "Error starting SkillsActivity", e)
            }
        }

        btnEducation.setOnClickListener {
            try {
                val intent = Intent(this, EducationActivity::class.java)
                startActivity(intent)
            } catch (e: Exception) {
                Log.e("MainActivity", "Error starting EducationActivity", e)
            }
        }

        btnWork.setOnClickListener {
            try {
                val intent = Intent(this, WorkActivity::class.java)
                startActivity(intent)
            } catch (e: Exception) {
                Log.e("MainActivity", "Error starting WorkActivity", e)
            }
        }

        btnAchievements.setOnClickListener {
            try {
                val intent = Intent(this, AchievementsActivity::class.java)
                startActivity(intent)
            } catch (e: Exception) {
                Log.e("MainActivity", "Error starting AchievementsActivity", e)
            }
        }
    }
}

