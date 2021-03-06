package com.example.test_loadmore.data

import com.example.test_loadmore.data.dto.categories.Category
import com.example.test_loadmore.data.dto.categories.CategoryL
import com.example.test_loadmore.data.dto.config.PopularResource
import com.example.test_loadmore.data.dto.config.TopResource
import kotlinx.coroutines.flow.Flow

interface DataRepositorySource{
    suspend fun requestTop(): Flow<Resource<TopResource>>

    suspend fun request4D(): Flow<Resource<PopularResource>>

    suspend fun request4K(): Flow<Resource<PopularResource>>

    suspend fun requestLive(): Flow<Resource<PopularResource>>

    suspend fun requestCategory(): Flow<Resource<List<Category>>>

    suspend fun requestViewAll(): Flow<Resource<List<CategoryL>>>

    suspend fun addToFavorite(content: String): Flow<Resource<Boolean>>

    suspend fun isFavourite(content: String): Flow<Resource<Boolean>>

    suspend fun removeFromFavourite(content: String): Flow<Resource<Boolean>>
}