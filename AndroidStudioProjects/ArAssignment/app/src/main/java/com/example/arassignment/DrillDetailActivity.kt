package com.example.arassignment

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DrillDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_drill_detail)

        val drillName = intent.getStringExtra("drill_name") ?: ""
        val drillDescription = intent.getStringExtra("drill_description") ?: ""
        val drillTips = intent.getStringExtra("drill_tips") ?: ""
        val drillImage = intent.getIntExtra("drill_image", R.drawable.ic_launcher_foreground)

        findViewById<ImageView>(R.id.imageViewDrillDetail).setImageResource(drillImage)
        findViewById<TextView>(R.id.textViewDrillNameDetail).text = drillName
        findViewById<TextView>(R.id.textViewDrillDescriptionDetail).text = drillDescription
        findViewById<TextView>(R.id.textViewDrillTips).text = drillTips

        findViewById<Button>(R.id.buttonStartAR).setOnClickListener {
            val intent = Intent(this, ArActivity::class.java)
            intent.putExtra("drill_name", drillName)
            startActivity(intent)
        }
    }
}