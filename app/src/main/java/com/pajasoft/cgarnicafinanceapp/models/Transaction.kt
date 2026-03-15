package com.pajasoft.cgarnicafinanceapp.models

data class Transaction(
    val nombre:String,
    val categoria: String,
    val monto: Double,
    val time: String
)