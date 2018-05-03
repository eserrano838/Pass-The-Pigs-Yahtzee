/**
 * Pass the Pigs
 * Hand class
 */

import java.util.Arrays;
import java.util.Random;

public class Hand {
    //array to hold the value of each pig in the hand
    protected Pig[] thePigs;

    /**
     * constructor that initializes every index in the array to a new Pig object
     */
    public Hand() {
        this.thePigs = new Pig[4];
        thePigs[0] = new Pig();
        thePigs[1] = new Pig();
        thePigs[2] = new Pig();
        thePigs[3] = new Pig();
    }

    /**
     * roll every pig in thePigs array
     * @param keep chars to determine the holding of pigs or not
     */
    public void rollPigs(char[] keep) {
        for (int i = 0; i < 4; i++) {
            if (keep[i] != 'y') {
                thePigs[i].roll();
            }
        }
    }

    /**
     * determines if all pigs are being held
     * @param keep
     * @return true if all held, false if not
     */
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

    /**
     * displays thePigs array pig values
     */
    public void displayHand(){
        for (Pig pig:thePigs) {
            System.out.println(pig.toString());
        }
    }

    /**
     * getter for thePigs array
     * @return thePigs
     */
    public Pig[] getHandArray() {
        return thePigs;
    }

    /**
     * setter for thePigs array
     * @param myArray
     */
    public void setHandArray(Pig[] myArray){
        thePigs = myArray.clone();
    }
}
