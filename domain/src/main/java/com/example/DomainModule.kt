package com.example


import com.example.usecase.GetTestUseCase
import org.koin.dsl.module

val domainModule = module {

    //USECASE
    factory { GetTestUseCase(get()) }
}


