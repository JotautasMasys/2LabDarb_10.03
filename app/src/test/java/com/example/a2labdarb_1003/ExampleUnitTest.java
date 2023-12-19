package com.example.a2labdarb_1003;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void testCountSymbols() {
        String input = "Hello, World!";
        int result = TextCounter.countSymbols(input);
        assertEquals(13, result);
    }

    @Test
    public void testCountWords() {
        String input = "This is a sample sentence.";
        int result = TextCounter.countWords(input);
        assertEquals(5, result);
    }

    @Test
    public void testCountSymbolsWithEmptyString() {
        String input = "";
        int result = TextCounter.countSymbols(input);
        assertEquals(0, result);
    }

    @Test
    public void testCountWordsWithNullInput() {
        String input = null;
        int result = TextCounter.countWords(input);
        assertEquals(0, result);
    }

    @Test
    public void testCountWordsWithEmptyString() {
        String input = "";
        int result = TextCounter.countWords(input);
        assertEquals(0, result);
    }
}