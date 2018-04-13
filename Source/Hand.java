import java.util.Random;

public class Hand {
    //array to hold the value of each pig in the hand
    private Pig[] handArray = new Pig[2];
    private int numRolls;

    //constructor that initializes every index in the array to
    //a new Pig object
    public Hand(Pig[] handArray) {
        for (Pig pig: handArray) {
            pig = new Pig();
        }
    }

    public void rollPigs(){
        Random rand = new Random();
        for (Pig pig :handArray) {
            pig.rollDie();
        }
    }

    public void displayHand(){
        for (Pig pig:handArray) {
            System.out.println(pig.toString());
        }
    }

    public Pig[] getHandArray() {
        return handArray;
    }

    public void setHandArray(Pig[] myArray){
        handArray = myArray.clone();
    }

    public void keepDice(String yesOrNo){
        char[] yesOrNoArray = yesOrNo.toCharArray();
        int counterIndex = 0;
        for (char achar:yesOrNoArray) {
            if(achar == 'y'){
                handArray[counterIndex].rollDie();
            }else{
                //do nothing
            }
            counterIndex++;
        }
    }
}
