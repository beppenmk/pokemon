package com.example.pokemon.ui.view.splash

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AlphaAnimation
import android.view.animation.Animation
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.pokemon.R


class SplashFragment : Fragment() {


    private lateinit var splashIv: ImageView


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val alphaAnimation = AlphaAnimation(0.0f, 1.0f)
        alphaAnimation.duration = 4000
        alphaAnimation.fillAfter = true
        alphaAnimation.setAnimationListener(object : Animation.AnimationListener {
            override fun onAnimationRepeat(p0: Animation?) {

            }

            override fun onAnimationEnd(p0: Animation?) {

                Navigation.findNavController(view).navigate(
                    R.id.action_splashFragment_to_pokemonListFragment
                )
            }

            override fun onAnimationStart(p0: Animation?) {
                splashIv.visibility = View.VISIBLE
            }

        })
        splashIv.startAnimation(alphaAnimation)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        (activity as AppCompatActivity?)!!.supportActionBar!!.hide()
        val view = inflater.inflate(R.layout.splash_fragment, container, false)
        splashIv = view.findViewById(R.id.splash_iv)
        return view
    }


}