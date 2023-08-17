package com.kotlin.daggerexample

import android.util.Log
import javax.inject.Inject

class EmailService @Inject constructor() {

    fun send(email: String){
        Log.d("updates", "email sent to $email")
    }
}