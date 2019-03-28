package com.example.kstuapp


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_events.*


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
data class Events(val dayDate: Int,val monthDate :String  , val title: String)

class EventsFragment : Fragment() {
    private val kstuEvents = listOf(
        Events(31, "September","Education Day"),
        Events(14,"February","St.Valentine Day"),
        Events(31,"December","New  Year"),
        Events(8,"March","International Women Day")
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_events, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        events_recycler_view.apply {
            layoutManager= LinearLayoutManager(activity)
            adapter= EventsAdapter(kstuEvents)
        }
    }

    companion object {
        fun newInstance(): EventsFragment= EventsFragment()
    }
}
