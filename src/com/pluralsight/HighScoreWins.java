package com.pluralsight;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Displays either the winning team or if there was a tie, given the scores of a game (which
 * includes team names and scores) between 2 teams given by the user (in the format
 * Team1:Team2|XX:XX). (Points for the game score(s) can be 1 or more digits).
 *
 * @author Ravi Spigner
 */
public class HighScoreWins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a game score: ");

        String[] teamsAndScores = scanner.nextLine().split(Pattern.quote("|"));
        String[] teams = teamsAndScores[0].split(Pattern.quote(":"));
        String[] scores = teamsAndScores[1].split(Pattern.quote(":"));

        String team1 = teams[0];
        String team2 = teams[1];
        int team1Score = Integer.parseInt(scores[0]);
        int team2Score = Integer.parseInt(scores[1]);

        if (team1Score > team2Score) {
            System.out.println("Winner: " + team1);
        } else if (team2Score > team1Score) {
            System.out.println("Winner: " + team2);
        } else {
            System.out.println("It's a tie between " + team1 + " and " + team2 + "!");
        }
        scanner.close();
        //tests:
        //Slytherin:Gryffindor|23:59
        //Slytherin:Gryffindor|59:23
        //Red:Blu|47:47
    }
}