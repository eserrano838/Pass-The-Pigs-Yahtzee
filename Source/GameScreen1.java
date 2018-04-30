

import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.*;

/**
 * A frame with a button panel
 */
public class GameScreen1 extends JFrame implements ActionListener
{
    private JPanel buttonPanel;
    private static final int DEFAULT_WIDTH = 1400;
    private static final int DEFAULT_HEIGHT = 900;

    private char[] keep;
    private int turnCounter;
    private int rollCounter;
    ImageIcon titleIcon = new ImageIcon("title.png");
    JLabel titleLabel = new JLabel(new ImageIcon("src/Images/title.PNG"));
    JLabel scoreBoardLabel = new JLabel("Row: ");
    JButton sideBtn = new JButton("Side");
    JButton rzrBkBtn = new JButton("Razorback");
    JButton trotterBtn = new JButton("Trotter");
    JButton snouterBtn = new JButton("Snouter");
    JButton leaningJowlerBtn = new JButton("Leaning Jowler");
    JButton dbRzrbkBtn = new JButton("Double Razorback");
    JButton dbTrottereBtn = new JButton("Double Trouter");
    JButton dbSnouterBtn = new JButton("Double Snouter");
    JButton dblnJowlerBtn = new JButton("Double Leaning \n Jowler");
    JButton mixedComboBtn = new JButton("Mixed Combo");
    JButton piggybackBtn = new JButton("Piggyback");
    JLabel player1Label = new JLabel("Player 1: ");
    JLabel label1 = new JLabel("0");
    JLabel label2 = new JLabel("0");
    JLabel label3 = new JLabel("0");
    JLabel label4 = new JLabel("0");
    JLabel label5 = new JLabel("0");
    JLabel label6 = new JLabel("0");
    JLabel label7 = new JLabel("0");
    JLabel label8 = new JLabel("0");
    JLabel label9 = new JLabel("0");
    JLabel label10 = new JLabel("0");
    JLabel label11 = new JLabel("0");
    JLabel player2Label = new JLabel("Player 2: ");
    JLabel label12 = new JLabel("0");
    JLabel label13 = new JLabel("0");
    JLabel label14 = new JLabel("0");
    JLabel label15 = new JLabel("0");
    JLabel label16 = new JLabel("0");
    JLabel label17 = new JLabel("0");
    JLabel label18 = new JLabel("0");
    JLabel label19 = new JLabel("0");
    JLabel label20 = new JLabel("0");
    JLabel label21 = new JLabel("0");
    JLabel label22 = new JLabel("0");
    JLabel pig1 = new JLabel();
    JLabel pig2 = new JLabel();
    JLabel pig3 = new JLabel();
    JLabel pig4 = new JLabel();
    JLabel currentPlayer = new JLabel("PLAYER 1's TURN");
    JButton pigBtn1 = new JButton("HOLD");
    JButton pigBtn2 = new JButton("HOLD");
    JButton pigBtn3 = new JButton("HOLD");
    JButton pigBtn4 = new JButton("HOLD");
    JButton rollBtn = new JButton(new ImageIcon("src/Images/rollthepigs.png"));
    String sidePNG = "src/Images/side.png";
    String trotterPNG = "src/Images/trotter.png";
    String snouterPNG = "src/Images/Snouter.png";
    String razorbackPNG= "src/Images/Razorback.png";
    String leaningJowlerPNG = "src/Images/leaningJowler.png";
    private ScoreBoard player1ScoreBoard;
    private ScoreBoard player2ScoreBoard;
    private Hand player1Hand;
    private Hand player2Hand;

    public GameScreen1() {
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
        int fontSize = 24;

        player1Hand = new Hand();
        player2Hand = new Hand();
        player1ScoreBoard = new ScoreBoard(player1Hand);
        player2ScoreBoard = new ScoreBoard(player1Hand);

        turnCounter = 0;
        rollCounter = 0;
        keep = new char[4];
        keep[0] = 'n';
        keep[1] = 'n';
        keep[2] = 'n';
        keep[3] = 'n';

        buttonPanel = new JPanel();
        buttonPanel.setBackground(Color.WHITE);
        buttonPanel.setLayout(new GridBagLayout());

        buttonPanel.add(titleLabel, new GBC(3, 0, 7, 1).setFill(GBC.NORTH));
        buttonPanel.add(currentPlayer, new GBC(3, 1, 7, 1).setFill(GBC.CENTER));
        currentPlayer.setText("PLAYER 1's TURN");
        currentPlayer.setFont(new Font("Ultra", Font.PLAIN, 24));
        currentPlayer.setBackground(Color.ORANGE);
        buttonPanel.add(scoreBoardLabel, new GBC(0, 2).setFill(GBC.HORIZONTAL).setInsets(1));
        buttonPanel.add(sideBtn, new GBC(1, 2).setFill(GBC.HORIZONTAL));
        buttonPanel.add(rzrBkBtn, new GBC(2, 2).setFill(GBC.HORIZONTAL));
        buttonPanel.add(trotterBtn, new GBC(3, 2).setFill(GBC.HORIZONTAL));
        buttonPanel.add(snouterBtn, new GBC(4, 2).setFill(GBC.HORIZONTAL));
        buttonPanel.add(leaningJowlerBtn, new GBC(5, 2).setFill(GBC.HORIZONTAL));
        buttonPanel.add(dbRzrbkBtn, new GBC(6, 2).setFill(GBC.HORIZONTAL));
        buttonPanel.add(dbTrottereBtn, new GBC(7, 2).setFill(GBC.HORIZONTAL));
        buttonPanel.add(dbSnouterBtn, new GBC(8, 2).setFill(GBC.HORIZONTAL));
        buttonPanel.add(dblnJowlerBtn, new GBC(9, 2).setFill(GBC.HORIZONTAL));
        buttonPanel.add(mixedComboBtn, new GBC(10, 2).setFill(GBC.HORIZONTAL));
        buttonPanel.add(piggybackBtn, new GBC(11, 2).setFill(GBC.HORIZONTAL));

        buttonPanel.add(player1Label, new GBC(0, 3).setFill(GBC.HORIZONTAL));
        buttonPanel.add(label1, new GBC(1, 3).setFill(GBC.CENTER));
        buttonPanel.add(label2, new GBC(2, 3).setFill(GBC.CENTER));
        buttonPanel.add(label3, new GBC(3, 3).setFill(GBC.CENTER));
        buttonPanel.add(label4, new GBC(4, 3).setFill(GBC.CENTER));
        buttonPanel.add(label5, new GBC(5, 3).setFill(GBC.CENTER));
        buttonPanel.add(label6, new GBC(6, 3).setFill(GBC.CENTER));
        buttonPanel.add(label7, new GBC(7, 3).setFill(GBC.CENTER));
        buttonPanel.add(label8, new GBC(8, 3).setFill(GBC.CENTER));
        buttonPanel.add(label9, new GBC(9, 3).setFill(GBC.CENTER));
        buttonPanel.add(label10, new GBC(10, 3).setFill(GBC.CENTER));
        buttonPanel.add(label11, new GBC(11, 3).setFill(GBC.CENTER));

        buttonPanel.add(player2Label, new GBC(0, 4).setFill(GBC.HORIZONTAL).setInsets(1));
        buttonPanel.add(label12, new GBC(1, 4).setFill(GBC.CENTER));
        buttonPanel.add(label13, new GBC(2, 4).setFill(GBC.CENTER));
        buttonPanel.add(label14, new GBC(3, 4).setFill(GBC.CENTER));
        buttonPanel.add(label15, new GBC(4, 4).setFill(GBC.CENTER));
        buttonPanel.add(label16, new GBC(5, 4).setFill(GBC.CENTER));
        buttonPanel.add(label17, new GBC(6, 4).setFill(GBC.CENTER));
        buttonPanel.add(label18, new GBC(7, 4).setFill(GBC.CENTER));
        buttonPanel.add(label19, new GBC(8, 4).setFill(GBC.CENTER));
        buttonPanel.add(label20, new GBC(9, 4).setFill(GBC.CENTER));
        buttonPanel.add(label21, new GBC(10, 4).setFill(GBC.CENTER));
        buttonPanel.add(label22, new GBC(11, 4).setFill(GBC.CENTER));



        pig1.setBorder(BorderFactory.createLineBorder(Color.black));
        pig2.setBorder(BorderFactory.createLineBorder(Color.black));
        pig3.setBorder(BorderFactory.createLineBorder(Color.black));
        pig4.setBorder(BorderFactory.createLineBorder(Color.black));
        buttonPanel.add(pig1, new GBC(1, 5, 2, 3).setFill(GBC.CENTER));
        buttonPanel.add(pig2, new GBC(4, 5, 2, 3).setFill(GBC.CENTER));
        buttonPanel.add(pig3, new GBC(7, 5, 2, 3).setFill(GBC.CENTER));
        buttonPanel.add(pig4, new GBC(10, 5, 2, 3).setFill(GBC.CENTER));
        //// Hold Buttons
        pigBtn1.setFont(new Font("Ultra", Font.PLAIN, 24));
        pigBtn1.setBackground(Color.ORANGE);
        pigBtn2.setFont(new Font("Ultra", Font.PLAIN, 24));
        pigBtn2.setBackground(Color.ORANGE);
        pigBtn3.setFont(new Font("Ultra", Font.PLAIN, 24));
        pigBtn3.setBackground(Color.ORANGE);
        pigBtn4.setFont(new Font("Ultra", Font.PLAIN, 24));
        pigBtn4.setBackground(Color.ORANGE);

        buttonPanel.add(pigBtn1, new GBC(1, 8, 2, 1).setFill(GBC.CENTER));
        buttonPanel.add(pigBtn2, new GBC(4, 8, 2, 1).setFill(GBC.CENTER));
        buttonPanel.add(pigBtn3, new GBC(7, 8, 2, 1).setFill(GBC.CENTER));
        buttonPanel.add(pigBtn4, new GBC(10, 8, 2, 1).setFill(GBC.CENTER));
        rollBtn.setBackground(Color.WHITE);
        buttonPanel.add(rollBtn, new GBC(5, 9, 4, 1).setFill(GBC.CENTER));


        add(buttonPanel);

        sideBtn.addActionListener(this);
        rzrBkBtn.addActionListener(this);
        trotterBtn.addActionListener(this);
        snouterBtn.addActionListener(this);
        leaningJowlerBtn.addActionListener(this);
        dbRzrbkBtn.addActionListener(this);
        dbTrottereBtn.addActionListener(this);
        dbSnouterBtn.addActionListener(this);
        dblnJowlerBtn.addActionListener(this);
        mixedComboBtn.addActionListener(this);
        piggybackBtn.addActionListener(this);
        rollBtn.addActionListener(this);
        pigBtn4.addActionListener(this);
        pigBtn2.addActionListener(this);
        pigBtn1.addActionListener(this);
        pigBtn3.addActionListener(this);

        setHoldButtonsUnclickable();
        setRowButtonsUnclickable();

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

    public void displayCurrentScore1 (ScoreBoard score) {
        System.out.println();
        if (!score.getHasScore(0)) {
            label1.setText(player1ScoreBoard.getCurrentScore(0) + "");
        }
        if (!score.getHasScore(1)) {
            label2.setText(player1ScoreBoard.getCurrentScore(1) + "");
        }
        if (!score.getHasScore(2)) {
            label3.setText(player1ScoreBoard.getCurrentScore(2) + "");
        }
        if (!score.getHasScore(3)) {
            label4.setText(player1ScoreBoard.getCurrentScore(3) + "");
        }
        if (!score.getHasScore(4)) {
            label5.setText(player1ScoreBoard.getCurrentScore(4) + "");
        }
        if (!score.getHasScore(5)) {
            label6.setText(player1ScoreBoard.getCurrentScore(5) + "");
        }
        if (!score.getHasScore(6)) {
            label7.setText(player1ScoreBoard.getCurrentScore(6) + "");
        }
        if (!score.getHasScore(7)) {
            label8.setText(player1ScoreBoard.getCurrentScore(7) + "");
        }
        if (!score.getHasScore(8)) {
            label9.setText(player1ScoreBoard.getCurrentScore(8) + "");
        }
        if (!score.getHasScore(9)) {
            label10.setText(player1ScoreBoard.getCurrentScore(9) + "");
        }
        if (!score.getHasScore(10)) {
            label11.setText(player1ScoreBoard.getCurrentScore(10) + "");
        }
    }

    public void displayCurrentScore2 (ScoreBoard score) {
        System.out.println();
        if (!score.getHasScore(0)) {
            label12.setText(player2ScoreBoard.getCurrentScore(0) + "");
            System.out.println(player2ScoreBoard.getCurrentScore(0));
        }
        if (!score.getHasScore(1)) {
            label13.setText(player2ScoreBoard.getCurrentScore(1) + "");
            System.out.println(player2ScoreBoard.getCurrentScore(1));
        }
        if (!score.getHasScore(2)) {
            label14.setText(player2ScoreBoard.getCurrentScore(2) + "");
            System.out.println(player2ScoreBoard.getCurrentScore(2));
        }
        if (!score.getHasScore(3)) {
            label15.setText(player2ScoreBoard.getCurrentScore(3) + "");
            System.out.println(player2ScoreBoard.getCurrentScore(3));
        }
        if (!score.getHasScore(4)) {
            label16.setText(player2ScoreBoard.getCurrentScore(4) + "");
            System.out.println(player2ScoreBoard.getCurrentScore(4));
        }
        if (!score.getHasScore(5)) {
            label17.setText(player2ScoreBoard.getCurrentScore(5) + "");
            System.out.println(player2ScoreBoard.getCurrentScore(5));
        }
        if (!score.getHasScore(6)) {
            label18.setText(player2ScoreBoard.getCurrentScore(6) + "");
            System.out.println(player2ScoreBoard.getCurrentScore(6));
        }
        if (!score.getHasScore(7)) {
            label19.setText(player2ScoreBoard.getCurrentScore(7) + "");
            System.out.println(player2ScoreBoard.getCurrentScore(7));
        }
        if (!score.getHasScore(8)) {
            label20.setText(player2ScoreBoard.getCurrentScore(8) + "");
            System.out.println(player2ScoreBoard.getCurrentScore(8));
        }
        if (!score.getHasScore(9)) {
            label21.setText(player2ScoreBoard.getCurrentScore(9) + "");
            System.out.println(player2ScoreBoard.getCurrentScore(9));
        }
        if (!score.getHasScore(10)) {
            label22.setText(player2ScoreBoard.getCurrentScore(10) + "");
            System.out.println(player2ScoreBoard.getCurrentScore(10));
        }
    }

    public void displayFinalScore2 (ScoreBoard score) {
        System.out.println();
        label12.setText(player2ScoreBoard.getFinalScore(0) + "");
        label13.setText(player2ScoreBoard.getFinalScore(1) + "");
        label14.setText(player2ScoreBoard.getFinalScore(2) + "");
        label15.setText(player2ScoreBoard.getFinalScore(3) + "");
        label16.setText(player2ScoreBoard.getFinalScore(4) + "");
        label17.setText(player2ScoreBoard.getFinalScore(5) + "");
        label18.setText(player2ScoreBoard.getFinalScore(6) + "");
        label19.setText(player2ScoreBoard.getFinalScore(7) + "");
        label20.setText(player2ScoreBoard.getFinalScore(8) + "");
        label21.setText(player2ScoreBoard.getFinalScore(9) + "");
        label22.setText(player2ScoreBoard.getFinalScore(10) + "");
    }

    public void displayFinalScore1 (ScoreBoard score) {
        System.out.println();
            label1.setText(player1ScoreBoard.getFinalScore(0) + "");
            label2.setText(player1ScoreBoard.getFinalScore(1) + "");
            label3.setText(player1ScoreBoard.getFinalScore(2) + "");
            label4.setText(player1ScoreBoard.getFinalScore(3) + "");
            label5.setText(player1ScoreBoard.getFinalScore(4) + "");
            label6.setText(player1ScoreBoard.getFinalScore(5) + "");
            label7.setText(player1ScoreBoard.getFinalScore(6) + "");
            label8.setText(player1ScoreBoard.getFinalScore(7) + "");
            label9.setText(player1ScoreBoard.getFinalScore(8) + "");
            label10.setText(player1ScoreBoard.getFinalScore(9) + "");
            label11.setText(player1ScoreBoard.getFinalScore(10) + "");
    }

    public void actionPerformed(ActionEvent e) {
        System.out.println("Player 1 hand: " + Arrays.toString(player1Hand.getHandArray()));
        System.out.println("Player 2 hand: " + Arrays.toString(player2Hand.getHandArray()));
        System.out.println("Player 1 scores " + Arrays.toString(player1ScoreBoard.currentHandScore));
        System.out.println("Player 2 scores " + Arrays.toString(player2ScoreBoard.currentHandScore));
        System.out.println("Player 1 final scores " + Arrays.toString(player1ScoreBoard.finalScore));
        System.out.println("Player 2 final scores " + Arrays.toString(player2ScoreBoard.finalScore));
        if (e.getSource() == sideBtn) {
            rollCounter = 0;
            if (turnCounter % 2 == 0) {
                player1ScoreBoard.setFinalScore(0);
                displayFinalScore1(player1ScoreBoard);
                label1.setForeground(Color.red);
            } else {
                player2ScoreBoard.setFinalScore(0);
                displayFinalScore2(player2ScoreBoard);
                label12.setForeground(Color.red);
            }
            setRowButtonsUnclickable();
            turnCounter++;
            resetHands();
            resetKeeping();
            togglePlayerLabel();
        } else if (e.getSource() == rzrBkBtn) {
            System.out.println("Player 1 hand: " + Arrays.toString(player1Hand.getHandArray()));
            System.out.println("Player 2 hand: " + Arrays.toString(player2Hand.getHandArray()));
            rollCounter = 0;
            if (turnCounter % 2 == 0) {
                player1ScoreBoard.setFinalScore(1);
                displayFinalScore1(player1ScoreBoard);
                label2.setForeground(Color.red);
            } else {
                player2ScoreBoard.setFinalScore(1);
                displayFinalScore2(player2ScoreBoard);
                label13.setForeground(Color.red);
            }
            System.out.println("Player 1 scores " + Arrays.toString(player1ScoreBoard.currentHandScore));
            System.out.println("Player 2 scores " + Arrays.toString(player2ScoreBoard.currentHandScore));
            System.out.println("Player 1 final scores " + Arrays.toString(player1ScoreBoard.finalScore));
            System.out.println("Player 2 final scores " + Arrays.toString(player2ScoreBoard.finalScore));
            setRowButtonsUnclickable();
            turnCounter++;
            resetHands();
            resetKeeping();
            togglePlayerLabel();
        } else if (e.getSource() == trotterBtn) {
            System.out.println("Player 1 hand: " + Arrays.toString(player1Hand.getHandArray()));
            System.out.println("Player 2 hand: " + Arrays.toString(player2Hand.getHandArray()));
            rollCounter = 0;
            if (turnCounter % 2 == 0) {
                player1ScoreBoard.setFinalScore(2);
                displayFinalScore1(player1ScoreBoard);
                label3.setForeground(Color.red);
            } else {
                player2ScoreBoard.setFinalScore(2);
                displayFinalScore2(player2ScoreBoard);
                label14.setForeground(Color.red);
            }
            System.out.println("Player 1 scores " + Arrays.toString(player1ScoreBoard.currentHandScore));
            System.out.println("Player 2 scores " + Arrays.toString(player2ScoreBoard.currentHandScore));
            System.out.println("Player 1 final scores " + Arrays.toString(player1ScoreBoard.finalScore));
            System.out.println("Player 2 final scores " + Arrays.toString(player2ScoreBoard.finalScore));
            setRowButtonsUnclickable();
            resetHands();
            resetKeeping();
            turnCounter++;
            togglePlayerLabel();
        } else if (e.getSource() == snouterBtn) {
            System.out.println("Player 1 hand: " + Arrays.toString(player1Hand.getHandArray()));
            System.out.println("Player 2 hand: " + Arrays.toString(player2Hand.getHandArray()));
            rollCounter = 0;
            if (turnCounter % 2 == 0) {
                player1ScoreBoard.setFinalScore(3);
                displayFinalScore1(player1ScoreBoard);
                label4.setForeground(Color.red);
            } else {
                player2ScoreBoard.setFinalScore(3);
                displayFinalScore2(player2ScoreBoard);
                label15.setForeground(Color.red);
            }
            setRowButtonsUnclickable();
            turnCounter++;
            resetHands();
            resetKeeping();
            togglePlayerLabel();
        } else if (e.getSource() == leaningJowlerBtn) {
            rollCounter = 0;
            if (turnCounter % 2 == 0) {
                player1ScoreBoard.setFinalScore(4);
                displayFinalScore1(player1ScoreBoard);
                label5.setForeground(Color.red);
            } else {
                player2ScoreBoard.setFinalScore(4);
                displayFinalScore2(player2ScoreBoard);
                label16.setForeground(Color.red);
            }
            setRowButtonsUnclickable();
            turnCounter++;
            resetHands();
            resetKeeping();
            togglePlayerLabel();
        } else if (e.getSource() == dbRzrbkBtn) {
            rollCounter = 0;
            if (turnCounter % 2 == 0) {
                player1ScoreBoard.setFinalScore(5);
                displayFinalScore1(player1ScoreBoard);
                label6.setForeground(Color.red);
            } else {
                player2ScoreBoard.setFinalScore(5);
                displayFinalScore2(player2ScoreBoard);
                label17.setForeground(Color.red);
            }
            setRowButtonsUnclickable();
            turnCounter++;
            resetHands();
            resetKeeping();
            togglePlayerLabel();
        } else if (e.getSource() == dbTrottereBtn) {
            rollCounter = 0;
            if (turnCounter % 2 == 0) {
                player1ScoreBoard.setFinalScore(6);
                displayFinalScore1(player1ScoreBoard);
                label7.setForeground(Color.red);
            } else {
                player2ScoreBoard.setFinalScore(6);
                displayFinalScore2(player2ScoreBoard);
                label18.setForeground(Color.red);
            }
            setRowButtonsUnclickable();
            turnCounter++;
            resetHands();
            resetKeeping();
            togglePlayerLabel();
        } else if (e.getSource() == dbSnouterBtn) {
            rollCounter = 0;
            if (turnCounter % 2 == 0) {
                player1ScoreBoard.setFinalScore(7);
                displayFinalScore1(player1ScoreBoard);
                label8.setForeground(Color.red);
            } else {
                player2ScoreBoard.setFinalScore(7);
                displayFinalScore2(player2ScoreBoard);
                label19.setForeground(Color.red);
            }
            setRowButtonsUnclickable();
            turnCounter++;
            resetHands();
            resetKeeping();
            togglePlayerLabel();
        } else if (e.getSource() == dblnJowlerBtn) {
            rollCounter = 0;
            if (turnCounter % 2 == 0) {
                player1ScoreBoard.setFinalScore(8);
                displayFinalScore1(player1ScoreBoard);
                label9.setForeground(Color.red);
            } else {
                player2ScoreBoard.setFinalScore(8);
                displayFinalScore2(player2ScoreBoard);
                label20.setForeground(Color.red);
            }
            setRowButtonsUnclickable();
            turnCounter++;
            togglePlayerLabel();
        } else if (e.getSource() == mixedComboBtn) {
            rollCounter = 0;
            if (turnCounter % 2 == 0) {
                player1ScoreBoard.setFinalScore(9);
                displayFinalScore1(player1ScoreBoard);
                label10.setForeground(Color.red);
            } else {
                player2ScoreBoard.setFinalScore(9);
                displayFinalScore2(player2ScoreBoard);
                label21.setForeground(Color.red);
            }
            setRowButtonsUnclickable();
            turnCounter++;
            resetHands();
            resetKeeping();
            togglePlayerLabel();
        }else if(e.getSource() == piggybackBtn){
            rollCounter = 0;
            if (turnCounter % 2 == 0) {
                player1ScoreBoard.setFinalScore(10);
                displayFinalScore1(player1ScoreBoard);
                label11.setForeground(Color.red);
            } else {
                player2ScoreBoard.setFinalScore(10);
                displayFinalScore2(player2ScoreBoard);
                label12.setForeground(Color.red);
            }
            setRowButtonsUnclickable();
            turnCounter++;
            resetHands();
            resetKeeping();
            togglePlayerLabel();
        }else if(e.getSource() == pigBtn1) {
            if(keep[0] == 'n'){
                keep[0] = 'y';
                pigBtn1.setText("HOLDING");
            }else{
                keep[0] = 'n';
                pigBtn1.setText("HOLD");
            }
        }else if(e.getSource() == pigBtn2) {
            if(keep[1] == 'n'){
                keep[1] = 'y';
                pigBtn2.setText("HOLDING");

            }else{
                keep[1] = 'n';
                pigBtn2.setText("HOLD");
            }
        }else if(e.getSource() == pigBtn3) {
            if(keep[2] == 'n'){
                keep[2] = 'y';
                pigBtn3.setText("HOLDING");
            }else{
                keep[2] = 'n';
                pigBtn3.setText("HOLD");
            }
        }else if(e.getSource() == pigBtn4) {
            if(keep[3] == 'n'){
                keep[3] = 'y';
                pigBtn4.setText("HOLDING");
            }else{
                keep[3] = 'n';
                pigBtn4.setText("HOLD");
            }
        }else if(e.getSource() == rollBtn) {
            player1ScoreBoard.setCurrentHand(player1Hand);
            player2ScoreBoard.setCurrentHand(player2Hand);
            if(turnCounter % 2 == 0 && rollCounter == 0){
                System.out.println("Player 1's turn");
                player1Hand.rollPigs("nnnn".toCharArray());
                System.out.println(Arrays.toString(player1Hand.getHandArray()));
                updateDiceImages();
                player1ScoreBoard.setCurrentScore();
                displayCurrentScore1(player1ScoreBoard);
                System.out.println("Choose dice to keep and roll again, or select row to apply score to");
            }else if(turnCounter % 2 != 0 && rollCounter == 0){
                System.out.println("Player 2's turn");
                player2Hand.rollPigs("nnnn".toCharArray());
                System.out.println(Arrays.toString(player2Hand.getHandArray()));
                updateDiceImages();
                player2ScoreBoard.setCurrentScore();
                displayCurrentScore2(player2ScoreBoard);
                System.out.println("Choose dice to keep and roll again, or select row to apply score to");
            }else if(rollCounter < 3){
                if(turnCounter % 2 == 0){
                    System.out.println("Player 1's turn");
                    player1Hand.rollPigs(keep);
                    updateDiceImages();
                    player1ScoreBoard.setCurrentScore();
                    displayCurrentScore1(player1ScoreBoard);
                }else {
                    System.out.println("Player 2's turn");
                    player2Hand.rollPigs(keep);
                    updateDiceImages();
                    player2ScoreBoard.setCurrentScore();
                    displayCurrentScore2(player2ScoreBoard);
                }
            }else{
                System.out.println("INVALID CHOICE");
            }
            setHoldButtonsClickable();
            setRowButtonsClickable();
            rollCounter++;
        }else {

        }
    }

    public void togglePlayerLabel(){
        if(currentPlayer.getText() == "PLAYER 1's TURN"){
            currentPlayer.setText("PLAYER 2's TURN");
        }else{
            currentPlayer.setText("PLAYER 1's TURN");
        }
    }

    public void setHoldButtonsUnclickable(){
        pigBtn2.setEnabled(false);
        pigBtn1.setEnabled(false);
        pigBtn3.setEnabled(false);
        pigBtn4.setEnabled(false);
    }

    public void setHoldButtonsClickable(){
        pigBtn2.setEnabled(true);
        pigBtn1.setEnabled(true);
        pigBtn3.setEnabled(true);
        pigBtn4.setEnabled(true);
    }

    public void setRowButtonsUnclickable(){
        sideBtn.setEnabled(false);
        trotterBtn.setEnabled(false);
        dblnJowlerBtn.setEnabled(false);
        snouterBtn.setEnabled(false);
        leaningJowlerBtn.setEnabled(false);
        rzrBkBtn.setEnabled(false);
        dbRzrbkBtn.setEnabled(false);
        piggybackBtn.setEnabled(false);
        mixedComboBtn.setEnabled(false);
        dbSnouterBtn.setEnabled(false);
        dbTrottereBtn.setEnabled(false);
    }

    public void setRowButtonsClickable(){
        sideBtn.setEnabled(true);
        trotterBtn.setEnabled(true);
        dblnJowlerBtn.setEnabled(true);
        snouterBtn.setEnabled(true);
        leaningJowlerBtn.setEnabled(true);
        rzrBkBtn.setEnabled(true);
        dbRzrbkBtn.setEnabled(true);
        piggybackBtn.setEnabled(true);
        mixedComboBtn.setEnabled(true);
        dbSnouterBtn.setEnabled(true);
        dbTrottereBtn.setEnabled(true);
    }

    public void doRollZero1(){

    }

    public void setRollBtnClickable(){
        rollBtn.setEnabled(true);
    }

    public void setRollBtnUnclickable() {
        rollBtn.setEnabled(false);
    }

    public void updateDiceImages(){
        if(turnCounter % 2 == 0){
            Pig[] pigs = player1Hand.thePigs;
            System.out.println(pigs[0]);
            System.out.println(pigs[1]);
            System.out.println(pigs[2]);
            System.out.println(pigs[3]);
            pig1.setText(pigs[0].toString());
            pig2.setText(pigs[1].toString());
            pig3.setText(pigs[2].toString());
            pig4.setText(pigs[3].toString());
        }else{
            Pig[] pigs = player2Hand.thePigs;
            System.out.println(pigs[0]);
            System.out.println(pigs[1]);
            System.out.println(pigs[2]);
            System.out.println(pigs[3]);
            pig1.setText(pigs[0].toString());
            pig2.setText(pigs[1].toString());
            pig3.setText(pigs[2].toString());
            pig4.setText(pigs[3].toString());
        }
    }

    public static void main(String[] args) {
        JFrame frame = new GameScreen1();
        frame.setTitle("Button Test");
        frame.setLocationByPlatform(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public void resetKeeping(){
        pigBtn1.setText("HOLD");
        pigBtn2.setText("HOLD");
        pigBtn3.setText("HOLD");
        pigBtn4.setText("HOLD");
        keep[0] = 'n';
        keep[1] = 'n';
        keep[2] = 'n';
        keep[3] = 'n';
    }

    public void resetHands(){
        player2Hand = new Hand();
        player1Hand = new Hand();
    }


}