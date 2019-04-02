package com.example.kstuapp.LoginMVP.Model

import android.text.TextUtils
import android.util.Patterns

class User :IUser {
    private var email:String = " "
    private var password:String = " "

    constructor(email: String, password: String) {
        this.email = email
        this.password = password
    }

    override fun getEmail(): String {
        return this.email
    }

    override fun getPassword(): String {
        return this.password
    }

    override fun isValidData(): Boolean {
        return TextUtils.isEmpty(email)
               && Patterns.EMAIL_ADDRESS.matcher(getEmail()).matches()
                && getPassword().length > 5
    }
}