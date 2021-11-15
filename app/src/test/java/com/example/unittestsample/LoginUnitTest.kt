package com.example.unittestsample

import android.content.Context
import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito.mock

class LoginUnitTest {
    val fakeString = "Login is successful"
    @Test
    fun validLogin() {
//        val myObjectUnderTest = MainActivity(context)
        var utils = Utils()
        // ...when the string is returned from the object under test...
        val result: String? = utils.validate("abc@abc.com", "password")

        // ...then the result should be the expected one.
        assertThat(result, `is`(fakeString))
    }
    @Test
    fun invalidLogin() {
//        val myObjectUnderTest = MainActivity(context)
        var utils = Utils()
        // ...when the string is returned from the object under test...
        val result: String? = utils.validate("abc@ab.com", "password")

        // ...then the result should be the expected one.
        assertThat(result, `is`(fakeString))
    }
    @Test
    fun validEmail() {
//        val myObjectUnderTest = MainActivity(context)
        var utils = Utils()
        // ...when the string is returned from the object under test...
        val result: Boolean? = utils.checkEmailForValidity("abc@abc.com")

        // ...then the result should be the expected one.
        assertThat(result, `is`(true))
    }
    @Test
    fun invalidEmail() {
//        val myObjectUnderTest = MainActivity(context)
        var utils = Utils()
        // ...when the string is returned from the object under test...
        val result: Boolean? = utils.checkEmailForValidity("abc@abc")

        // ...then the result should be the expected one.
        assertThat(result, `is`(true))
    }
}