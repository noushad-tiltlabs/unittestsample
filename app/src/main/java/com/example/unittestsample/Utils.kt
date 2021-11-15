package com.example.unittestsample

import java.util.*
import java.util.regex.Matcher
import java.util.regex.Pattern

class Utils{
    fun validate(userName: String, password: String): String? {
        return if (userName == "abc@abc.com" && password == "password") "Login is successful" else "Invalid login!"
    }

    fun checkEmailForValidity(email: String?): Boolean {
        val matcher: Matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(email)
        return matcher.find()
    }

    private val VALID_EMAIL_ADDRESS_REGEX: Pattern =
        Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE)

}