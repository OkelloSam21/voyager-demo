package com.samuel.mentorlist

object RegistrationUtil {
    fun EValidateRegistrationDetails(
        username: String,
        email: String,
        password: String,
        confirmPassword: String
    ) {
        if (username.isEmpty()) {
            throw Exception("Please enter a username")
        }
        if (email.isEmpty()) {
            throw Exception("Please enter an email")
        }
        if (password.isEmpty()) {
            throw Exception("Please enter a password")
        }
        if (confirmPassword.isEmpty()) {
            throw Exception("Please confirm your password")
        }
        if (password != confirmPassword) {
            throw Exception("Passwords do not match")
        }
    }
}