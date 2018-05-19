package com.example.sqlitejava;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

/**
 * Created by LENOVO on 15/05/2018.
 */
@Database(version=1,entities = Car.class)
public  abstract class AppDb extends RoomDatabase{
    abstract CarDao carDao();

}
