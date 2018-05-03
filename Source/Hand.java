/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package passthepigs;

import java.util.Arrays;
import java.util.Random;

public class Hand {
    //array to hold the value of each pig in the hand
    protected Pig[] thePigs;

    //constructor that initializes every index in the array to
    // a new Pig object
    public Hand() {
        this.thePigs = new Pig[4];
        thePigs[0] = new Pig();
        thePigs[1] = new Pig();
        thePigs[2] = new Pig();
        thePigs[3] = new Pig();
    }

    public void rollPigs(char[] keep) {
        for (int i = 0; i < 4; i++) {
            if (keep[i] != 'y') {
                thePigs[i].roll();
            }
        }
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

    public void keepDice(String yesOrNo){
        char[] yesOrNoArray = yesOrNo.toCharArray();
        int counterIndex = 0;
        for (char achar:yesOrNoArray) {
            if(achar == 'y'){
                thePigs[counterIndex].roll();
            }else{
                //do nothing
            }
            counterIndex++;
        }
    }

    public void displayHand(){
        for (Pig pig:thePigs) {
            System.out.println(pig.toString());
        }
    }

    public Pig[] getHandArray() {
        return thePigs;
    }

    public void setHandArray(Pig[] myArray){
        thePigs = myArray.clone();
    }


}

