package com.example.laboratorio11.network.dto.register

import com.google.gson.annotations.SerializedName

// TODO: Create RegisterResponse data class
data class RegisterResponse (
    @SerializedName("msg") val message: String
)