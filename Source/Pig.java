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
        pigVal = CurPig.SIDE;
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

    public void roll(){
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        if(randomNumber >= 0 && randomNumber < 65){
            this.pigVal = CurPig.SIDE;
        }else if(randomNumber >= 65 && randomNumber < 85){
            this.pigVal = CurPig.RAZORBACK;
        }else if(randomNumber >= 85 && randomNumber < 95){
            this.pigVal = CurPig.TROTTER;
        }else if(randomNumber >= 95 && randomNumber < 99){
            this.pigVal = CurPig.SNOUTER;
        }else if(randomNumber == 99){
            this.pigVal = CurPig.LEANING_JOWLER;
        }else{
            this.pigVal = null;
        }
    }
}
