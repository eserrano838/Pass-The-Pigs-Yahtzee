import java.util.Random;

public class Pig {
    CurPig pigVal;

    public enum CurPig {
        SIDE, RAZORBACK, TROTTER, SNOUTER, LEANING_JOWLER
    }

    public Pig(CurPig pigVal) {
        this.pigVal = pigVal;
    }

    public Pig() {
        pigVal = null;
    }

    public CurPig getPigVal() {
        return pigVal;
    }

    public void setPigVal(CurPig pigVal) {
        this.pigVal = pigVal;
    }

    @Override
    public String toString() {
        return " " + pigVal + " ";
    }

    public void rollDie(){
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        if(randomNumber >= 0 && randomNumber < 65){
             pigVal = CurPig.SIDE;
        }else if(randomNumber >= 65 && randomNumber < 85){
            pigVal = CurPig.RAZORBACK;
        }else if(randomNumber >= 85 && randomNumber < 95){
            pigVal = CurPig.TROTTER;
        }else if(randomNumber >= 95 && randomNumber < 99){
            pigVal =  CurPig.SNOUTER;
        }else if(randomNumber == 99){
            pigVal = CurPig.LEANING_JOWLER;
        }else{
            pigVal = null;
        }
    }

}
