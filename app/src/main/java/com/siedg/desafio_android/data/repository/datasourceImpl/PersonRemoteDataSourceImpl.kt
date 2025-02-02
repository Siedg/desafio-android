package com.siedg.desafio_android.data.repository.datasourceImpl

import com.siedg.desafio_android.data.api.ApiService
import com.siedg.desafio_android.data.model.Person
import com.siedg.desafio_android.data.model.PersonList
import com.siedg.desafio_android.data.repository.datasource.PersonRemoteDataSource
import retrofit2.Response

class PersonRemoteDataSourceImpl (
    private val service: ApiService,
//    private val index: Int
): PersonRemoteDataSource {
    override suspend fun getPersonList(index: Int): Response<PersonList> = service.getPersonList(index)
}