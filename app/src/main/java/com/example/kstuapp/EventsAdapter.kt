package com.example.kstuapp

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView

class EventsAdapter(private val list: List<Events>) : RecyclerView.Adapter<EventsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EventsViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return EventsViewHolder(inflater, parent)
    }

    override fun onBindViewHolder(holder: EventsViewHolder, position: Int) {
        val event: Events = list[position]
        holder.bind(event)
    }

    override fun getItemCount(): Int = list.size

}

class EventsViewHolder(inflater: LayoutInflater, parent: ViewGroup) :
    RecyclerView.ViewHolder(inflater.inflate(R.layout.events_item, parent, false)) {
    private var _dayDateView: TextView? = null
    private var _monthDateView: TextView? = null
    private var _titleView: TextView? = null


    init {
        _dayDateView = itemView.findViewById(R.id.events_day)
        _monthDateView=itemView.findViewById(R.id.events_month)
        _titleView = itemView.findViewById(R.id.events_title)
    }

    fun bind(event: Events) {
        _dayDateView?.text = event.dayDate.toString()
        _monthDateView?.text=event.monthDate.toUpperCase()
        _titleView?.text = event.title

    }
}