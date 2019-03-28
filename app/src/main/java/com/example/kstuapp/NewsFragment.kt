package com.example.kstuapp


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_news.*


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */

data class News(val title: String, val date: Double)

class NewsFragment : Fragment() {


    private val mNicolasCageMovies = listOf(
        News("Putin is arrived", 28.03),
        News("Atambaev prefer cognac and Jeenbekov drinks ovdka", 15.03),
        News("Hybrid between ape and cow was born", 19.02),
        News("Lakers lost their chance to play in Playoff", 15.02),
        News("Adilbek gave Bentley to his girlfriend as a present", 14.02),
        News("Mermaid do a full split", 10.02),
        News("UFO was seen in 8th microdistrict", 30.01),
        News("First news", 29.01)
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_news, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // RecyclerView node initialized here
        list_recycler_view.apply {
            // set a LinearLayoutManager to handle Android
            // RecyclerView behavior
            layoutManager = LinearLayoutManager(activity)
            // set the custom adapter to the RecyclerView
            adapter = NewsAdapter(mNicolasCageMovies)
        }
    }

    companion object {
        fun newInstance(): NewsFragment = NewsFragment()

    }


}
