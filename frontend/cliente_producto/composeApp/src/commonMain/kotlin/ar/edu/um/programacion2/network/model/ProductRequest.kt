package ar.edu.um.programacion2.network.model

import kotlinx.serialization.Serializable

@Serializable
data class ProductRequest(
    val description: String,
    val price: Double
)