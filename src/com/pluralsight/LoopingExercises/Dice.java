package com.pluralsight.LoopingExercises;

/**
 * Represents a six-sided die that can be rolled.
 *
 * @author Ravi Spigner
 */
public class Dice {
    public int roll(){
        //int randomNumber = (int)(Math.random() * maxValue) + minValue;
        return (int) (Math.random()*6) + 1;
    }
}
