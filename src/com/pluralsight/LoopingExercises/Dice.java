package com.pluralsight.LoopingExercises;

/**
 * *******Add program description here******
 *
 * @author Ravi Spigner
 */
public class Dice {
    public int roll(){
        //int randomNumber = (int)(Math.random() * maxValue) + minValue;
        return (int) (Math.random()*6) + 1;
    }
}
