package com.example.lenovo.sqllite

import android.app.Application
import android.arch.persistence.room.Room



/**
 * Created by LENOVO on 15/05/2018.
 */
class DbApp : Application(){

    val dbApp:AppDb by lazy{
        Room.databaseBuilder(this@DbApp,
                AppDb::class.java, "carDb").build()
    }

    override fun onCreate() {
        super.onCreate()

        dbApp
    }

}