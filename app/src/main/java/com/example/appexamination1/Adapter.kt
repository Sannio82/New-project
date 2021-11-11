package com.example.appexamination1

import android.app.Activity
import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text

class Adapter (val context: Context, val highScoreList: List<HighScore>) :
    RecyclerView.Adapter<Adapter.ViewHolder>() {

    val layoutInflater = LayoutInflater.from(context)

    override fun getItemCount(): Int {

        return highScoreList.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = layoutInflater.inflate(R.layout.list_item, parent, false)

        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        // när en list_view ska visas så tar vi rätt person från vår lista
        val highScore = highScoreList[position]

        // sätter vi in den personens uppgifter i vår view
        holder.userName.text = highScore.name
        holder.score.text = highScore.score.toString()
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        // när en viewholder skapas letar vi reda på två textviews som finns
        // inne i vår itemview
        val userName = itemView.findViewById<TextView>(R.id.userName)
        val score = itemView.findViewById<TextView>(R.id.score)

    }
}


