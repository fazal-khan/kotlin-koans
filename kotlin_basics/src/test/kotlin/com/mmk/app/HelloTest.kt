package com.mmk.app

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

object HelloTest {
    @Test
    fun testGreeting() {
        Assertions.assertEquals("Hello world!", App.greet("world"))
        Assertions.assertEquals("Hello", App.greet(""))
    }
}