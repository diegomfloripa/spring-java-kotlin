package com.involves.devtalks.controller

import com.involves.devtalks.contract.StoreContract
import com.involves.devtalks.domain.Store
import com.involves.devtalks.service.StoreService
import org.springframework.web.bind.annotation.*
import javax.validation.Valid

@RestController
@RequestMapping("store")
class StoreController(private val service: StoreService) {

    @GetMapping
    fun find() : List<StoreContract> {
        val findAll = service.findAll()
        return findAll.map(::StoreContract)
    }

    @PostMapping
    fun save(@RequestBody @Valid storeContract: StoreContract) : StoreContract {
        return storeContract
                .let { it.toDomain() }
                .run { service.save(this) }
                .let { StoreContract(it)}
    }
}