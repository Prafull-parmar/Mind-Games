import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
public class SecondFrame implements ActionListener {
	String name;
    JFrame jfrm;
    JButton b1,b2,b3,b4;
    JLabel lb1,lb2,background;
    Font f;
    Color c;
    
    SecondFrame(String name){
    	this.name=name;
    	f = new Font("New Times Roman",Font.BOLD,16);
    	c = new Color(200,20,235);
    	jfrm = new JFrame("Mind Games");
    	jfrm.setSize(500,500);
    	jfrm.setLocationRelativeTo(null);
    	jfrm.setResizable(false);
    	try{
       	 BufferedImage img=ImageIO.read(new File("Images/Mindgames.jpg"));//"C:\\Users\\Prafull Parmar\\Pictures\\Mindgames.jpg"));
       	  background=new JLabel(new ImageIcon(img) );
       	}
       	catch(IOException e){
       		System.out.println("Error while loading Image!");
       	}
    	b1= new JButton("Game1:TicTacToe");
    	b2= new JButton("Game2:Colour Match");
    	b3= new JButton("Game3:Math Game");
    	b4= new JButton("Game4:Memory Game");
    	lb1 = new JLabel("Hello "+name);
    	lb2 = new JLabel("\nSelect the Game you want to Play.");
    	
    
    	jfrm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    	jfrm.setLayout(null);
    	background.setBounds(0, 0, 500, 500);
    	lb1.setBounds(180,25,200,30);
    	lb2.setBounds(125,60,300,30);
    	b1.setBounds(125,120,250,50);
    	b2.setBounds(125,200,250,50);
    	b3.setBounds(125,280,250,50);
    	b4.setBounds(125,360,250,50);
    	lb1.setFont(f);
    	lb1.setForeground(Color.YELLOW);
    	lb2.setFont(f);
    	lb2.setForeground(Color.GREEN);
    	b1.setFont(f);
    	b1.setForeground(c);
    	b2.setFont(f);
    	b2.setForeground(c);
    	b3.setFont(f);
    	b3.setForeground(c);
    	b4.setFont(f);
    	b4.setForeground(c);
    	
    	jfrm.add(lb1);
    	jfrm.add(lb2);
        jfrm.add(b1);
    	jfrm.add(b2);
    	jfrm.add(b3);
    	jfrm.add(b4);
    	jfrm.add(background);
    	b1.addActionListener(this);
    	b2.addActionListener(this);
    	b3.addActionListener(this);
    	b4.addActionListener(this);
    	jfrm.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
    	if(e.getSource()==b1){
    		
    	  new TicTacToeController(name);
  		 
  		   jfrm.dispose();
    	}
    	if(e.getSource()==b2){
    		
    		new Colourgame(name);
    		
    		jfrm.dispose();
    		
    	}
    	if(e.getSource()==b3){
    	  new CalculationGame(name);
    	
       jfrm.dispose();
    	}
    	if(e.getSource()==b4){
    		new MemoryGame(name);
    		jfrm.dispose();
    	}
    }
    public static void main(String[] args){
    	new SecondFrame("Default Player");
    }
}
