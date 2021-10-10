package com.dungtran.plantcare

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private var backPressedTime:Long = 0
    lateinit var backToast:Toast
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    @SuppressLint("ShowToast")
    override fun onBackPressed() {
        backToast = Toast.makeText(this, "Ấn back một lần nữa để thoát.", Toast.LENGTH_SHORT)
        if (backPressedTime + 2000 > System.currentTimeMillis()) {
            backToast.cancel()
            super.onBackPressed()
            return
        } else {
            backToast.show()
        }
        backPressedTime = System.currentTimeMillis()
    }
}