
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * A frame with a button panel
 */
public class GameScreen1 extends JFrame implements ActionListener
{
    private JPanel buttonPanel;
    private static final int DEFAULT_WIDTH = 1400;
    private static final int DEFAULT_HEIGHT = 900;


    ImageIcon titleIcon = new ImageIcon("title.png");
    JLabel titleLabel = new JLabel(new ImageIcon("src/Images/title.PNG"));
    JLabel scoreBoardLabel = new JLabel("ScoreCard");
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
    JLabel player1Label = new JLabel("Player 1 Score");
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
    JLabel player2Label = new JLabel("Player 2 Score");
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

    public GameScreen1()
    {
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
        int fontSize = 24;


        buttonPanel = new JPanel();
        buttonPanel.setBackground(Color.WHITE);
        buttonPanel.setLayout(new GridBagLayout());

        buttonPanel.add(titleLabel,  new GBC(3,0, 7,1).setFill(GBC.CENTER));
        buttonPanel.add(scoreBoardLabel, new GBC(0,1).setFill(GBC.HORIZONTAL).setInsets(1));
        buttonPanel.add(sideBtn, new GBC(1,1).setFill(GBC.HORIZONTAL));
        buttonPanel.add(rzrBkBtn, new GBC(2,1).setFill(GBC.HORIZONTAL));
        buttonPanel.add(trotterBtn, new GBC(3,1).setFill(GBC.HORIZONTAL));
        buttonPanel.add(snouterBtn, new GBC(4,1).setFill(GBC.HORIZONTAL));
        buttonPanel.add(leaningJowlerBtn, new GBC(5,1).setFill(GBC.HORIZONTAL));
        buttonPanel.add(dbRzrbkBtn, new GBC(6,1).setFill(GBC.HORIZONTAL));
        buttonPanel.add(dbTrottereBtn, new GBC(7,1).setFill(GBC.HORIZONTAL));
        buttonPanel.add(dbSnouterBtn, new GBC(8,1).setFill(GBC.HORIZONTAL));
        buttonPanel.add(dblnJowlerBtn, new GBC(9,1).setFill(GBC.HORIZONTAL));
        buttonPanel.add(mixedComboBtn, new GBC(10,1).setFill(GBC.HORIZONTAL));
        buttonPanel.add(piggybackBtn, new GBC(11,1).setFill(GBC.HORIZONTAL));

        buttonPanel.add(player1Label,new GBC(0,2).setFill(GBC.HORIZONTAL));
        buttonPanel.add(label1, new GBC(1,2).setFill(GBC.CENTER));
        buttonPanel.add(label2, new GBC(2,2).setFill(GBC.CENTER));
        buttonPanel.add(label3, new GBC(3,2).setFill(GBC.CENTER));
        buttonPanel.add(label4, new GBC(4,2).setFill(GBC.CENTER));
        buttonPanel.add(label5, new GBC(5,2).setFill(GBC.CENTER));
        buttonPanel.add(label6, new GBC(6,2).setFill(GBC.CENTER));
        buttonPanel.add(label7, new GBC(7,2).setFill(GBC.CENTER));
        buttonPanel.add(label8, new GBC(8,2).setFill(GBC.CENTER));
        buttonPanel.add(label9, new GBC(9,2).setFill(GBC.CENTER));
        buttonPanel.add(label10, new GBC(10,2).setFill(GBC.CENTER));
        buttonPanel.add(label11, new GBC(11,2).setFill(GBC.CENTER));

        buttonPanel.add(player2Label,new GBC(0,3).setFill(GBC.HORIZONTAL).setInsets(1));
        buttonPanel.add(label12, new GBC(1,3).setFill(GBC.CENTER));
        buttonPanel.add(label13, new GBC(2,3).setFill(GBC.CENTER));
        buttonPanel.add(label14, new GBC(3,3).setFill(GBC.CENTER));
        buttonPanel.add(label15, new GBC(4,3).setFill(GBC.CENTER));
        buttonPanel.add(label16, new GBC(5,3).setFill(GBC.CENTER));
        buttonPanel.add(label17, new GBC(6,3).setFill(GBC.CENTER));
        buttonPanel.add(label18, new GBC(7,3).setFill(GBC.CENTER));
        buttonPanel.add(label19, new GBC(8,3).setFill(GBC.CENTER));
        buttonPanel.add(label20, new GBC(9,3).setFill(GBC.CENTER));
        buttonPanel.add(label21, new GBC(10,3).setFill(GBC.CENTER));
        buttonPanel.add(label22, new GBC(11,3).setFill(GBC.CENTER));

        pig1.setBorder(BorderFactory.createLineBorder(Color.black));
        pig2.setBorder(BorderFactory.createLineBorder(Color.black));
        pig3.setBorder(BorderFactory.createLineBorder(Color.black));
        pig4.setBorder(BorderFactory.createLineBorder(Color.black));
        buttonPanel.add(pig1, new GBC(1,4, 2,3).setFill(GBC.CENTER));
        buttonPanel.add(pig2, new GBC(4,4,2,3).setFill(GBC.CENTER));
        buttonPanel.add(pig3, new GBC(7,4,2,3).setFill(GBC.CENTER));
        buttonPanel.add(pig4, new GBC(10,4,2,3).setFill(GBC.CENTER));
        //// Hold Buttons
        pigBtn1.setFont(new Font("Ultra", Font.PLAIN, 24));
        pigBtn1.setBackground(Color.ORANGE);
        pigBtn2.setFont(new Font("Ultra", Font.PLAIN, 24));
        pigBtn2.setBackground(Color.ORANGE);
        pigBtn3.setFont(new Font("Ultra", Font.PLAIN, 24));
        pigBtn3.setBackground(Color.ORANGE);
        pigBtn4.setFont(new Font("Ultra", Font.PLAIN, 24));
        pigBtn4.setBackground(Color.ORANGE);

        buttonPanel.add(pigBtn1, new GBC(1,7,2,1).setFill(GBC.CENTER));
        buttonPanel.add(pigBtn2, new GBC(4,7,2,1).setFill(GBC.CENTER));
        buttonPanel.add(pigBtn3, new GBC(7,7,2,1).setFill(GBC.CENTER));
        buttonPanel.add(pigBtn4, new GBC(10,7,2,1).setFill(GBC.CENTER));
        rollBtn.setBackground(Color.WHITE);
        buttonPanel.add(rollBtn, new GBC(5,8,4,1).setFill(GBC.CENTER));


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

    }


    public void actionPerformed(ActionEvent e)
    {

    	if(e.getSource() == sideBtn) {
    		label1.setText("10");
            pig1.setIcon(new ImageIcon(sidePNG));
    		}
        else if(e.getSource() == rzrBkBtn)  {
            label2.setText("20");
            pig2.setIcon(new ImageIcon(trotterPNG));
        }
    	else if(e.getSource() == trotterBtn)  {
            label3.setText("30");
            pig3.setIcon(new ImageIcon(snouterPNG));
    		}
        else if(e.getSource() == snouterBtn)  {
            label4.setText("40");
            pig4.setIcon(new ImageIcon(leaningJowlerPNG));
        }
        else if(e.getSource() == leaningJowlerBtn)  {
            label5.setText("50");
        }
        else if(e.getSource() == dbRzrbkBtn)  {
            label6.setText("60");
        }else if(e.getSource() == dbTrottereBtn)  {
            label7.setText("70");
        }else if(e.getSource() == dbSnouterBtn)  {
            label8.setText("80");
        }else if(e.getSource() == dblnJowlerBtn)  {
            label9.setText("90");
        }else if(e.getSource() == mixedComboBtn)  {
            label10.setText("100");
        }
    	else {
            label11.setText("110");

    	}
    }

    public static void main(String[] args) {
        JFrame frame = new GameScreen1();
        frame.setTitle("Button Test");
        frame.setLocationByPlatform(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}