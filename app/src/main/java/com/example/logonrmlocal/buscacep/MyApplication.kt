package com.example.logonrmlocal.buscacep

import com.facebook.stetho.Stetho
import android.app.Application

//classe para utilizar biblioteca stetho
class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        Stetho.initializeWithDefaults(this)
    }
}