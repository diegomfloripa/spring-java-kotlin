package com.involves.devtalks.service

import com.involves.devtalks.domain.Store
import com.involves.devtalks.repository.StoreRepository
import org.springframework.stereotype.Service

@Service
class StoreService(private val repository: StoreRepository) {

    fun findAll() : List<Store> = repository.findAll()

    fun save(store: Store) : Store = repository.save(store)
}