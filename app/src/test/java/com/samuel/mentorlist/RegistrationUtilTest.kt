package com.samuel.mentorlist

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationUtilTest {
    @Test
    fun `empty username returns false`() {
        val result = RegistrationUtil.ValidateRegistrationDetails(
            username = "",
            password = "123",
            email ="sam",
            confirmPassword = "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `empty email returns false` (){
        val result = RegistrationUtil.ValidateRegistrationDetails(
            username = "sam",
            email = "",
            password = "123",
            confirmPassword = "123",
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `empty password returns false` (){
        val result = RegistrationUtil.ValidateRegistrationDetails(
            username = "sam",
            email = "sam@gmail.com",
            password = "",
            confirmPassword = "",
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `confirm password not equal to password returns false`() {
        val result = RegistrationUtil.ValidateRegistrationDetails(
            username = "sam",
            email = "sam@gmail.com",
            password = "324",
            confirmPassword = "1234",
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `valid username, email and correctly repeated password returns true`() {
        val result = RegistrationUtil.ValidateRegistrationDetails(
            username = "sam",
            email = "sam@gmail.com",
            password = "123",
            confirmPassword = "123"
        )
        assertThat(result).isTrue()
    }

}