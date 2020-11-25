package com.example.pokemon.ui.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.pokemon.R
import com.example.pokemon.ui.viewmodel.TestViewModel
import org.koin.androidx.viewmodel.ext.android.getViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    private lateinit var testViewModel: TestViewModel
    private lateinit var testBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        testViewModel = getViewModel()
        testBtn = findViewById(R.id.test_btn)

        testBtn.setOnClickListener {
            testViewModel.getTest()
        }

    }
}