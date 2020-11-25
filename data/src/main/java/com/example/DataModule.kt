package com.example

import com.example.datasource.RemoteDataSource
import com.example.reposiory.TestRepositoryImpl
import com.example.repository.TestRepository
import org.koin.dsl.module

val dataModule = module {

    factory<TestRepository> {
        TestRepositoryImpl(get())
    }



}