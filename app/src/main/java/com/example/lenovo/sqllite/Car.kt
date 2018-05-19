package com.example.lenovo.sqllite

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey


/**
 * Created by LENOVO on 15/05/2018.
 */

@Entity
data class Car(
        @PrimaryKey
        val crId:Long,

        @ColumnInfo(name = "car_name")
        val crName:String,

        @ColumnInfo(name = "crOnr_name")
        val crOnr:String

)


