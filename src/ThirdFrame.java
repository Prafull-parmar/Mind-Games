
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
public class ThirdFrame implements ActionListener{
int gamenumber;
JFrame jfrm;
JButton b0,b1,b2,b3;
JLabel l1,l2,bg;
String name;

Font f;
Color c;

ThirdFrame(String nam,int n){
	name=nam;
	 try{
		  BufferedImage img=ImageIO.read(new File("Images/Thirdframe.jpg"));
		  bg= new JLabel(new ImageIcon(img));
	  }
	  catch(IOException e){
		  System.out.println("Error occured while loading image!");
	  }
	gamenumber=n;
	jfrm=new JFrame("Mind Games!");
	jfrm.setSize(500,500);
	jfrm.setLocationRelativeTo(null);
	
	jfrm.setLayout(null);
	b0=new JButton("Replay Game");
	b1=new JButton("Play Another Game");
	b2=new JButton("New Player");
	b3=new JButton("Exit Game");
	l1=new JLabel(name+":Select Any Option");
	f=new Font("New Times Roman",Font.BOLD,17);
	c=new Color(255,255,255);
	
	jfrm.setVisible(true);
	l1.setBounds(100,90,300,50);
	l1.setForeground(c);
	b0.setBounds(45,150, 200, 50);
	b1.setBounds(255,150, 200, 50);
	b2.setBounds(150,220, 200, 50);
	b3.setBounds(150,290,200,50);
	b0.setFont(f);
	b0.addActionListener(this);
	b1.setFont(f);
	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	bg.setBounds(0,0,500,500);
	b2.setFont(f);
	b3.setFont(f);
	l1.setFont(f);
	jfrm.add(b0);
    jfrm.add(b1);
    jfrm.add(b2);
    jfrm.add(b3);
    jfrm.add(l1);
    jfrm.add(bg);
	
}
public static void main(String[] args){
	new ThirdFrame("Default Player",0);
	
}
@Override
public void actionPerformed(ActionEvent e) {
	if(e.getSource()==b0){
	   switch(gamenumber){
	   case 1:{
		   new TicTacToeController(name);
	     break;
		  }
	   case 2:{
	       new Colourgame(name);
		
		jfrm.dispose();
		break;
	     }
	   case 3:{
		  new CalculationGame(name);
		  
		   jfrm.dispose();
		   break;
	   }
	   case 4:{
		   new MemoryGame(name);
		   jfrm.dispose();
		   break;
		   }
	}
	}
	if(e.getSource()==b1){
		new SecondFrame(name);
		
		jfrm.dispose();
	}
	if(e.getSource()==b2){
		new FirstFrame();
		jfrm.dispose();
		
		
	}
	if(e.getSource()==b3){
		System.exit(0);
	}
	
}
}
