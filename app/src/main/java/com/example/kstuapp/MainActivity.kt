package com.example.kstuapp


import android.os.Bundle
import android.support.design.widget.NavigationView
import android.support.v4.view.GravityCompat
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import com.example.kstuapp.MainMVP.Presenter.Presenter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
    lateinit var mPresenter: Presenter
    lateinit var toggle:ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        this.mPresenter = Presenter(this)
    //------------ Code for View Pager----------------
//        val fragmentAdapter = MyPagerAdapter(supportFragmentManager)
//        viewpager.adapter = fragmentAdapter
//        tabs.setupWithViewPager(viewpager)

    //-----------------------------
//        supportFragmentManager.beginTransaction().replace(R.id.container, SettingFragment()).addToBackStack(null).commit()
        mPresenter.replaceFragment(R.id.nav_news)
    // Code for Navigation drawer
        toggle = ActionBarDrawerToggle(
            this, homeLayout, R.string.navigation_drawer_open, R.string.navigation_drawer_close
        )

        homeLayout.addDrawerListener(toggle)
        toggle.syncState()
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        nav_view.setNavigationItemSelectedListener(this)
        /*change_btn.setOnClickListener{
            mPresenter.replaceFragment(R.id.nav_timetable)
            }*/
        }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.navigation, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (toggle.onOptionsItemSelected(item)){
            return true
        }
        when (item.itemId) {
            R.id.action_settings -> return true
            else -> return super.onOptionsItemSelected(item)
        }
    }
    /*fun displayScreen(id:Int){
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
            else -> LentaFragment()
        }
        supportFragmentManager.beginTransaction().replace(R.id.container,fragment).addToBackStack(null).commit()
    }*/
    override fun onNavigationItemSelected(menuItem: MenuItem): Boolean {
   /*     when (menuItem.itemId){
            R.id.action_settings ->{
//                supportFragmentManager.beginTransaction().add(R.id.container, LentaFragment()).addToBackStack(null).commit()
            }
            R.id.nav_news -> {
//                supportFragmentManager.beginTransaction().add(R.id.container, LentaFragment()).addToBackStack(null).commit()
                Toast.makeText(this,"nav news",Toast.LENGTH_SHORT).show()
            }
            R.id.nav_map -> {
//                supportFragmentManager.beginTransaction().add(R.id.container,LocationFragment()).addToBackStack(null).commit()
                Toast.makeText(this,"nav map",Toast.LENGTH_SHORT).show()
            }
            R.id.nav_timetable -> {
//                supportFragmentManager.beginTransaction().add(R.id.container,TimetableFragment()).addToBackStack(null).commit()
                Toast.makeText(this,"nav timetable",Toast.LENGTH_SHORT).show()
            }
            R.id.nav_setting -> {
                supportFragmentManager.beginTransaction().add(R.id.container,SettingFragment()).addToBackStack(null).commit()
                Toast.makeText(this,"nav setting",Toast.LENGTH_SHORT).show()
            }
            R.id.nav_share -> {
                Toast.makeText(this,"nav share",Toast.LENGTH_SHORT).show()
            }
            R.id.nav_logout -> {
                Toast.makeText(this,"nav logout",Toast.LENGTH_SHORT).show()
            }
        }*/
        mPresenter.replaceFragment(menuItem.itemId)
        homeLayout.closeDrawer(GravityCompat.START)
        return true
    }




}
