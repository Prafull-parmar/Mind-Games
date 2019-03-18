
import javax.imageio.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.*;

public class TicTacToe extends JFrame{
	JFrame frame = this;
	public static int counter;
	
	JButton jButton1 = new JButton("");
	JButton jButton2 = new JButton("");
	JButton jButton3 = new JButton("");
	JButton jButton4 = new JButton("");
	JButton jButton5 = new JButton("");
	JButton jButton6 = new JButton("");
	JButton jButton7 = new JButton("");
	JButton jButton8 = new JButton("");
	JButton jButton9 = new JButton("");
	JButton jButton10 = new JButton("Restart");
	JButton jButton11 = new JButton("Quit");
	JLabel jLabel = new JLabel();
	
	JLabel background;
	
	public TicTacToe(){
		super("Tic Tac Toe");
		init();
	}
	
	public void init(){

		frame.setLayout(null);
		 try{
	        	BufferedImage img=ImageIO.read(new File("Images/tictactoe.jpg"));
	        	background=new JLabel(new ImageIcon(img));
	        }
		  catch(IOException e){
			  System.out.println("Error occured while loading image!");
		  }
		
		 jLabel.setForeground(Color.WHITE);
		jButton1.setBounds(10,10,75,75);
        jButton2.setBounds(95,10,75,75);
        jButton3.setBounds(180,10,75,75);
        jButton4.setBounds(10,95,75,75);
        jButton5.setBounds(95,95,75,75);
        jButton6.setBounds(180,95,75,75);
        jButton7.setBounds(10,180,75,75);
        jButton8.setBounds(95,180,75,75);
        jButton9.setBounds(180,180,75,75);
        jButton10.setBounds(265,10,150,35);
        jButton11.setBounds(265,220,150,35);
        jLabel.setBounds(275,95,150,165);
        background.setBounds(0,0,445,315);
      
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        
		frame.add(jButton1);
		frame.add(jButton2);
		frame.add(jButton3);
		frame.add(jButton4);
		frame.add(jButton5);
		frame.add(jButton6);
		frame.add(jButton7);
		frame.add(jButton8);
		frame.add(jButton9);
		frame.add(jButton10);
		frame.add(jButton11);
		frame.add(jLabel);
		frame.add(background);
		
		frame.setSize(445, 315);
		frame.setVisible(true);
		
		Font f = new Font("Calibri", Font.BOLD, 40);
        
        jButton1.setFont(f);
        jButton2.setFont(f);
        jButton3.setFont(f);
        jButton4.setFont(f);
        jButton5.setFont(f);
        jButton6.setFont(f);
        jButton7.setFont(f);
        jButton8.setFont(f);
        jButton9.setFont(f);
        
        Color c1 = new Color(51, 255, 51);
        Color c2 = new Color(255,0,0);
        
        jButton3.setBackground(c1);
        jButton3.setForeground(c2);
        jButton1.setBackground(c1);
        jButton1.setForeground(c2);
        jButton2.setBackground(c1);
        jButton2.setForeground(c2);
        jButton7.setBackground(c1);
        jButton4.setForeground(c2);
        jButton4.setBackground(c1);
        jButton5.setForeground(c2);
        jButton5.setBackground(c1);
        jButton6.setForeground(c2);
        jButton6.setBackground(c1);
        jButton7.setForeground(c2);
        jButton8.setBackground(c1);
        jButton8.setForeground(c2);
        jButton9.setBackground(c1);
        jButton9.setForeground(c2);
        
        jButton1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jButton4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jButton5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jButton6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jButton7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        
        jButton8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jButton9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jButton10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jButton11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
       
	}
	 private void jButton1ActionPerformed(ActionEvent e) {
         if(jButton1.getText().equals("")){
             counter++;
         	if(TicTacToeController.player1Turn == true){
         		jButton1.setText("X");
         		TicTacToeController.checkforWin();
         		TicTacToeController.player1Turn = false;
         	}
         	else{
         		jButton1.setText("0");
         		TicTacToeController.checkforWin();
         		TicTacToeController.player1Turn = true;
         	}
         }
 }

     public void reset(){
     	jButton1.setText("");
     	jButton2.setText("");
     	jButton3.setText("");
     	jButton4.setText("");
     	jButton5.setText("");
     	jButton6.setText("");
     	jButton7.setText("");
     	jButton8.setText("");
     	jButton9.setText("");
     	TicTacToeController.player1Turn = true;
     	TicTacToeController.player2Turn = false;
     	TicTacToeController.player1Won = false;
     	TicTacToeController.player2Won = false;
         counter = 0;
     	
     }
 public void jButton2ActionPerformed(ActionEvent e) {
 	if(jButton2.getText().equals("")){
         counter++;
     	if(TicTacToeController.player1Turn == true){
     		jButton2.setText("X");
     		TicTacToeController.checkforWin();
     		TicTacToeController.player1Turn = false;
     	}
     	else{
     		jButton2.setText("0");
     		TicTacToeController.checkforWin();
     		TicTacToeController.player1Turn = true;
     	}
     }
 }



 private void jButton3ActionPerformed(ActionEvent e) {
 	if(jButton3.getText().equals("")){
         counter++;
     	if(TicTacToeController.player1Turn == true){
     		jButton3.setText("X");
     		TicTacToeController.checkforWin();
     		TicTacToeController.player1Turn = false;
     	}
     	else{
     		jButton3.setText("0");
     		TicTacToeController.checkforWin();
     		TicTacToeController.player1Turn = true;
     	}
     }
 }

 private void jButton4ActionPerformed(ActionEvent e) {
 	if(jButton4.getText().equals("")){
         counter++;
     	if(TicTacToeController.player1Turn == true){
     		jButton4.setText("X");
     		TicTacToeController.checkforWin();
     		TicTacToeController.player1Turn = false;
     	}
     	else{
     		jButton4.setText("0");
     		TicTacToeController.checkforWin();
     		TicTacToeController.player1Turn = true;
     	}
     }
 }

 private void jButton5ActionPerformed(ActionEvent e) {
 	if(jButton5.getText().equals("")){
         counter++;
     	if(TicTacToeController.player1Turn == true){
     		jButton5.setText("X");
     		TicTacToeController.checkforWin();
     		TicTacToeController.player1Turn = false;
     	}
     	else{
     		jButton5.setText("0");
     		TicTacToeController.checkforWin();
     		TicTacToeController.player1Turn = true;
     	}
     }
 }

 private void jButton6ActionPerformed(ActionEvent e) {
 	if(jButton6.getText().equals("")){
         counter++;
     	if(TicTacToeController.player1Turn == true){
     		jButton6.setText("X");
     		TicTacToeController.checkforWin();
     		TicTacToeController.player1Turn = false;
     	}
     	else{
     		jButton6.setText("0");
     		TicTacToeController.checkforWin();
     		TicTacToeController.player1Turn = true;
     	}
     }
 }

 private void jButton7ActionPerformed(ActionEvent e) {
 	if(jButton7.getText().equals("")){
         counter++;
     	if(TicTacToeController.player1Turn == true){
     		jButton7.setText("X");
     		TicTacToeController.checkforWin();
     		TicTacToeController.player1Turn = false;
     	}
     	else{
     		jButton7.setText("0");
     		TicTacToeController.checkforWin();
     		TicTacToeController.player1Turn = true;
     	}
     }
 }

 private void jButton8ActionPerformed(ActionEvent e) {
 	if(jButton8.getText().equals("")){
         counter++;
     	if(TicTacToeController.player1Turn == true){
     		jButton8.setText("X");
     		TicTacToeController.checkforWin();
     		TicTacToeController.player1Turn = false;
     	}
     	else{
     		jButton8.setText("0");
     		TicTacToeController.checkforWin();
     		TicTacToeController.player1Turn = true;
     	}
     }
 }

 private void jButton9ActionPerformed(ActionEvent e) {
 	if(jButton9.getText().equals("")){
         counter++;
     	if(TicTacToeController.player1Turn == true){
     		jButton9.setText("X");
     		TicTacToeController.checkforWin();
     		TicTacToeController.player1Turn = false;
     	}
     	else{
     		jButton9.setText("0");
     		TicTacToeController.checkforWin();
     		TicTacToeController.player1Turn = true;
     	}
     }
 }
 private void jButton10ActionPerformed(ActionEvent e) {
	 	reset();
 }
 private void jButton11ActionPerformed(ActionEvent e) {
	 reset();
	 JOptionPane.showMessageDialog(TicTacToeController.board,TicTacToeController.name1+": "+TicTacToeController.player1+" Wins\n"+TicTacToeController.name2+": "+TicTacToeController.player2+" Wins\nDraws: "+TicTacToeController.draws,"Total Scores",1);
	 TicTacToeController.names[0]=TicTacToeController.name1;
		TicTacToeController.names[1]=TicTacToeController.name2;
		int response=JOptionPane.showOptionDialog(TicTacToeController.board,"Select the player to Continue","Mind Games:Select Player",JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,TicTacToeController.names,TicTacToeController.names[0]);	   
			if(response==1){
				new ThirdFrame(TicTacToeController.name2,1);
			}
			else{
				new ThirdFrame(TicTacToeController.name1,1);
			}
	   TicTacToeController.board.dispose();
}

}
