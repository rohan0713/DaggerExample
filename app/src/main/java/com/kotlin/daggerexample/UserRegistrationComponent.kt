package com.kotlin.daggerexample

import dagger.Component

@Component
interface UserRegistrationComponent {

    fun userRegisterService() : UserRegistrationService
}