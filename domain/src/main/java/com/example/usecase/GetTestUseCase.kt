package com.example.usecase

import com.example.repository.TestRepository

class GetTestUseCase(private var repository: TestRepository) {

    fun invoke(): Any {
        return repository.getTest()
    }
}