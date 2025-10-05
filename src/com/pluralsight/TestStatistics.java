package com.pluralsight;

import java.util.Arrays;

/**
 * Displays the highest, lowest, and median test scores for a collection (array) of test scores.
 *
 * @author Ravi Spigner
 */
public class TestStatistics {
    public static void main(String[] args) {
        int[] testScores = {100, 100, 99, 95, 94, 93, 93, 90, 85, 80};
        int max = Arrays.stream(testScores).max().getAsInt();
        int min = Arrays.stream(testScores).min().getAsInt();
        System.out.println("Max score is: " + max);
        System.out.println("Max score is: " + min);
        int n = testScores.length;
        int median;
        //sort method call here if needed
        if (n % 2 == 0) { //even number of test scores, find average
            //if even numbered array, the median has to be the average of the 2 middle values
            median = (int) ((testScores[n/2 - 1] + testScores[n/2]) / 2.0);
        } else { //odd number of scores
            median = testScores[n/2];
        }
        System.out.println("Median score is: " + median);
    }
}
