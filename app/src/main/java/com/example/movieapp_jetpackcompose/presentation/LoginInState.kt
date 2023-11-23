package com.example.movieapp_jetpackcompose.presentation

data class LoginInState(
    val isLoading: Boolean = false,
    val isSuccess: String? = "",
    val isError: String? = ""
)