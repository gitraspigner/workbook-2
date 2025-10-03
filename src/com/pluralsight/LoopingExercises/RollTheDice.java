package com.pluralsight.LoopingExercises;

/**
 * *******Add program description here******
 *
 * @author Ravi Spigner
 */
public class RollTheDice {
    public static void main(String[] args) {
        Dice dice = new Dice();
        int roll1;
        int roll2;
        int roll2Count = 0;
        int roll4Count = 0;
        int roll6Count = 0;
        int roll7Count = 0;
        int sumOfDiceRolls;
        //roll 100 times
        for (int i = 0; i < 100; i++) {
            roll1 = dice.roll();
            roll2 = dice.roll();
            sumOfDiceRolls = roll1 + roll2;
            System.out.println("Roll " + i + " " + roll1 + " - " + roll2 + " Sum: " + sumOfDiceRolls);
            switch (sumOfDiceRolls) {
                case 2:
                    roll2Count++;
                    break;
                case 4:
                    roll4Count++;
                    break;
                case 6:
                    roll6Count++;
                    break;
                case 7:
                    roll7Count++;
                    break;
                //no default case needed for switch, no behavior required
            }
        }
        System.out.println("Count of 2s rolled: " + roll2Count);
        System.out.println("Count of 4s rolled: " + roll4Count);
        System.out.println("Count of 6s rolled: " + roll6Count);
        System.out.println("Count of 7s rolled: " + roll7Count);
    }
}
