package com.javatutorial.backend.beginner;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Disabled("Remove this line when you implement the exercise and run the test, currently the test is disabled to not break the build")
class ExerciseNr1PalindromeAndMapTest {

    private final ExerciseNr1PalindromeAndMap exerciseNr1PalindromeAndMap = new ExerciseNr1PalindromeAndMap();

    @Test
    void shouldReturnMapWithTwoResults() {
        //given
        final List<String> input = ImmutableList.of("NEVEN", "CUP", "TAP", "DETARTRATED", "UNITEDSTATESOFAMERICA");
        final Map<String, Integer> expectedResults = ImmutableMap.of("DETARTRATED", 11, "NEVEN", 5);

        //when
        final Map<String, Integer> results = exerciseNr1PalindromeAndMap.checkIfPalindromeAndReturnSize(input);

        //then
        assertEquals(expectedResults, results);

    }

    @Test
    void shouldReturnEmptyMap() {
        //given
        final List<String> input = ImmutableList.of("NEVER", "ABCDEF", "UNITEDSTATESOFAMERICA");
        final Map<String, Integer> expectedResults = ImmutableMap.of();

        //when
        final Map<String, Integer> results = exerciseNr1PalindromeAndMap.checkIfPalindromeAndReturnSize(input);

        //then
        assertEquals(expectedResults, results);

    }

}