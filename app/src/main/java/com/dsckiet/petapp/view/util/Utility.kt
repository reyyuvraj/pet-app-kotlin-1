package com.dsckiet.petapp.view.util

import java.util.regex.Matcher
import java.util.regex.Pattern

class Utility {

    fun checkPassword(password: String): Boolean {
        val pattern: Pattern
        val pPattern = "^(?=.*[0-9])(?=.*[A-Z])(?=\\S+$).{4,}$"
        pattern = Pattern.compile(pPattern)
        val matcher: Matcher = pattern.matcher(password)

        return matcher.matches()
    }
}