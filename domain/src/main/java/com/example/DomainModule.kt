package com.example


import com.example.usecase.GetTestUseCase
import org.koin.dsl.module

val domainModule = module {

}


val useCaseModule = module {
    factory { GetTestUseCase(get()) }
}