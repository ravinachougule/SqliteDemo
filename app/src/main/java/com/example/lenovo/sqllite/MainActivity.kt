package com.example.lenovo.sqllite

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        Thread{
            val cr=Car(System.currentTimeMillis(),crName = "Android",crOnr = "google")
            (application as DbApp).dbApp.carDao().insert(cr)
            (application as DbApp).dbApp.carDao().cars().forEach{
                Log.i("abc","${it.crId},${it.crName},${it.crOnr}")
            }
        }.start()
    }
}
