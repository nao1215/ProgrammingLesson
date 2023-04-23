package chapter01

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FizzBuzzTest {
    @Test
    fun testFizzBuzz() {
        assertEquals("1", FizzBuzz.fizzBuzz(1))
        assertEquals("2", FizzBuzz.fizzBuzz(2))
        assertEquals("Fizz", FizzBuzz.fizzBuzz(3))
        assertEquals("4", FizzBuzz.fizzBuzz(4))
        assertEquals("Buzz", FizzBuzz.fizzBuzz(5))
        assertEquals("Fizz", FizzBuzz.fizzBuzz(6))
        assertEquals("7", FizzBuzz.fizzBuzz(7))
        assertEquals("8", FizzBuzz.fizzBuzz(8))
        assertEquals("Fizz", FizzBuzz.fizzBuzz(9))
        assertEquals("Buzz", FizzBuzz.fizzBuzz(10))
        assertEquals("11", FizzBuzz.fizzBuzz(11))
        assertEquals("Fizz", FizzBuzz.fizzBuzz(12))
        assertEquals("13", FizzBuzz.fizzBuzz(13))
        assertEquals("14", FizzBuzz.fizzBuzz(14))
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(15))
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(30))
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(45))
    }
}
