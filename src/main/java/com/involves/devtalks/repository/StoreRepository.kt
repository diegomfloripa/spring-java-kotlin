package com.involves.devtalks.repository

import com.involves.devtalks.domain.Store
import org.springframework.data.mongodb.repository.MongoRepository

interface StoreRepository: MongoRepository<Store, String>