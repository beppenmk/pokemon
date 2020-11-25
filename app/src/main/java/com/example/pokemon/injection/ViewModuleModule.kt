package com.example.pokemon.injection

import android.content.SharedPreferences
import androidx.preference.PreferenceManager.getDefaultSharedPreferences
import com.example.pokemon.ui.viewmodel.TestViewModel
import org.koin.android.ext.koin.androidApplication
import org.koin.androidx.viewmodel.dsl.viewModel


import org.koin.dsl.module

val viewModelModule = module {

    viewModel { TestViewModel(getTestUseCase = get())}


}

