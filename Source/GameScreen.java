/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package passthepigs;

import java.util.*;

public class GameScreen {
    private ScoreBoard player1ScoreBoard;
    private ScoreBoard player2ScoreBoard;
    private Hand player1Hand;
    private Hand player2Hand;

    public GameScreen() {
        player1ScoreBoard = new ScoreBoard(player1Hand);
        player2ScoreBoard = new ScoreBoard(player1Hand);
    }

    public void playGame() {
        Scanner in = new Scanner(System.in);
        char playAgain = 'y';

        while (playAgain == 'y') {
            for (int turnCount = 0; turnCount < 24; turnCount++) {
                if (turnCount % 2 == 0) { //player 1 turn
                    System.out.println("Player 1's turn to roll");
                    player1Hand = new Hand();
                    playHand(1);
                } else { // player 2 turn
                    System.out.println("Player 2's turn to roll");
                    player2Hand = new Hand();
                    playHand(2);
                }
            }

            System.out.println("-------PLAYER 1 FINAL SCOREBOARD-------");
            displayFinalScore(player1ScoreBoard);
            System.out.println();
            System.out.println("-------PLAYER 2 FINAL SCOREBOARD-------");
            displayFinalScore(player2ScoreBoard);

            int player1Score = player1ScoreBoard.calculateFinalScore();
            int player2Score = player2ScoreBoard.calculateFinalScore();

            if (player1Score > player2Score) {
                System.out.println("Player 1 won!");
            } else if (player2Score > player1Score) {
                System.out.println("Player 2 won!");
            } else {
                System.out.println("Player 1 and Player 2 tied!");
            }

            System.out.print("\nEnter 'y' to play again ");
            playAgain = in.next().charAt(0);
        }
    }

    public void playHand(int player) {
        Scanner in = new Scanner(System.in);
        String keep = "nnnn";

        int turn = 1;

        while (turn <= 3 && !keepingAllDice(keep)) {
            // if player 1 presses roll button
            if (player == 1) {
                player1Hand.rollPigs(keep.toCharArray());
            } else { // if player 2 presses roll button
                player2Hand.rollPigs(keep.toCharArray());
            }

            // output roll
            System.out.print("Your roll was: ");
            if (player == 1) {
                displayRoll(player1Hand);
            } else {
                displayRoll(player2Hand);
            }


            //if not the last roll of the hand prompt the user for dice to keep
            if (turn < 3) {
                System.out.println();
                System.out.print("enter dice to keep (y or n): ");
                keep = in.nextLine();
            }
            turn++;
        }

        //display the final dice of the hand
        System.out.println();
        System.out.println();
        System.out.print("Possible Scores : ");

        if (player == 1) {
            player1ScoreBoard.setCurrentHand(player1Hand);
            player1ScoreBoard.setCurrentScore();
            displayCurrentScore(player1ScoreBoard);
        } else {
            player2ScoreBoard.setCurrentHand(player2Hand);
            player2ScoreBoard.setCurrentScore();
            displayCurrentScore(player2ScoreBoard);
        }

        System.out.println();
        System.out.print("enter number of line you wish to score: ");
        int keptScore = in.nextInt();
        if (player == 1) {
            player1ScoreBoard.setFinalScore(keptScore);
        } else {
            player2ScoreBoard.setFinalScore(keptScore);
        }
        in.nextLine();
        System.out.println();
    }

    public void displayRoll(Hand hand) {
        System.out.print(Arrays.toString(hand.getHandArray()));
    }

    public boolean keepingAllDice(String keep) {
        int count = 0;
        char[] charArr = keep.toCharArray();
        for (int i = 0; i < 4; i++) {
            if (charArr[i] == 'y') {
                count++;
            }
        }
        return count == 4;
    }

    public void displayCurrentScore (ScoreBoard score) {
        System.out.println();
        if (!score.getHasScore(0)) {
            System.out.println("1. Score " + score.getCurrentScore(0) + " on the Side line");
        }
        if (!score.getHasScore(1)) {
            System.out.println("2. Score " + score.getCurrentScore(1) + " on the Razorback line");
        }
        if (!score.getHasScore(2)) {
            System.out.println("3. Score " + score.getCurrentScore(2) + " on the Trotter line");
        }
        if (!score.getHasScore(3)) {
            System.out.println("4. Score " + score.getCurrentScore(3) + " on the Snouter line");
        }
        if (!score.getHasScore(4)) {
            System.out.println("5. Score " + score.getCurrentScore(4) + " on the Leaning Jowler line");
        }
        if (!score.getHasScore(5)) {
            System.out.println("6. Score " + score.getCurrentScore(5) + " on the Sider line");
        }
        if (!score.getHasScore(6)) {
            System.out.println("7. Score " + score.getCurrentScore(6) + " on the Double Razoreback line");
        }
        if (!score.getHasScore(7)) {
            System.out.println("8. Score " + score.getCurrentScore(7) + " on the Double Trotter line");
        }
        if (!score.getHasScore(8)) {
            System.out.println("9. Score " + score.getCurrentScore(8) + " on the Double Snouter line");
        }
        if (!score.getHasScore(9)) {
            System.out.println("10. Score " + score.getCurrentScore(9) + " on the Double Leaning Jowler line");
        }
        if (!score.getHasScore(10)) {
            System.out.println("11. Score " + score.getCurrentScore(10) + " on the Mixed Combo line");
        }
        if (!score.getHasScore(11)) {
            System.out.println("12. Score " + score.getCurrentScore(11) + " on the Yahtzee line");
        }
    }

    public void displayFinalScore(ScoreBoard score) {
        System.out.println("1. Score " + score.getFinalScore(0) + " on the Side line");
        System.out.println("2. Score " + score.getFinalScore(1) + " on the Razorback line");
        System.out.println("3. Score " + score.getFinalScore(2) + " on the Trotter line");
        System.out.println("4. Score " + score.getFinalScore(3) + " on the Snouter line");
        System.out.println("5. Score " + score.getFinalScore(4) + " on the Leaning Jowler line");
        System.out.println("6. Score " + score.getFinalScore(5) + " on the Sider line");
        System.out.println("7. Score " + score.getFinalScore(6) + " on the Double Razorback line");
        System.out.println("8. Score " + score.getFinalScore(7) + " on the Double Trotter line");
        System.out.println("9. Score " + score.getFinalScore(8) + " on the Double Snouter line");
        System.out.println("10. Score " + score.getFinalScore(9) + " on the Double Leaning Jowler line");
        System.out.println("11. Score " + score.getFinalScore(10) + " on the Mixed Combo line");
        System.out.println("12. Score " + score.getFinalScore(11) + " on the Yahtzee line");
        score.setBonus();
        score.setTotal();
        System.out.println("    Bonus: " + score.getFinalScore(12));
        System.out.println("    Total: " + score.getFinalScore(13));
    }
}