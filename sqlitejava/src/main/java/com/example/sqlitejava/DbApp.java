package com.example.sqlitejava;

import android.app.Application;
import android.arch.persistence.room.Room;

/**
 * Created by LENOVO on 15/05/2018.
 */

public class DbApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        AppDb db = Room.databaseBuilder(this,
                AppDb.class, "dbCar").build();
    }

}
