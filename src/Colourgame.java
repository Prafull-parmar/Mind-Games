import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.Timer;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.*;

public class Colourgame extends JFrame implements ActionListener
{ JFrame jfrm=this;
	int counter=60;
	boolean Enable=false;
int randomNameGen1, randomNameGen2, randomColGen, randomizer, score = 0;
String[] nameArray = { "BLACK", "BLUE", "GREEN", "RED", "YELLOW" };
String name;
Random r;
Container con;
Color c,c1;
Font f;
Timer timer;
JButton b1, b2,b3,b4;
JLabel l1, l2, l3, l4, l5,l6,bg;
private static JTextArea ta1=new JTextArea(); 
public void generator()
{
randomizer = r.nextInt(2);
randomNameGen1 = r.nextInt(5);
randomNameGen2 = r.nextInt(5);
if(randomizer == 0)
{
randomColGen = randomNameGen1;
}
else
{
randomColGen = r.nextInt(5);
}
switch(randomColGen)
{
case 0:
c = new Color(0,0,0);
break;

case 1:
c = new Color(0,0,255);
break;

case 2:
c = new Color(0,200,0);
break;

case 3:
c = new Color(255,0,0);
break;

case 4:
c = new Color(255,255,0);
break;
}
l1.setText(nameArray[randomNameGen1]);
l2.setText(nameArray[randomNameGen2]);
l2.setForeground(c);
l3.setText("Score: "+score);
}
Colourgame(String na)
{
super("ColourGame");
name=na;
 c1=Color.WHITE;
try{
	  BufferedImage img=ImageIO.read(new File("Images/colorgam.jpg"));
	  bg= new JLabel(new ImageIcon(img));
}
catch(IOException e){
	  System.out.println("Error occured while loading image!");
}
r = new Random();
f = new Font("New Times Roman", Font.BOLD, 17);
b1 = new JButton("Yes");
b2 = new JButton("No");
b3= new JButton("Start");
b4= new JButton("Quit");
l1 = new JLabel();
l2 = new JLabel();
l3 = new JLabel();
l4 = new JLabel("Does the meaning match the text colour?");
l5 = new JLabel();
l6 = new JLabel("**********Game Record**********");
l1.setFont(f);
l2.setFont(f);
l1.setToolTipText("Meaning");
l2.setToolTipText("Text Colour");
ta1.setLineWrap(true);
ta1.setWrapStyleWord(true);
ta1.setEditable(false);

con = getContentPane();
con.setLayout(null);
l1.setBounds(165, 170, 100, 50);
l1.setBackground(c1);
l2.setBackground(c1);
l1.setOpaque(true);
l2.setOpaque(true);
l1.setHorizontalAlignment(SwingConstants.CENTER);
l1.setVerticalAlignment(SwingConstants.CENTER);
l2.setHorizontalAlignment(SwingConstants.CENTER);
l2.setVerticalAlignment(SwingConstants.CENTER);
l2.setBounds(165, 250, 100, 50);
l3.setBounds(330, 20, 100, 50);
l3.setFont(f);
l4.setBounds(60, 100, 350, 50);
l4.setFont(f);
l5.setBounds(190, 20, 130, 50);
l5.setFont(f);
l6.setBounds(430,20,250,20);
l6.setFont(f);
ta1.setBounds(430, 40, 250, 650);
f=new Font("New Times Roman",Font.BOLD,19);
b2.setBounds(80, 350, 120, 50);
b2.setFont(f);
b1.setBounds(225, 350, 120, 50);
b1.setFont(f);
b3.setBounds(225, 450, 120, 50);
b3.setFont(f);
b4.setBounds(80, 450, 120, 50);
b4.setFont(f);
bg.setBounds(0, 0, 700, 600);
l3.setForeground(c1);
l4.setForeground(c1);
l5.setForeground(c1);
l6.setForeground(c1);
con.add(l1);
con.add(l2);
con.add(b1);
con.add(b2);
con.add(b3);
con.add(b4);
con.add(l3);
con.add(l4);
con.add(ta1);
con.add(l5);
con.add(l6);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
add(bg);
setDefaultCloseOperation(DISPOSE_ON_CLOSE);
setSize(700, 600);
setVisible(true);
setLocationRelativeTo(null);
setResizable(false);
generator();
}

public void actionPerformed(ActionEvent obj)
{
if(obj.getSource() == b1)
{
	if(Enable==true){
if(randomNameGen1 == randomColGen)
{
score = score+1;
generator();
}
else
{
score = score-1;
generator();
}
	}
}
else if(obj.getSource() == b2)
{
	if(Enable==true){
if(randomNameGen1 == randomColGen)
{
score = score-1;
generator();
}
else
{
score = score+1;
generator();
}
}
}
if(obj.getSource() == b3){
	  if(Enable!=true){ Enable=true;
	l5.setText("Time left:"+counter);

	

	
	timer =new Timer(1000,new ActionListener(){
		
	       public void actionPerformed(ActionEvent e)
			{
				
				counter--;
				if(counter>=0)
				{
					//SimpleDateFormat sdf=new SimpleDateFormat("HH:mm:ss");
					//l4.setText(sdf.format(counter));
					l5.setText("Time left:"+counter);
					
				
				}
				else{
					timer.stop();
					l5.setText("Done!Game Over");
					ta1.append(name +":  "+score+"\n");
					if(score<0)
					{
						JOptionPane.showMessageDialog(jfrm,name+ " :Your Final Score is "+score+"\nBetter luck next time!!!", "Message:Game Over",1);
					}
					else
					{
						JOptionPane.showMessageDialog( jfrm,name+":Your Final Score is "+score, "Message:Game Over",1);
					}	
					new ThirdFrame(name,2);
					
					jfrm.dispose();
				}
			}
		});
		timer.start();
	  }
}
if(obj.getSource()==b4){
	if(Enable==true)
		{
		timer.stop();
		}
	ta1.append(name +":  "+score+"\n");
		
	JOptionPane.showMessageDialog( jfrm,name+":Your Final Score is "+score, "Message:Game Over",1);
	new ThirdFrame(name,2);
	jfrm.dispose();
		
}
}

public static void main(String [] args)
{
new Colourgame("Default_Player1");

}
}
