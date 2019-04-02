package com.example.kstuapp.LoginMVP.Presenter

import com.example.kstuapp.LoginMVP.Model.User
import com.example.kstuapp.LoginMVP.View.ILoginView

class LoginPresenter(var loginView: ILoginView) : ILoginPresenter {
//    lateinit var loginView: ILoginView
    override fun onLogin(mail: String, password: String) {
        val user = User(mail,password)
        val isLoginSucces:Boolean = user.isValidData()
        if (isLoginSucces){
            loginView.onLoginResult("login sucess")
        }else{
            loginView.onLoginResult("login error")
        }
    }
}