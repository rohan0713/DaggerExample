package com.kotlin.daggerexample

import android.util.Log
import javax.inject.Inject

class UserRepository @Inject constructor() {

    fun saveData(email: String, password: String){
        Log.d("updates", "Saved into db -> $email, $password");
    }
}