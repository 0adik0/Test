package com.test.test

import com.test.test.models.User
import org.junit.Test

import org.junit.Assert.*

class UserUnitText {
    @Test
    fun userFieldsIsCorrect() {
        val user = User("Andy", 20)
        assert(user.name == "Andy")
        assert(user.age == 20)
    }

    @Test
    fun equalUsersAreEquals() {
        val userOne = User("Andy", 27)
        val userTwo = User("Andy", 27)
        assertEquals(userOne, userTwo)
    }
}