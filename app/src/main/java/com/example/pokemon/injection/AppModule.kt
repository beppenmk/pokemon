package com.example.pokemon.injection

import android.content.SharedPreferences
import androidx.preference.PreferenceManager.getDefaultSharedPreferences
import org.koin.android.ext.koin.androidApplication


import org.koin.dsl.module

val appModule = module {

    /*SHAREDPREFERENCES*/
    single<SharedPreferences> { getDefaultSharedPreferences(androidApplication()) }


}

