package com.involves.devtalks.domain

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Store(
        @Id val id: String? = null,
        val name: String) {
}