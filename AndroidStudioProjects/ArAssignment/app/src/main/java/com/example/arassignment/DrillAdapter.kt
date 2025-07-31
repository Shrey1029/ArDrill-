package com.example.arassignment

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class DrillAdapter(
    private val drills: List<Drill>,
    private val onDrillClick: (Drill) -> Unit
) : RecyclerView.Adapter<DrillAdapter.DrillViewHolder>() {

    class DrillViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val drillImage: ImageView = view.findViewById(R.id.imageViewDrill)
        val drillName: TextView = view.findViewById(R.id.textViewDrillName)
        val drillDescription: TextView = view.findViewById(R.id.textViewDrillDescription)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DrillViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_drill, parent, false)
        return DrillViewHolder(view)
    }

    override fun onBindViewHolder(holder: DrillViewHolder, position: Int) {
        val drill = drills[position]
        holder.drillImage.setImageResource(drill.imageResource)
        holder.drillName.text = drill.name
        holder.drillDescription.text = drill.description

        holder.itemView.setOnClickListener {
            onDrillClick(drill)
        }
    }

    override fun getItemCount() = drills.size
}