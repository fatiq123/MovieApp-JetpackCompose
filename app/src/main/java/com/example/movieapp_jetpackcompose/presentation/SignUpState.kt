package com.example.movieapp_jetpackcompose.presentation

data class SignUpState(
    val isLoading: Boolean = false,
    val isSuccess: String? = "",
    val isError: String? = ""
)