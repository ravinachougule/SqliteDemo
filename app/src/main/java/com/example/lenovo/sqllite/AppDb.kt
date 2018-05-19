package com.example.lenovo.sqllite


import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase

/**
 * Created by LENOVO on 15/05/2018.
 */

@Database(version=1,entities = arrayOf(Car::class))
abstract class AppDb: RoomDatabase() {

    abstract fun carDao():CarDao
}