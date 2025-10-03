package com.pluralsight.LoopingExercises;

/**
 * Displays the text "I love Java" 5 times to the user, using a do-while loop.
 *
 * @author Ravi Spigner
 */
public class DoWhileLoop {
    public static void main(String[] args) {
        int i = 0;
        do {
            System.out.println("I love Java");
            i++;
        } while (i < 5);
    }
}
