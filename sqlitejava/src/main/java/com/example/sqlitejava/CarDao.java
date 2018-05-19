package com.example.sqlitejava;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

/**
 * Created by LENOVO on 15/05/2018.
 */
@Dao
public interface CarDao {
    @Insert
        void insert(Car car);

    @Query("select * from Car")

    List<Car> cars();
}

