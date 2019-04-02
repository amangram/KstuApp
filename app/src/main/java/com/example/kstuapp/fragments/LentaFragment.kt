package com.example.kstuapp.fragments

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.kstuapp.MainMVP.Presenter.Presenter
import com.example.kstuapp.adapters.MyPagerAdapter
import com.example.kstuapp.R
import kotlinx.android.synthetic.main.fragment_lenta.view.*

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"
class LentaFragment : Fragment() {
    lateinit var mContext: AppCompatActivity
    private var param1: String? = null
    private var param2: String? = null
    lateinit var mPresenter: Presenter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)

        }
    }

    override fun onAttach(context: Context?) {
        mContext = context!! as AppCompatActivity
        super.onAttach(context)
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val layout = inflater.inflate(R.layout.fragment_lenta, container, false)
        //------------ Code for View Pager----------------
        val fragmentAdapter = MyPagerAdapter(fragmentManager!!)
        layout.viewpager.adapter=fragmentAdapter
        layout.tabs.setupWithViewPager(layout.viewpager)
        return layout
    }

}