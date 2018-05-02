import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GameScreen1 extends JFrame implements ActionListener
{
    private JPanel buttonPanel;
    private static final int DEFAULT_WIDTH = 1400;
    private static final int DEFAULT_HEIGHT = 900;

    private char[] keep;
    private int turnCounter;
    private int rollCounter;
    private JLabel titleLabel = new JLabel(new ImageIcon("src/Images/title.PNG"));
    private JLabel scoreBoardLabel = new JLabel("Row: ");
    private JButton sideBtn = new JButton("Side");
    private JButton rzrBkBtn = new JButton("Razorback");
    private JButton trotterBtn = new JButton("Trotter");
    private JButton snouterBtn = new JButton("Snouter");
    private JButton leaningJowlerBtn = new JButton("Leaning Jowler");
    private JButton dbRzrbkBtn = new JButton("Double Razorback");
    private JButton dbTrottereBtn = new JButton("Double Trouter");
    private JButton dbSnouterBtn = new JButton("Double Snouter");
    private JButton dblnJowlerBtn = new JButton("Double Leaning \n Jowler");
    private JButton mixedComboBtn = new JButton("Mixed Combo");
    private JButton piggybackBtn = new JButton("Piggyback");
    private JButton sideBtn2 = new JButton("Side");
    private JButton rzrBkBtn2 = new JButton("Razorback");
    private JButton trotterBtn2 = new JButton("Trotter");
    private JButton snouterBtn2 = new JButton("Snouter");
    private JButton leaningJowlerBtn2 = new JButton("Leaning Jowler");
    private JButton dbRzrbkBtn2 = new JButton("Double Razorback");
    private JButton dbTrottereBtn2 = new JButton("Double Trouter");
    private JButton dbSnouterBtn2 = new JButton("Double Snouter");
    private JButton dblnJowlerBtn2 = new JButton("Double Leaning \n Jowler");
    private JButton mixedComboBtn2 = new JButton("Mixed Combo");
    private JButton piggybackBtn2 = new JButton("Piggyback");
    private JButton bonusBtn2 = new JButton("Bonus");
    private JButton totalBtn2 = new JButton("Total: ");
    private JButton totalBtn = new JButton("Total: ");
    private JLabel player1Label = new JLabel("Player 1: ");
    private JButton bonusBtn = new JButton("Bonus");
    private JLabel currentPlayerLabel = new JLabel("Player 1's turn!");
    private JLabel label1 = new JLabel("0");
    private JLabel label2 = new JLabel("0");
    private JLabel label3 = new JLabel("0");
    private JLabel label4 = new JLabel("0");
    private JLabel label5 = new JLabel("0");
    private JLabel label6 = new JLabel("0");
    private JLabel label7 = new JLabel("0");
    private JLabel label8 = new JLabel("0");
    private JLabel label9 = new JLabel("0");
    private JLabel label10 = new JLabel("0");
    private JLabel label11 = new JLabel("0");
    private JLabel player2Label = new JLabel("Player 2: ");
    private JLabel label12 = new JLabel("0");
    private JLabel label13 = new JLabel("0");
    private JLabel label14 = new JLabel("0");
    private JLabel label15 = new JLabel("0");
    private JLabel label16 = new JLabel("0");
    private JLabel label17 = new JLabel("0");
    private JLabel label18 = new JLabel("0");
    private JLabel label19 = new JLabel("0");
    private JLabel label20 = new JLabel("0");
    private JLabel label21 = new JLabel("0");
    private JLabel label22 = new JLabel("0");
    private JLabel label23 = new JLabel("0");
    private JLabel label24 = new JLabel("0");
    private JLabel label25 = new JLabel("0");
    private JLabel label26 = new JLabel("0");
    private JLabel pig1 = new JLabel();
    private JLabel pig2 = new JLabel();
    private JLabel pig3 = new JLabel();
    private JLabel pig4 = new JLabel();
    private JButton pigBtn1 = new JButton("HOLD");
    private JButton pigBtn2 = new JButton("HOLD");
    private JButton pigBtn3 = new JButton("HOLD");
    private JButton pigBtn4 = new JButton("HOLD");
    private JButton rollBtn = new JButton(new ImageIcon("src/Images/rollthepigs.png"));
    private String sidePNG = "src/Images/side.png";
    private String trotterPNG = "src/Images/trotter.png";
    private String snouterPNG = "src/Images/Snouter.png";
    private String razorbackPNG= "src/Images/Razorback.png";
    private String leaningJowlerPNG = "src/Images/leaningJowler.png";
    private ScoreBoard player1ScoreBoard;
    private ScoreBoard player2ScoreBoard;
    private Hand player1Hand;
    private Hand player2Hand;

    public GameScreen1() {
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
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

        buttonPanel.add(titleLabel,  new GBC(0,0, 15,1).setFill(GBC.CENTER));

        currentPlayerLabel.setFont(new Font("Ultra", Font.BOLD, 38));
        buttonPanel.add(currentPlayerLabel,new GBC(3,1,10,1).setFill(GBC.HORIZONTAL ).setInsets(15));


        currentPlayerLabel.setFont(new Font("Ultra", Font.BOLD, 38));
        buttonPanel.add(currentPlayerLabel,new GBC(5,1,4,1).setFill(GBC.CENTER ).setInsets(15));
        buttonPanel.add(bonusBtn,new GBC(12,3).setFill(GBC.HORIZONTAL));
//buttonPanel.add(scoreBoardLabel, new GBC(0,1).setFill(GBC.HORIZONTAL).setInsets(1));
        buttonPanel.add(player1Label,new GBC(0,1).setFill(GBC.HORIZONTAL));
        buttonPanel.add(sideBtn, new GBC(0,2).setFill(GBC.HORIZONTAL));
        buttonPanel.add(rzrBkBtn, new GBC(0,3).setFill(GBC.HORIZONTAL));
        buttonPanel.add(trotterBtn, new GBC(0,4).setFill(GBC.HORIZONTAL));
        buttonPanel.add(snouterBtn, new GBC(0,5).setFill(GBC.HORIZONTAL));
        buttonPanel.add(leaningJowlerBtn, new GBC(0,6).setFill(GBC.HORIZONTAL));
        buttonPanel.add(dbRzrbkBtn, new GBC(0,7).setFill(GBC.HORIZONTAL));
        buttonPanel.add(dbTrottereBtn, new GBC(0,8).setFill(GBC.HORIZONTAL));
        buttonPanel.add(dbSnouterBtn, new GBC(0,9).setFill(GBC.HORIZONTAL));
        buttonPanel.add(dblnJowlerBtn, new GBC(0,10).setFill(GBC.HORIZONTAL));
        buttonPanel.add(mixedComboBtn, new GBC(0,11).setFill(GBC.HORIZONTAL));
        buttonPanel.add(piggybackBtn, new GBC(0,12).setFill(GBC.HORIZONTAL));
        buttonPanel.add(bonusBtn,new GBC(0,13).setFill(GBC.HORIZONTAL));
        buttonPanel.add(totalBtn,new GBC(0,14).setFill(GBC.HORIZONTAL));


        buttonPanel.add(label1, new GBC(1,2).setFill(GBC.CENTER));
        buttonPanel.add(label2, new GBC(1,3).setFill(GBC.CENTER));
        buttonPanel.add(label3, new GBC(1,4).setFill(GBC.CENTER));
        buttonPanel.add(label4, new GBC(1,5).setFill(GBC.CENTER));
        buttonPanel.add(label5, new GBC(1,6).setFill(GBC.CENTER));
        buttonPanel.add(label6, new GBC(1,7).setFill(GBC.CENTER));
        buttonPanel.add(label7, new GBC(1,8).setFill(GBC.CENTER));
        buttonPanel.add(label8, new GBC(1,9).setFill(GBC.CENTER));
        buttonPanel.add(label9, new GBC(1,10).setFill(GBC.CENTER));
        buttonPanel.add(label10, new GBC(1,11).setFill(GBC.CENTER));
        buttonPanel.add(label11, new GBC(1,12).setFill(GBC.CENTER));
        buttonPanel.add(label12, new GBC(1,13).setFill(GBC.CENTER));
        buttonPanel.add(label13, new GBC(1,14).setFill(GBC.CENTER));

        buttonPanel.add(player2Label,new GBC(17,1).setFill(GBC.HORIZONTAL).setInsets(1));
        buttonPanel.add(sideBtn2, new GBC(17,2).setFill(GBC.HORIZONTAL));
        buttonPanel.add(rzrBkBtn2, new GBC(17,3).setFill(GBC.HORIZONTAL));
        buttonPanel.add(trotterBtn2, new GBC(17,4).setFill(GBC.HORIZONTAL));
        buttonPanel.add(snouterBtn2, new GBC(17,5).setFill(GBC.HORIZONTAL));
        buttonPanel.add(leaningJowlerBtn2, new GBC(17,6).setFill(GBC.HORIZONTAL));
        buttonPanel.add(dbRzrbkBtn2, new GBC(17,7).setFill(GBC.HORIZONTAL));
        buttonPanel.add(dbTrottereBtn2, new GBC(17,8).setFill(GBC.HORIZONTAL));
        buttonPanel.add(dbSnouterBtn2, new GBC(17,9).setFill(GBC.HORIZONTAL));
        buttonPanel.add(dblnJowlerBtn2, new GBC(17,10).setFill(GBC.HORIZONTAL));
        buttonPanel.add(mixedComboBtn2, new GBC(17,11).setFill(GBC.HORIZONTAL));
        buttonPanel.add(piggybackBtn2, new GBC(17,12).setFill(GBC.HORIZONTAL));
        buttonPanel.add(bonusBtn2,new GBC(17,13).setFill(GBC.HORIZONTAL));
        buttonPanel.add(totalBtn2,new GBC(17,14).setFill(GBC.HORIZONTAL));

        buttonPanel.add(label14, new GBC(16,2).setFill(GBC.CENTER).setInsets(3));
        buttonPanel.add(label15, new GBC(16,3).setFill(GBC.CENTER));
        buttonPanel.add(label16, new GBC(16,4).setFill(GBC.CENTER));
        buttonPanel.add(label17, new GBC(16,5).setFill(GBC.CENTER));
        buttonPanel.add(label18, new GBC(16,6).setFill(GBC.CENTER));
        buttonPanel.add(label19, new GBC(16,7).setFill(GBC.CENTER));
        buttonPanel.add(label20, new GBC(16,8).setFill(GBC.CENTER));
        buttonPanel.add(label21, new GBC(16,9).setFill(GBC.CENTER));
        buttonPanel.add(label22, new GBC(16,10).setFill(GBC.CENTER));
        buttonPanel.add(label23, new GBC(16,11).setFill(GBC.CENTER));
        buttonPanel.add(label24, new GBC(16,12).setFill(GBC.CENTER));
        buttonPanel.add(label25, new GBC(16,13).setFill(GBC.CENTER));
        buttonPanel.add(label26, new GBC(16,14).setFill(GBC.CENTER));

        rollBtn.setBackground(Color.WHITE);
        rollBtn.setBorder(BorderFactory.createEmptyBorder());
        buttonPanel.add(rollBtn, new GBC(4,16,10,1).setFill(GBC.CENTER).setInsets(10));

        pig1.setBorder(BorderFactory.createLineBorder(Color.black));
        pig2.setBorder(BorderFactory.createLineBorder(Color.black));
        pig3.setBorder(BorderFactory.createLineBorder(Color.black));
        pig4.setBorder(BorderFactory.createLineBorder(Color.black));
        buttonPanel.add(pig1, new GBC(3,2, 3,5).setFill(GBC.CENTER));
        buttonPanel.add(pig2, new GBC(6,2,3,5).setFill(GBC.CENTER));
        buttonPanel.add(pig3, new GBC(9,2,3,5).setFill(GBC.CENTER));
        buttonPanel.add(pig4, new GBC(12,2,3,5).setFill(GBC.CENTER));

        buttonPanel.add(pigBtn1, new GBC(3,7, 3,7).setFill(GBC.CENTER));
        buttonPanel.add(pigBtn2, new GBC(6,7,3,7).setFill(GBC.CENTER));
        buttonPanel.add(pigBtn3, new GBC(9,7,3,7).setFill(GBC.CENTER));
        buttonPanel.add(pigBtn4, new GBC(12,7,3,7).setFill(GBC.CENTER));

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

        sideBtn2.addActionListener(this);
        rzrBkBtn2.addActionListener(this);
        trotterBtn2.addActionListener(this);
        snouterBtn2.addActionListener(this);
        leaningJowlerBtn2.addActionListener(this);
        dbRzrbkBtn2.addActionListener(this);
        dbTrottereBtn2.addActionListener(this);
        dbSnouterBtn2.addActionListener(this);
        dblnJowlerBtn2.addActionListener(this);
        mixedComboBtn2.addActionListener(this);
        piggybackBtn2.addActionListener(this);

        totalBtn2.addActionListener(this);
        totalBtn.addActionListener(this);

        bonusBtn2.addActionListener(this);
        bonusBtn.addActionListener(this);

        pigBtn4.addActionListener(this);
        pigBtn2.addActionListener(this);
        pigBtn1.addActionListener(this);
        pigBtn3.addActionListener(this);

        setHoldButtonsUnclickable();
        setRowButtonsUnclickable2();
        setRowButtonsUnclickable();
    }

    private void displayCurrentScore1 (ScoreBoard score) {
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

    private void displayCurrentScore2 (ScoreBoard score) {
        System.out.println();
        if (!score.getHasScore(0)) {
            label14.setText(player2ScoreBoard.getCurrentScore(0) + "");
        }
        if (!score.getHasScore(1)) {
            label15.setText(player2ScoreBoard.getCurrentScore(1) + "");
        }
        if (!score.getHasScore(2)) {
            label16.setText(player2ScoreBoard.getCurrentScore(2) + "");
        }
        if (!score.getHasScore(3)) {
            label17.setText(player2ScoreBoard.getCurrentScore(3) + "");
        }
        if (!score.getHasScore(4)) {
            label18.setText(player2ScoreBoard.getCurrentScore(4) + "");
        }
        if (!score.getHasScore(5)) {
            label19.setText(player2ScoreBoard.getCurrentScore(5) + "");
        }
        if (!score.getHasScore(6)) {
            label20.setText(player2ScoreBoard.getCurrentScore(6) + "");
        }
        if (!score.getHasScore(7)) {
            label21.setText(player2ScoreBoard.getCurrentScore(7) + "");
        }
        if (!score.getHasScore(8)) {
            label22.setText(player2ScoreBoard.getCurrentScore(8) + "");
        }
        if (!score.getHasScore(9)) {
            label23.setText(player2ScoreBoard.getCurrentScore(9) + "");
        }
        if (!score.getHasScore(10)) {
            label24.setText(player2ScoreBoard.getCurrentScore(10) + "");
        }
    }

    private void displayFinalScore2 () {
        System.out.println();
        label14.setText(player2ScoreBoard.getFinalScore(0) + "");
        label15.setText(player2ScoreBoard.getFinalScore(1) + "");
        label16.setText(player2ScoreBoard.getFinalScore(2) + "");
        label17.setText(player2ScoreBoard.getFinalScore(3) + "");
        label18.setText(player2ScoreBoard.getFinalScore(4) + "");
        label19.setText(player2ScoreBoard.getFinalScore(5) + "");
        label20.setText(player2ScoreBoard.getFinalScore(6) + "");
        label21.setText(player2ScoreBoard.getFinalScore(7) + "");
        label22.setText(player2ScoreBoard.getFinalScore(8) + "");
        label23.setText(player2ScoreBoard.getFinalScore(9) + "");
        label24.setText(player2ScoreBoard.getFinalScore(10) + "");
    }

    private void displayFinalScore1 () {
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

    private void resetPigs(){
        if(turnCounter % 2 == 0){
            JOptionPane.showMessageDialog(buttonPanel, "ROLL PLAYER 1");
        }else{
            JOptionPane.showMessageDialog(buttonPanel, "ROLL PLAYER 2");
        }
    }

    private void afterRowClick(){
        setRowButtonsUnclickable();
        setRowButtonsUnclickable2();
        turnCounter++;
        resetHands();
        resetKeeping();
        togglePlayerLabel();
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == sideBtn) {
            rollCounter = 0;
            player1ScoreBoard.setFinalScore(0);
            displayFinalScore1();
            label1.setForeground(Color.red);
            afterRowClick();
        } else if (e.getSource() == rzrBkBtn) {
            rollCounter = 0;
            player1ScoreBoard.setFinalScore(1);
            displayFinalScore1();
            label2.setForeground(Color.red);
            afterRowClick();
        } else if (e.getSource() == trotterBtn) {
            rollCounter = 0;
            player1ScoreBoard.setFinalScore(2);
            displayFinalScore1();
            label3.setForeground(Color.red);
            afterRowClick();
        } else if (e.getSource() == snouterBtn) {
            rollCounter = 0;
            player1ScoreBoard.setFinalScore(3);
            displayFinalScore1();
            label4.setForeground(Color.red);
            afterRowClick();
        } else if (e.getSource() == leaningJowlerBtn) {
            rollCounter = 0;
            player1ScoreBoard.setFinalScore(4);
            displayFinalScore1();
            label5.setForeground(Color.red);
            afterRowClick();
        } else if (e.getSource() == dbRzrbkBtn) {
            rollCounter = 0;
            player1ScoreBoard.setFinalScore(5);
            displayFinalScore1();
            label6.setForeground(Color.red);
            afterRowClick();
        } else if (e.getSource() == dbTrottereBtn) {
            rollCounter = 0;
            player1ScoreBoard.setFinalScore(6);
            displayFinalScore1();
            label7.setForeground(Color.red);
            afterRowClick();
        } else if (e.getSource() == dbSnouterBtn) {
            rollCounter = 0;
            player1ScoreBoard.setFinalScore(7);
            displayFinalScore1();
            label8.setForeground(Color.red);
            afterRowClick();
        } else if (e.getSource() == dblnJowlerBtn) {
            rollCounter = 0;
            player1ScoreBoard.setFinalScore(8);
            displayFinalScore1();
            label9.setForeground(Color.red);
            afterRowClick();
        } else if (e.getSource() == mixedComboBtn) {
            rollCounter = 0;
            player1ScoreBoard.setFinalScore(9);
            displayFinalScore1();
            label10.setForeground(Color.red);
            afterRowClick();
        }else if(e.getSource() == piggybackBtn) {
            rollCounter = 0;
            player1ScoreBoard.setFinalScore(10);
            displayFinalScore1();
            label11.setForeground(Color.red);
            afterRowClick();
        }if (e.getSource() == sideBtn2) {
            rollCounter = 0;
            player2ScoreBoard.setFinalScore(0);
            displayFinalScore2();
            label14.setForeground(Color.red);
            afterRowClick();
        } else if (e.getSource() == rzrBkBtn2) {
            rollCounter = 0;
            player2ScoreBoard.setFinalScore(1);
            displayFinalScore2();
            label15.setForeground(Color.red);
            afterRowClick();
        } else if (e.getSource() == trotterBtn2) {
            rollCounter = 0;
            player2ScoreBoard.setFinalScore(2);
            displayFinalScore2();
            label16.setForeground(Color.red);
            afterRowClick();
        } else if (e.getSource() == snouterBtn2) {
            rollCounter = 0;
            player2ScoreBoard.setFinalScore(3);
            displayFinalScore2();
            label17.setForeground(Color.red);
            afterRowClick();
        } else if (e.getSource() == leaningJowlerBtn2) {
            rollCounter = 0;
            player2ScoreBoard.setFinalScore(4);
            displayFinalScore2();
            label18.setForeground(Color.red);
            afterRowClick();
        } else if (e.getSource() == dbRzrbkBtn2) {
            rollCounter = 0;
            player2ScoreBoard.setFinalScore(5);
            displayFinalScore2();
            label19.setForeground(Color.red);
            afterRowClick();
        } else if (e.getSource() == dbTrottereBtn2) {
            rollCounter = 0;
            player2ScoreBoard.setFinalScore(6);
            displayFinalScore2();
            label20.setForeground(Color.red);
            afterRowClick();
        } else if (e.getSource() == dbSnouterBtn2) {
            rollCounter = 0;
            player2ScoreBoard.setFinalScore(7);
            displayFinalScore2();
            label21.setForeground(Color.red);
            afterRowClick();
        } else if (e.getSource() == dblnJowlerBtn2) {
            rollCounter = 0;
            player2ScoreBoard.setFinalScore(8);
            displayFinalScore2();
            label22.setForeground(Color.red);
            afterRowClick();
        } else if (e.getSource() == mixedComboBtn2) {
            player2ScoreBoard.setFinalScore(9);
            displayFinalScore2();
            label23.setForeground(Color.red);
            afterRowClick();
        }else if(e.getSource() == piggybackBtn2){
            rollCounter = 0;
            player2ScoreBoard.setFinalScore(10);
            displayFinalScore2();
            label24.setForeground(Color.red);
            afterRowClick();
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
            if(turnCounter % 2 == 0 && rollCounter < 3){
                if(rollCounter == 0){
                    player1Hand.rollPigs("nnnn".toCharArray());
                }else{
                    player1Hand.rollPigs(keep);
                }
                updateDiceImages();
                player1ScoreBoard.setCurrentScore();
                displayCurrentScore1(player1ScoreBoard);
                rollCounter++;
                System.out.println(rollCounter);
            }else if (turnCounter % 2 != 0 && rollCounter < 3){
                if(rollCounter == 0){
                    player2Hand.rollPigs("nnnn".toCharArray());
                }else{
                    player2Hand.rollPigs(keep);
                }
                updateDiceImages();
                player2ScoreBoard.setCurrentScore();
                displayCurrentScore2(player2ScoreBoard);
                rollCounter++;
                System.out.println(rollCounter);
            }else{
                JOptionPane.showMessageDialog(buttonPanel, "INVALID CHOICE, YOU CAN'T ROLL AGAIN");
                if(turnCounter % 2 == 0){
                    player1ScoreBoard.setCurrentScore();
                    displayCurrentScore1(player1ScoreBoard);
                }else{
                    player2ScoreBoard.setCurrentScore();
                    displayCurrentScore2(player2ScoreBoard);
                }
            }
            setClickableUnclickableAfterRollClick();
        }
    }

    private  void setClickableUnclickableAfterRollClick(){
        setHoldButtonsClickable();
        if(turnCounter % 2 == 0){
            setRowButtonsClickable();
            disableRowsWithScores();
            setRowButtonsUnclickable2();
        }else{
            setRowButtonsClickable2();
            disableRowsWithScores2();
            setRowButtonsUnclickable();
        }
    }

    private void togglePlayerLabel(){
        if(currentPlayerLabel.getText().equals("Player 1's turn!")){
            currentPlayerLabel.setText("Player 2's turn!");
        }else{
            currentPlayerLabel.setText("Player 1's turn!");
        }
        resetPigs();
    }

    private void setHoldButtonsUnclickable(){
        pigBtn2.setEnabled(false);
        pigBtn1.setEnabled(false);
        pigBtn3.setEnabled(false);
        pigBtn4.setEnabled(false);
    }

    private void setHoldButtonsClickable(){
        pigBtn2.setEnabled(true);
        pigBtn1.setEnabled(true);
        pigBtn3.setEnabled(true);
        pigBtn4.setEnabled(true);
    }

    private void setRowButtonsUnclickable(){
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
        bonusBtn.setEnabled(false);
        totalBtn.setEnabled(false);
    }

    private void setRowButtonsClickable(){
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
        bonusBtn.setEnabled(true);
        totalBtn.setEnabled(true);
    }

    private void setRowButtonsUnclickable2(){
        sideBtn2.setEnabled(false);
        trotterBtn2.setEnabled(false);
        dblnJowlerBtn2.setEnabled(false);
        snouterBtn2.setEnabled(false);
        leaningJowlerBtn2.setEnabled(false);
        rzrBkBtn2.setEnabled(false);
        dbRzrbkBtn2.setEnabled(false);
        piggybackBtn2.setEnabled(false);
        mixedComboBtn2.setEnabled(false);
        dbSnouterBtn2.setEnabled(false);
        dbTrottereBtn2.setEnabled(false);
        bonusBtn2.setEnabled(false);
        totalBtn2.setEnabled(false);
    }

    private void setRowButtonsClickable2(){
        sideBtn2.setEnabled(true);
        trotterBtn2.setEnabled(true);
        dblnJowlerBtn2.setEnabled(true);
        snouterBtn2.setEnabled(true);
        leaningJowlerBtn2.setEnabled(true);
        rzrBkBtn2.setEnabled(true);
        dbRzrbkBtn2.setEnabled(true);
        piggybackBtn2.setEnabled(true);
        mixedComboBtn2.setEnabled(true);
        dbSnouterBtn2.setEnabled(true);
        dbTrottereBtn2.setEnabled(true);
        bonusBtn2.setEnabled(true);
        totalBtn2.setEnabled(true);
    }

    private void updateDiceImages(){
        Pig[] currentPigs;
        if(turnCounter % 2 == 0){ currentPigs = player1Hand.getHandArray(); }
        else { currentPigs = player2Hand.getHandArray(); }

        for(int i = 0; i < 4; i++){
            if(currentPigs[i].pigVal == Pig.CurPig.SIDE){
                if( i == 0){
                    pig1.setIcon(new ImageIcon(sidePNG));
                }
                if( i == 1){
                    pig2.setIcon(new ImageIcon(sidePNG));
                }
                if( i == 2){
                    pig3.setIcon(new ImageIcon(sidePNG));
                }
                if( i == 3){
                    pig4.setIcon(new ImageIcon(sidePNG));
                }

            }else if(currentPigs[i].pigVal == Pig.CurPig.RAZORBACK){
                if( i == 0){
                    pig1.setIcon(new ImageIcon(razorbackPNG));
                }
                if( i == 1){
                    pig2.setIcon(new ImageIcon(razorbackPNG));
                }
                if( i == 2){
                    pig3.setIcon(new ImageIcon(razorbackPNG));
                }
                if( i == 3){
                    pig4.setIcon(new ImageIcon(razorbackPNG));
                }

            }else if (currentPigs[i].pigVal == Pig.CurPig.SNOUTER){
                if( i == 0){
                    pig1.setIcon(new ImageIcon(snouterPNG));
                }
                if( i == 1){
                    pig2.setIcon(new ImageIcon(snouterPNG));
                }
                if( i == 2){
                    pig3.setIcon(new ImageIcon(snouterPNG));
                }
                if( i == 3){
                    pig4.setIcon(new ImageIcon(snouterPNG));
                }

            }else if (currentPigs[i].pigVal == Pig.CurPig.TROTTER){
                if( i == 0){
                    pig1.setIcon(new ImageIcon(trotterPNG));
                }
                if( i == 1){
                    pig2.setIcon(new ImageIcon(trotterPNG));
                }
                if( i == 2){
                    pig3.setIcon(new ImageIcon(trotterPNG));
                }
                if( i == 3){
                    pig4.setIcon(new ImageIcon(trotterPNG));
                }

            }else {
                if( i == 0){
                    pig1.setIcon(new ImageIcon(leaningJowlerPNG));
                }
                if( i == 1){
                    pig2.setIcon(new ImageIcon(leaningJowlerPNG));
                }
                if( i == 2){
                    pig3.setIcon(new ImageIcon(leaningJowlerPNG));
                }
                if( i == 3) {
                    pig4.setIcon(new ImageIcon(leaningJowlerPNG));
                }

            }
    }
    }

    public static void main(String[] args) {
        JFrame frame = new GameScreen1();
        frame.setTitle("PASS THE PIGS");
        frame.setLocationByPlatform(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    private void resetKeeping(){
        pigBtn1.setText("HOLD");
        pigBtn2.setText("HOLD");
        pigBtn3.setText("HOLD");
        pigBtn4.setText("HOLD");
        keep[0] = 'n';
        keep[1] = 'n';
        keep[2] = 'n';
        keep[3] = 'n';
    }

    private void resetHands(){
        player2Hand = new Hand();
        player1Hand = new Hand();
    }

    private void disableRowsWithScores() {
        boolean[] hasScoreArray = player1ScoreBoard.getHasScore();
        for (int i = 0; i < 11; i++) {
            if (hasScoreArray[i]) {
                switch (i) {
                    case 0:
                        sideBtn.setEnabled(false);
                        break;
                    case 1:
                        rzrBkBtn.setEnabled(false);
                        break;
                    case 2:
                        trotterBtn.setEnabled(false);
                        break;
                    case 3:
                        snouterBtn.setEnabled(false);
                        break;
                    case 4:
                        leaningJowlerBtn.setEnabled(false);
                        break;
                    case 5:
                        dbRzrbkBtn.setEnabled(false);
                        break;
                    case 6:
                        dbTrottereBtn.setEnabled(false);
                        break;
                    case 7:
                        dbSnouterBtn.setEnabled(false);
                        break;
                    case 8:
                        dblnJowlerBtn.setEnabled(false);
                        break;
                    case 9:
                        mixedComboBtn.setEnabled(false);
                        break;
                    case 10:
                        piggybackBtn.setEnabled(false);
                        break;
                    case 11:
                        bonusBtn.setEnabled(false);
                        break;
                    case 12:
                        totalBtn.setEnabled(false);
                        break;
                    default:
                        break;

                }
            }
        }

    }

    private void disableRowsWithScores2() {
        boolean[] hasScoreArray = player2ScoreBoard.getHasScore();
        for (int i = 0; i < 11; i++) {
            if (hasScoreArray[i]) {
                switch (i) {
                    case 0:
                        sideBtn2.setEnabled(false);
                        break;
                    case 1:
                        rzrBkBtn2.setEnabled(false);
                        break;
                    case 2:
                        trotterBtn2.setEnabled(false);
                        break;
                    case 3:
                        snouterBtn2.setEnabled(false);
                        break;
                    case 4:
                        leaningJowlerBtn2.setEnabled(false);
                        break;
                    case 5:
                        dbRzrbkBtn2.setEnabled(false);
                        break;
                    case 6:
                        dbTrottereBtn2.setEnabled(false);
                        break;
                    case 7:
                        dbSnouterBtn2.setEnabled(false);
                        break;
                    case 8:
                        dblnJowlerBtn2.setEnabled(false);
                        break;
                    case 9:
                        mixedComboBtn2.setEnabled(false);
                        break;
                    case 10:
                        piggybackBtn2.setEnabled(false);
                        break;
                    case 11:
                        bonusBtn2.setEnabled(false);
                        break;
                    case 12:
                        totalBtn2.setEnabled(false);
                    default:
                        break;

                }
            }
        }

    }
}