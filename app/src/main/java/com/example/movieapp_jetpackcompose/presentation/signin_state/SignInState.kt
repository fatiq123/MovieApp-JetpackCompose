package com.example.movieapp_jetpackcompose.presentation.signin_state

data class SignInState(
    val isLoading: Boolean = false,
    val isSuccess: String? = "",
    val isError: String? = ""
)