package com.javatutorial.backend.beginner;

import com.google.common.collect.ImmutableMap;

import java.util.List;
import java.util.Map;

/**
 * The idea of this exercise is to get familiar with concept of tests, test driven development and practise Collections.
 * The goal is to complete the following method body to take the input, find only palindromes, calculate their length
 * and return a map (a collection of key - value pairs) sorted by size.
 * If you press ctrl + n and look for ExerciseNr1PalindromeAndMapTest you will find a test class written using JUnit5.
 * Press the green arrow on the test and try to run it. First it should fail. If the result is green you succeeded the exercise!
 * You should be able to build the project with command "mvn clean package" in the end of the exercise.
 * Google guava is being used in this exercise, which gives you the possibility to use structure ImmutableMap.of()
 * Check out file pom.xml which is the config for dependency management with Maven.
 * Tips on Maven installation: https://www.mkyong.com/maven/how-to-install-maven-in-windows/
 */
class ExerciseNr1PalindromeAndMap {

    Map<String, Integer> checkIfPalindromeAndReturnSize(final List<String> input) {
        final Map<String, Integer> result = ImmutableMap.of("ABCD", 0);
        return result;
    }

}