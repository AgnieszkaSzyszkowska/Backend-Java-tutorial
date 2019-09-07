package com.javatutorial.backend.beginner;

import java.time.Duration;
import java.util.Map;

/**
 * The goal of this exercise is to practise scenario of calculating calculation duration based on data streamed from CSV file
 * In resources root you will find exercise3.csv file with data grouped into columns:
 * ID - calculation ID
 * TIMESTAMP - timestamp of the beggining or end of calculation
 * TYPE - beginning or end of the calculation
 * STATUS - SUCCESS or FAILURE
 * Read data from the file using Java 8 streans (Stream API), use any JAVA library for reading from CSV available on maven repository.
 * Calculate time passed between calculations with corresponding id and return map of ids and time passed for each calculation
 * Notice, that events can be stored in the csv file not in time order (so END before BEGIN)
 * You can assume that the amount of data will not be bigger than 1000 rows (a few)
 */
public class CsvReaderExercise3 {

    public Map<Long, Duration> countCalculationTime(){

        return null;
    }
}
