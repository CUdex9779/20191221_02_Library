package com.example.a20191221_02_library

import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity() {

    val mContext = this

    abstract fun setEvents()
    abstract fun setValues()
}