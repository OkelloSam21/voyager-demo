package com.samuel.mentorlist

import org.junit.Assert.*
import org.junit.Test

class RegistrationUtilTest {
    @Test
    fun `empty username returns false`() {
        val result = RegistrationUtil.EValidateRegistrationDetails(
            username = "",
            password = "123",
            email ="sam",
            confirmPassword = "123"
        )
        assertEquals(result, false)
    }

}