package com.example.movieapp_jetpackcompose.presentation.signup_state

data class SignUpState(
    val isLoading: Boolean = false,
    val isSuccess: String? = "",
    val isError: String? = ""

)