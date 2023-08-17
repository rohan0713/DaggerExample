package com.kotlin.daggerexample

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.hilt.navigation.compose.hiltViewModel
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity @Inject constructor() : AppCompatActivity()  {

    private val viewModel: MyViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val userRepository: UserRepository = UserRepository()
//        val emailService: EmailService = EmailService()
//
//        val userRegistrationService = UserRegistrationService(userRepository, emailService)
//        userRegistrationService.registerUser("x.x@gmail.com", "xxxx")

        viewModel.register("rohanramola63@gmail.com", "rohan")

    }
}