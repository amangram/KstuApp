package com.example.kstuapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.kstuapp.LoginMVP.Presenter.LoginPresenter
import com.example.kstuapp.LoginMVP.View.ILoginView
import kotlinx.android.synthetic.main.activity_log_in.*

class LogInActivity : AppCompatActivity(),ILoginView {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in)
        studentNumber_et.text
        val loginPresenter:LoginPresenter = LoginPresenter(this)
        btn_SignIn.setOnClickListener {
            loginPresenter.onLogin(studentNumber_et.text.toString(),studentPassword_et.text.toString())
        }
    }
    override fun onLoginResult(message: String) {
        Toast.makeText(this,message,Toast.LENGTH_SHORT).show()
    }
}
