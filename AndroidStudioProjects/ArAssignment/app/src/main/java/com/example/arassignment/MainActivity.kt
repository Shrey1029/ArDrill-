package com.example.arassignment


import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var drillAdapter: DrillAdapter
    private val drillList = listOf(
        Drill(
            1,
            "Power Drill Pro",
            "High-performance cordless drill with 18V battery. Perfect for heavy-duty drilling tasks.",
            "• Always wear safety goggles\n• Use proper drill bits for material\n• Start with low speed for precision",
            R.drawable.ic_launcher_foreground // Placeholder
        ),
        Drill(
            2,
            "Hammer Drill X200",
            "Professional hammer drill for concrete and masonry work. Features impact mechanism.",
            "• Use in hammer mode for concrete\n• Apply steady pressure\n• Let the drill do the work",
            R.drawable.ic_launcher_foreground // Placeholder
        ),
        Drill(
            3,
            "Precision Mini Drill",
            "Compact drill for detailed work and tight spaces. Variable speed control.",
            "• Perfect for small holes\n• Use low torque setting\n• Great for delicate materials",
            R.drawable.ic_launcher_foreground // Placeholder
        )
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupRecyclerView()
    }

    private fun setupRecyclerView() {
        recyclerView = findViewById(R.id.recyclerViewDrills)
        drillAdapter = DrillAdapter(drillList) { drill ->
            val intent = Intent(this, DrillDetailActivity::class.java)
            intent.putExtra("drill_id", drill.id)
            intent.putExtra("drill_name", drill.name)
            intent.putExtra("drill_description", drill.description)
            intent.putExtra("drill_tips", drill.tips)
            intent.putExtra("drill_image", drill.imageResource)
            startActivity(intent)
        }

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = drillAdapter
    }
}