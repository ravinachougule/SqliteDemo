package com.example.sqlitejava;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by LENOVO on 15/05/2018.
 */
@Entity
class Car {
    @PrimaryKey
    Long crId;

    @ColumnInfo(name = "car_name")
    String crName;

    @ColumnInfo(name = "crOnr_name")
    String crOn;

}