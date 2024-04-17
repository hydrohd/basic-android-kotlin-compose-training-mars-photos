package com.example.marsphotos.data

import com.example.marsphotos.network.MarsPhoto
import com.example.marsphotos.network.MarsApiService

interface MarsPhotosRepository {

    suspend fun getMarsPhotos(): List<MarsPhoto>
}

class NetworkMarsPhotosRepository(
    private val marsApiService: MarsApiService
): MarsPhotosRepository {

    override suspend fun getMarsPhotos(): List<MarsPhoto> {
        return marsApiService.getPhotos()
    }
}