package com.example.lenovo.sqllite

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query

/**
 * Created by LENOVO on 15/05/2018.
 */
@Dao
interface CarDao {
    @Insert
    fun insert(Cr :Car)

    @Query("select * from Car")
    fun cars():List<Car>
}