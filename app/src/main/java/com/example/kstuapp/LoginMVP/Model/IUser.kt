package com.example.kstuapp.LoginMVP.Model

interface IUser {
    fun getEmail():String?
    fun getPassword():String?
    fun isValidData():Boolean?
}