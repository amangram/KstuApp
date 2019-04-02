package com.example.kstuapp.fragments.News


import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.kstuapp.adapters.EventsAdapter
import com.example.kstuapp.MainMVP.Presenter.Presenter
import com.example.kstuapp.R
import kotlinx.android.synthetic.main.fragment_events.*


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */


class EventsFragment : Fragment() {
   lateinit var mPresenter: Presenter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_events, container, false)
    }

    override fun onAttach(context: Context?) {
        mPresenter = Presenter(context!!)
        super.onAttach(context)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        events_recycler_view.apply {
            layoutManager= LinearLayoutManager(activity)
            adapter= EventsAdapter(mPresenter.EventsModel.getData())
        }
    }

    companion object {
        fun newInstance(): EventsFragment =
            EventsFragment()
    }
}
