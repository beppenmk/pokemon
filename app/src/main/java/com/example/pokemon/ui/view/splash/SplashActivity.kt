package com.example.pokemon.ui.view.splash

import android.os.Bundle
import android.view.View
import android.view.animation.AlphaAnimation
import android.view.animation.Animation
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation.findNavController
import com.example.pokemon.R


class SplashActivity : AppCompatActivity() {

    private lateinit var splashIv: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_activity)
        splashIv = findViewById(R.id.splash_iv)

        val alphaAnimation = AlphaAnimation(0.0f, 1.0f)
        alphaAnimation.duration = 4000
        alphaAnimation.fillAfter = true
        alphaAnimation.setAnimationListener(object : Animation.AnimationListener {
            override fun onAnimationRepeat(p0: Animation?) {

            }

            override fun onAnimationEnd(p0: Animation?) {


            }

            override fun onAnimationStart(p0: Animation?) {
                splashIv.visibility = View.VISIBLE
            }

        })
        splashIv.startAnimation(alphaAnimation)


    }
}

