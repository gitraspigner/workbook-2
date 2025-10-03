package com.pluralsight.LoopingExercises;

/**
 * Displays a 10-second countdown followed by "Launch!" to the user, using a for loop (and
 * thread.sleep()).
 *
 * @author Ravi Spigner
 */
public class ForLoop {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("Launch!");
    }
}
