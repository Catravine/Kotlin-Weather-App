package com.carolinecourtney.weatherapp

import android.support.v7.widget.RecyclerView
import android.widget.TextView
import android.view.ViewGroup

/**
 * Created by carolinecourtney on 2/22/17.
 */

class ForecastListAdapter(val items: List<String>): RecyclerView.Adapter<ForecastListAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(TextView(parent.context))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textView.text = items[position]
    }

    override fun getItemCount(): Int = items.size

    class ViewHolder(val textView: TextView): RecyclerView.ViewHolder(textView)

}
