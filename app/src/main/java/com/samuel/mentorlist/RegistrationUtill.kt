package com.samuel.mentorlist

object RegistrationUtil {
    fun ValidateRegistrationDetails(
        username: String,
        email: String,
        password: String,
        confirmPassword: String
    ): Boolean {
        if (username.isEmpty()) {
//            throw Exception("Please enter a username")
            return false
        }
        if (email.isEmpty()) {
//            throw Exception("Please enter an email")
            return false
        }
        if (password.isEmpty()) {
//            throw Exception("Please enter a password")
            return false
        }
        if (confirmPassword.isEmpty()) {
//            throw Exception("Please confirm your password")
            return false
        }
        if (password != confirmPassword) {
//            throw Exception("Passwords do not match")
            return false
        }
        return true
    }
}