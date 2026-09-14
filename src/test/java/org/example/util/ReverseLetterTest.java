package org.example.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseLetterTest {

    @Test
    void shouldReverseLetters() {
        assertEquals("dcba", ReverseLetter.reverseLetter("abcd"));
    }

    @Test
    void shouldReturnEmptyString() {
        assertEquals("", ReverseLetter.reverseLetter(""));
    }

    @Test
    void shouldKeepSingleLetter() {
        assertEquals("a", ReverseLetter.reverseLetter("a"));
    }

    @Test
    void shouldKeepNonLetters() {
        assertEquals("123 !@#", ReverseLetter.reverseLetter("123 !@#"));
    }

    @Test
    void shouldReverseOnlyLetters() {
        assertEquals("dcba", ReverseLetter.reverseLetter("abcd"));
    }

    @Test
    void shouldKeepNonLettersInPlace() {
        assertEquals("!cba?", ReverseLetter.reverseLetter("!abc?"));
    }

    @Test
    void shouldPreserveLetterCase() {
        assertEquals("dCbA", ReverseLetter.reverseLetter("AbCd"));
    }

    @Test
    void shouldReverseLettersInMixedString() {
        assertEquals(
                "t@eb eht av$J!123",
                ReverseLetter.reverseLetter("J@va the be$t!123")
        );
    }
}