package com.example.mahdi.atmosphere.models.openWeather.oneCall

import com.google.gson.annotations.SerializedName

data class FeelsLike(
        @SerializedName("day")
        val day: Double,

        @SerializedName("night")
        val night: Double,

        @SerializedName("eve")
        val eve: Double,

        @SerializedName("morn")
        val morn: Double
)