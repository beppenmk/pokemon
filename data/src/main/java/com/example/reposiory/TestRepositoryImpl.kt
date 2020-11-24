package com.example.reposiory

import com.example.datasource.RemoteDataSource
import com.example.entity.TestEntity
import com.example.repository.TestRepository

class TestRepositoyImpl(
    private var remoteDataSource: RemoteDataSource
) : TestRepository {

    override fun getTest(): Any {
        return  TestEntity()
    }


}