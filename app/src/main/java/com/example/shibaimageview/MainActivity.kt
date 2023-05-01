package com.example.shibaimageview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var touchButton: Button
    private lateinit var foodButton: Button
    private lateinit var imageView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
      // Get a reference to the Button and TextView component
        touchButton = findViewById(R.id.btn_Touch)
        foodButton = findViewById(R.id.btn_Food)
        imageView = findViewById(R.id.imageView_Dog)

     //Set an OnClickListener to get angry_shiba when btn_Touch is click
        touchButton.setOnClickListener {
            imageView.setImageResource(R.drawable.angry_shiba)
            Toast.makeText(
                this, "Angry Shiba dont want to be touched!",
                Toast.LENGTH_SHORT).show()

      //Set an OnClickListener to get calm_shiba when btn_Food is click
            foodButton.setOnClickListener {
                imageView.setImageResource(R.drawable.calm_shiba)
                Toast.makeText(
                    this, "Calm Shiba wants food to eat!",
                    Toast.LENGTH_SHORT).show()
            }
        }
    }
}