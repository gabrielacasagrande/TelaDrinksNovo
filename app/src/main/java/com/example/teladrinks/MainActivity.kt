package com.example.teladrinks

import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toolbar
import androidx.palette.graphics.Palette


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       val Images = arrayListOf(R.id.image_gin,R.id.image_beach,
           R.id.image_drymartini,R.id.image_vinhoq,R.id.image_morrito)

        val toolbar = findViewById<androidx.appcompat.widget.Toolbar>(R.id.toolbarLayout)
        setSupportActionBar(toolbar)


        //Images.setOnClickListener{
        //    val intent = Intent(this,ShareActivity::class.java)
        //    startActivity(intent)
       // }

    }
}



