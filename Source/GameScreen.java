import java.util.*;

public class GameScreen {
    private ScoreBoard player1ScoreBoard;
    private ScoreBoard player2ScoreBoard;
    private Hand player1Hand;
    private Hand player2Hand;

    public static void main (String[]args) {
        GameScreen gameScreen = new GameScreen();
        gameScreen.playGame();
    }

    public GameScreen() {
        player1ScoreBoard = new ScoreBoard();
        player2ScoreBoard = new ScoreBoard();
    }

    public void playGame() {
        for (int turnCount = 0; turnCount < 24; turnCount++) {
            if (turnCount % 2 == 0) { //player 1 turn
                player1Hand = new Hand();
                playHand(1);
            } else { // player 2 turn
                player2Hand = new Hand();
                playHand(2);
            }
        }
        player1ScoreBoard.calculateFinalScore();
        player2ScoreBoard.calculateFinalScore();
    }

    public void playHand(int player) {
        String keep = "nnnn";

        int turn = 1;

        while (turn <= 3 && !keep.equals("yyyy")) {
            Scanner in = new Scanner(System.in);
            if (player == 1) {
                player1Hand.rollPigs(keep);
            } else {
                player2Hand.rollPigs(keep);
            }

            // output roll
            System.out.print("Your roll was: ");
            System.out.print(Arrays.toString(player1Hand.getHandArray()));
            //display();
            //if not the last roll of the hand prompt the user for dice to keep
            if (turn < 3) {
                System.out.print("enter dice to keep (y or n) ");
                keep = in.nextLine();
            }
            turn++;
        }
        //display the final dice of the hand
        //displayHand();
        System.out.println();

        if (player == 1) {
            player1ScoreBoard.setCurrentHand(player1Hand);
            player1ScoreBoard.setCurrentScore();
        } else {
            player2ScoreBoard.setCurrentHand(player2Hand);
            player2ScoreBoard.setCurrentScore();
        }
    }

    public boolean keepingAllDice(int turn) {
        if(turn > 1) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Do you want to keep your dice? ");
            String input = scanner.nextLine();
            if (input == "y") {
                return true;
            } else {
                return false;
            }
        }else{
            return false;
        }
    }

}