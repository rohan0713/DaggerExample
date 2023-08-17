package com.kotlin.daggerexample

import javax.inject.Inject

class UserRegistrationService @Inject constructor(
    private val userRepository: UserRepository,
    private val emailService: EmailService
) {

    fun registerUser(email: String, password: String){
        userRepository.saveData(email, password)
        emailService.send(email)
    }
}