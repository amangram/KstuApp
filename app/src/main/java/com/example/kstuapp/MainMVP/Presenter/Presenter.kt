package com.example.kstuapp.MainMVP.Presenter

import android.content.Context
import android.support.v7.app.AppCompatActivity
import com.example.kstuapp.MainMVP.Model.EventsModel
import com.example.kstuapp.MainMVP.Model.NewsModel
import com.example.kstuapp.fragments.News.NewsFragment
import com.example.kstuapp.R
import com.example.kstuapp.fragments.LentaFragment
import com.example.kstuapp.fragments.LocationFragment
import com.example.kstuapp.fragments.SettingFragment
import com.example.kstuapp.fragments.TimetableFragment

class Presenter() :IPresenter {

    lateinit var NewsModel:NewsModel
    lateinit var EventsModel:EventsModel
    lateinit var mView:AppCompatActivity
    var mContext:Context?=null
    constructor(context: Context):this(){
        mContext = context
        EventsModel = EventsModel()
        NewsModel = com.example.kstuapp.MainMVP.Model.NewsModel()
    }
    constructor(view:AppCompatActivity) : this() {
        mView = view
    }
    override fun replaceFragment(id: Int) {
        val fragment =  when (id){
            R.id.nav_news -> {
                LentaFragment()
            }
            R.id.nav_map -> {
                LocationFragment()
            }
            R.id.nav_timetable -> {
                TimetableFragment()
            }
            R.id.nav_setting -> {
                SettingFragment()
            }
            else -> NewsFragment()
        }
        mView.supportFragmentManager.beginTransaction().replace(R.id.container,fragment).addToBackStack(null).commit()
    }

}