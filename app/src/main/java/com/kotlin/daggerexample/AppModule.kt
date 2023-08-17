package com.kotlin.daggerexample

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun userRegisterService(
        userRepository: UserRepository,
        emailService: EmailService
    ): UserRegistrationService {
        return UserRegistrationService(userRepository, emailService)
    }
}