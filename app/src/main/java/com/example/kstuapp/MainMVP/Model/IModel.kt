package com.example.kstuapp.MainMVP.Model

interface IModel<T>{
    fun getData():ArrayList<T>
    fun setData(data:T)
}