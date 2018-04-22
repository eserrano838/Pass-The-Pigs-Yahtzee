import java.util.Arrays;
import java.util.Random;

public class Hand {
    //array to hold the value of each pig in the hand
    protected Pig[] thePigs;
    private int numRolls;

    //constructor that initializes every index in the array to
    // a new Pig object
    public Hand() {
        this.thePigs = new Pig[4];
        thePigs[0] = new Pig();
        thePigs[1] = new Pig();
        thePigs[2] = new Pig();
        thePigs[3] = new Pig();
    }

    public void rollPigs(String keep) {
        char[] charArr = keep.toCharArray();
        for (int i = 0; i < 4; i++) {
            if (charArr[i] != 'y') {
                thePigs[i].roll();
            }
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
}