package com.example.marta.projectapp

import android.app.Fragment
import android.content.Context
import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import kotlinx.android.synthetic.main.fragment_one.*

/**
 * Created by Marta on 14/03/2018.
 */
class FragmentOne : android.support.v4.app.Fragment(){


    val TAG = "FragmentOne"


    override fun onAttach(context: Context?) {
        Log.d(TAG,"onAttach")
        super.onAttach(context)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG,"onCreate")
        super.onCreate(savedInstanceState)
       // setContentView(R.layout.fragment_one)

        //val boton= findViewById<Button>(R.id.button_start)



    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        Log.d(TAG,"onCreateView")
        return inflater!!.inflate(R.layout.fragment_one,container,false)




        //val btn: Button = view.find(R.id.button_start)
        //btn.setOnClickListener(this)

       // val boton: Button = view.find(R.id.button_start)
        //boton.setOnClickListener({
            // Get the background, which has been compiled to an AnimationDrawable object.
           // val frameAnimation: AnimationDrawable = imageView.background as AnimationDrawable

// Start the animation (looped playback by default).
         //   frameAnimation.start()

        //})

    }


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        Log.d(TAG,"onActivityCreated")
        super.onActivityCreated(savedInstanceState)
    }

    override fun onStart() {
        Log.d(TAG,"onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.d(TAG,"onResume")
        super.onResume()
    }

    override fun onPause() {
        Log.d(TAG,"onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.d(TAG,"onStop")
        super.onStop()
    }

    override fun onDestroyView() {
        Log.d(TAG,"onDestroyView")
        super.onDestroyView()
    }

    override fun onDestroy() {
        Log.d(TAG,"onDestroy")
        super.onDestroy()
    }

    override fun onDetach() {
        Log.d(TAG,"onDetach")
        super.onDetach()
    }


}


