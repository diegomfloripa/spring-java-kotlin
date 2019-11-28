package com.involves.devtalks.contract

import com.involves.devtalks.domain.Store
import javax.validation.constraints.NotBlank

class StoreContract(
        val id: String? = null,
        @field:NotBlank val name: String) {

    constructor(domain: Store) : this(
            id = domain.id,
            name = domain.name
    )

    fun toDomain(): Store = Store(id, name)
}