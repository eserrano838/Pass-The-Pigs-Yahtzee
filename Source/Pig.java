/**
 * Pass the Pigs
 * Pig class
 */

import java.util.Random;

public class Pig {
    CurPig pigVal;

    /**
     * pig value types
     */
    public enum CurPig {
        SIDE, RAZORBACK, TROTTER, SNOUTER, LEANING_JOWLER
    }

    /**
     * Pig Constructor
     * @param pigVal
     */
    public Pig(CurPig pigVal) {
        this.pigVal = pigVal;
    }

    /**
     * Pig default constructor
     */
    public Pig() {
        pigVal = CurPig.SIDE;
    }

    /**
     * getter for pigVal
     * @return pigVal
     */
    public CurPig getPigVal() {
        return pigVal;
    }

    /**
     * setter for pigVal
     * @param pigVal
     */
    public void setPigVal(CurPig pigVal) {
        this.pigVal = pigVal;
    }

    @Override

    /**
     * pigVal to string
     */
    public String toString() {
        return " " + pigVal + " ";
    }

    /**
     * roll pig
     */
    public void roll(){
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        if(randomNumber >= 0 && randomNumber < 65){
            this.pigVal = CurPig.SIDE; // 65% probability
        }else if(randomNumber >= 65 && randomNumber < 85){
            this.pigVal = CurPig.RAZORBACK; // 20% probability
        }else if(randomNumber >= 85 && randomNumber < 95){
            this.pigVal = CurPig.TROTTER; // 10% probability
        }else if(randomNumber >= 95 && randomNumber < 99){
            this.pigVal = CurPig.SNOUTER; // 4% probability
        }else if(randomNumber == 99){
            this.pigVal = CurPig.LEANING_JOWLER; // 1% probability
        }else{
            this.pigVal = null;
        }
    }
}

