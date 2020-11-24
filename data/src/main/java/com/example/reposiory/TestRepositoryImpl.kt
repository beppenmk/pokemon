package com.example.reposiory

import com.example.datasource.RemoteDataSource
import com.example.entity.TestEntity
import com.example.repository.TestRepository

class TestRepositoryImpl(
    private var remoteDataSource: RemoteDataSource
) : TestRepository {

    override fun getTest(): Any {
        //remoteDataSource.getData()
        return  TestEntity(response ="TEST ")
    }


}