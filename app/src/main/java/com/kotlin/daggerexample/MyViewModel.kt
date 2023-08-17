package com.kotlin.daggerexample

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MyViewModel @Inject constructor(
    private val userRegistrationService: UserRegistrationService
) : ViewModel() {

    fun register(email: String, password: String){
        userRegistrationService.registerUser(email, password)
    }
}