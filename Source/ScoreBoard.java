/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package passthepigs;

public class ScoreBoard {
    public int[] currentHandScore;
    private boolean[] hasScore;
    public int[] finalScore;
    private Hand hand;

    public ScoreBoard(Hand h) {
        setCurrentHand(h);
        currentHandScore = new int[11];
        finalScore = new int[13];
        hasScore = new boolean[11];
    }

    public void setCurrentHand(Hand h) {
        currentHandScore = new int[11];
        hand = h;
    }

    public void setTheScores(){
        for (int score:finalScore) {

        }
    }


    public int[] setCurrentScore() {
        if (!hasScore[0]){
            currentHandScore[0] = calculateSide();
        }
        if (!hasScore[1]) {
            currentHandScore[1] = calculateRazorback();
        }
        if (!hasScore[2]){
            currentHandScore[2] = calculateTrotter();
        }
        if (!hasScore[3]){
            currentHandScore[3] = calculateSnouter();
        }
        if (!hasScore[4]) {
            currentHandScore[4] = calculateLeaningJowler();
        }
        if (!hasScore[5]) {
            currentHandScore[5] = calculateDoubleRazorback();
        }
        if (!hasScore[6]) {
            currentHandScore[6] = calculateDoubleTrotter();
        }
        if (!hasScore[7]) {
            currentHandScore[7] = calculateDoubleSnouter();
        }
        if (!hasScore[8]) {
            currentHandScore[8] = calculateDoubleLeaningJowler();
        }
        if (!hasScore[9]) {
            currentHandScore[9] = calculateMixedCombo();
        }
        if (!hasScore[10]) {
            currentHandScore[10] = calculateYahtzee();
        }
        return currentHandScore;
    }

    public int calculateSide() {
        int currentCount = 0;
        for (int i = 0; i < 4; i++) {
            if (hand.thePigs[i].getPigVal() == Pig.CurPig.SIDE) {
                currentCount++;
            }
        }
        return 1 * currentCount;
    }

    public int calculateRazorback() {
        int currentCount = 0;
        for (int i = 0; i < 4; i++) {
            if (hand.thePigs[i].getPigVal() == Pig.CurPig.RAZORBACK) {
                currentCount++;
            }
        }
        return 3 * currentCount;
    }

    public int calculateTrotter() {
        int currentCount = 0;
        for (int i = 0; i < 4; i++) {
            if (hand.thePigs[i].getPigVal() == Pig.CurPig.TROTTER) {
                currentCount++;
            }
        }
        return 5 * currentCount;
    }

    public int calculateSnouter() {
        int currentCount = 0;
        for (int i = 0; i < 4; i++) {
            if (hand.thePigs[i].getPigVal() == Pig.CurPig.SNOUTER) {
                currentCount++;
            }
        }
        return 7 * currentCount;
    }

    public int calculateLeaningJowler() {
        int currentCount = 0;
        for (int i = 0; i < 4; i++) {
            if (hand.thePigs[i].getPigVal() == Pig.CurPig.LEANING_JOWLER) {
                currentCount++;
            }
        }
        return 10 * currentCount;
    }

    public int calculateDoubleRazorback() {
        int razorback = calculateRazorback();
        // at least two pig razorback
        if (razorback >= 6) {
            return 25;
        } else {
            return 0;
        }
    }

    public int calculateDoubleTrotter() {
        int trotter = calculateTrotter();
        // at least two pig trotter
        if (trotter >= 10) {
            return 30;
        } else {
            return 0;
        }
    }

    public int calculateDoubleSnouter() {
        int snouter = calculateSnouter();
        // at least two pig snouter
        if (snouter >= 14) {
            return 35;
        } else {
            return 0;
        }
    }

    public int calculateDoubleLeaningJowler() {
        int leaningJowler = calculateLeaningJowler();
        // at least two pig leaning jowler
        if (leaningJowler >= 20) {
            return 40;
        } else {
            return 0;
        }
    }

    public int calculateMixedCombo() {
        int total = 0;
        for (int i = 0; i < 4; i++) {
            if (hand.thePigs[i].getPigVal() == Pig.CurPig.SIDE) {
                total += 1;
            } else if (hand.thePigs[i].getPigVal() == Pig.CurPig.RAZORBACK) {
                total += 3;
            } else if (hand.thePigs[i].getPigVal() == Pig.CurPig.TROTTER) {
                total += 5;
            } else if (hand.thePigs[i].getPigVal() == Pig.CurPig.SNOUTER) {
                total += 7;
            } else {
                total += 10;
            }
        }
        return total;
    }

    public int calculateYahtzee() {
        // all four leaning jowlers
        int leaningJowler = calculateLeaningJowler();
        if (leaningJowler >= 40) {
            return 500;
        } else {
            return 0;
        }
    }

    // when button row is pressed, this function will be called
    public void setFinalScore(int rowNum) {
        finalScore[rowNum] = currentHandScore[rowNum];
        System.out.println(finalScore[rowNum]);
        System.out.println(currentHandScore[rowNum]);
        hasScore[rowNum] = true;
        for (int score:currentHandScore) {
            System.out.print(score + " " );
        }
        System.out.println();
        for (int score:finalScore) {
            System.out.print(score + " ");
        }
    }

    public int calculateBonus() {
        int upperTotal = 0;
        for (int i = 0; i < 5; i++) {
            upperTotal += finalScore[i];
        }
        if (upperTotal >= 30) {
            return 35;
        } else {
            return 0;
        }
    }

    public int calculateFinalScore() {
        int total = 0;
        for (int i = 0; i < 12; i++) {
            total += finalScore[i];
        }
        total += calculateBonus();
        return total;
    }

    public void setBonus() {
        finalScore[12] = calculateBonus();
    }

    public void setTotal() {
        finalScore[13] = calculateFinalScore();
    }

    public boolean getHasScore(int rowNum) {
        return hasScore[rowNum];
    }

    public int getCurrentScore(int rowNum) {
        return currentHandScore[rowNum];
    }

    public int getFinalScore(int rowNum) {
        return finalScore[rowNum];
    }


}