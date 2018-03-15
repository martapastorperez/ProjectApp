package com.example.marta.projectapp

import android.annotation.SuppressLint
import android.graphics.drawable.AnimationDrawable
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import android.view.animation.RotateAnimation
import android.widget.Button
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_one.*

class MainActivity : AppCompatActivity() {

    var isFragmentOneLoaded = true
    val manager = supportFragmentManager

    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)





        val Change = findViewById<Button>(R.id.btn_change)
        ShowFragmentOne()
        Change.setOnClickListener({
            if (isFragmentOneLoaded)

                ShowFragmentTwo()



            else
                ShowFragmentOne()
            val img = findViewById<View>(R.id.imageView2) as ImageView
            img.setBackgroundResource(R.drawable.running_alice)

            // Get the background, which has been compiled to an AnimationDrawable object.
            val frameAnimation = img.background as AnimationDrawable

            // Start the animation (looped playback by default).
            frameAnimation.start()

            val img2 = findViewById<View>(R.id.imageC) as ImageView
            img2.animate().setDuration(500).rotation(360f)

        })




    }

    fun ShowFragmentOne() {

        val transaction = manager.beginTransaction()
        val fragment = FragmentOne()

        transaction.replace(R.id.fragment_holder, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
        isFragmentOneLoaded = true



    }

    fun ShowFragmentTwo() {
        val transaction = manager.beginTransaction()
        val fragment = FragmentTwo()
        transaction.replace(R.id.fragment_holder,fragment)
        transaction.addToBackStack(null)
        transaction.commit()
        isFragmentOneLoaded = false
    }


}


