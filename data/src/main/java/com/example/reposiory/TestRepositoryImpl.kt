package com.example.reposiory

import com.example.datasource.RemoteDataSource
import com.example.entity.TestEntity
import com.example.repository.TestRepository
import java.time.Instant
import java.time.format.DateTimeFormatter

class TestRepositoryImpl(
    private var remoteDataSource: RemoteDataSource
) : TestRepository {

    override fun getTest(): Any {
        //remoteDataSource.getData()
        return  TestEntity(name ="TEST ${DateTimeFormatter.ISO_INSTANT.format(Instant.now())}")
    }


}