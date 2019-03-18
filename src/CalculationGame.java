import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.Timer;
import java.awt.event.*;
import java.util.*;
import java.awt.*;
import java.awt.image.*;
import java.io.*;
class CalculationGame implements ActionListener
{
	int num1,num2;
	int score=0,counter=60;
	int op1,op2,optr,type;
	String name;
	boolean Enable=false;
	 Font f;
	 Color c;
     Timer timer;
	JFrame frmobj;
	JButton btn1,btn2,btneql,btnexit,btnstart;
	JLabel lblscore,lbltxt,lbltime,lblrecord,bg;
	public static JTextArea ta2=new JTextArea();
	Random r;
	CalculationGame(String nam){
		name=nam;
		createcompo();
		addcompo();
		addListeners();
		generate();
		
	}
	public void createcompo()
	{   c=new Color(113,194,255);
		frmobj=new JFrame("Mind Games");
		frmobj.setLocationRelativeTo(null);
        f=new Font("New Times Roman",Font.BOLD,17);
		btn1=new JButton(" ");
		btn2=new JButton(" ");
		btneql=new JButton("EQUAL");
		btneql.setFont(f);
		btnexit=new JButton("Quit");
		btnexit.setFont(f);
		btnstart=new JButton("Start");
		btnstart.setFont(f);
		lbltime=new JLabel();
		lbltime.setHorizontalAlignment(SwingConstants.CENTER);
		lbltime.setVerticalAlignment(SwingConstants.CENTER);
		lbltime.setBackground(c);
		lbltime.setOpaque(true);
		lbltime.setFont(f);
	    lblrecord= new JLabel("**********Game Record**********");;
		lblrecord.setFont(f);
        lblrecord.setHorizontalAlignment(SwingConstants.CENTER);
		lblrecord.setVerticalAlignment(SwingConstants.CENTER);
		lblrecord.setBackground(c);
		lblrecord.setOpaque(true);
		lblscore=new JLabel("Score: 0");
		lblscore.setHorizontalAlignment(SwingConstants.CENTER);
		lblscore.setVerticalAlignment(SwingConstants.CENTER);
		lblscore.setBackground(c);
		lblscore.setOpaque(true);
		lblscore.setFont(f);
		lbltxt=new JLabel("Click the GREATER number");
		lbltxt.setHorizontalAlignment(SwingConstants.CENTER);
		lbltxt.setVerticalAlignment(SwingConstants.CENTER);
		lbltxt.setBackground(c);
		lbltxt.setOpaque(true);
		lbltxt.setFont(f);
	    ta2.setLineWrap(true);
		ta2.setWrapStyleWord(true);
		ta2.setEditable(false);
		  f=new Font("New Times Roman",Font.BOLD,19);
		  btn1.setFont(f);
		  btn2.setFont(f);
		  try{
			  BufferedImage img=ImageIO.read(new File("Images/mathgame.jpg"));
			  bg= new JLabel(new ImageIcon(img));
		  }
		  catch(IOException e){
			  System.out.println("Error occured while loading image!");
		  }
		  
	}
		
	public void addcompo()
	{   frmobj.setSize(700,700);
	    frmobj.setVisible(true);
	    frmobj.setLocationRelativeTo(null);
		frmobj.setLayout(null);
		frmobj.setResizable(false);
		btn1.setBounds(110,200,220,60);		
		frmobj.add(btn1);
		btn2.setBounds(110,300,220,60);
		frmobj.add(btn2);		
		btneql.setBounds(110,400,220,60);	
		frmobj.add(btneql);
		btnexit.setBounds(50, 500, 150, 50);
		frmobj.add(btnexit);
		btnstart.setBounds(240,500,150,50);
		frmobj.add(btnstart);
		lblscore.setBounds(340,10, 100, 20);
		frmobj.add(lblscore);
		lbltime.setBounds(200, 10, 100, 20);
		frmobj.add(lbltime);
		lbltxt.setBounds(90,150,270,20);
		frmobj.add(lbltxt);
		lblrecord.setBounds(440,10,250,30);
		frmobj.add(lblrecord);
		ta2.setBounds(440, 40, 250, 600);
		frmobj.add(ta2);
		bg.setBounds(0,0,700,700);
		frmobj.add(bg);
		
		
 
		
	}

	public void randomgen()
	{
		r=new Random();
		op1=r.nextInt(21);
		op2=r.nextInt(21);
		while(op2>op1&&op1>0){
			op2=r.nextInt(21);
		}
		optr=r.nextInt(5);
		type=r.nextInt(2);		
	}

	public void generate()
	{
		randomgen();	
		switch(optr) 
		{
			case 0:	num1=op1+op2;
				btn1.setText(op1+"+"+op2);
				break;

			case 1:	num1=op1-op2;
				btn1.setText(op1+"-"+op2);
				break;

			case 2:	num1=op1*op2;
				btn1.setText(op1+"*"+op2);
				break;

			case 3:	if(op2!=0)	
				{	num1=op1/op2;
					btn1.setText(op1+"/"+op2);
				}	
				else
				{
					num1=(int)(Math.random()*100);
					btn1.setText(""+num1);	
				}
				break;

			case 4:	num1=(int)(Math.random()*100);
				btn1.setText(""+num1);
				break;							
		}
	
		randomgen();	
		switch(optr) 
		{
			case 0:	num2=op1+op2;
				btn2.setText(op1+"+"+op2);
				break;

			case 1:	num2=op1-op2;
				btn2.setText(op1+"-"+op2);
				break;

			case 2:	num2=op1*op2;
				btn2.setText(op1+"*"+op2);
				break;

			case 3:	if(op2!=0)	
				{	
					num2=op1/op2;
					btn2.setText(op1+"/"+op2);
				}	
				else
				{
					num2=(int)(Math.random()*100);
					btn2.setText(""+num2);	
				}
				break;

			case 4:	num2=(int)(Math.random()*100);
				btn2.setText(""+num2);
				break;						
		}				
	}
	
	public void addListeners()
	{
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btneql.addActionListener(this);
		btnexit.addActionListener(this);
		btnstart.addActionListener(this);
	}

	public void actionPerformed(ActionEvent ae)
	{    if(ae.getSource()==btnstart){
		if(Enable!=true)
		{Enable=true;
		lbltime.setText("Time left:"+counter);
		timer = new Timer(1000,new ActionListener(){
			public void actionPerformed(ActionEvent e){
				counter--;
				lbltime.setText("Time left:"+counter);
				if(counter>0){
					lbltime.setText("Time left:"+counter);
				}
				else{
					timer.stop();
					ta2.append(name+":  "+score+"\n");
					JOptionPane.showMessageDialog(frmobj,name+" :Your Final Score is : "+score, "Message:Game Over",1);
					new ThirdFrame(name,3);
				   frmobj.dispose();
				}
			}
		});
		timer.start();
		}
	}
		if(ae.getSource()==btn1)
		{   if(Enable==true){
			if(num1>num2)
			{
				score++;
				lblscore.setText("Score: "+score);
			}
			else
			{
				score--;
				lblscore.setText("Score: "+score);	
			}
			generate();
		}
		}
		 if(ae.getSource()==btn2)
		{  
			if(Enable==true){
			if(num2>num1)
			{
				score++;
				lblscore.setText("Score: "+score);
			}
			else
			{
				score--;
				lblscore.setText("Score: "+score);	
			}
			generate();
		}
		}
		
		if(ae.getSource()==btneql)
		{   
			if(Enable==true){
			if(num1==num2)
			{
				score++;
				lblscore.setText("Score: "+score);	
			}
			else
			{
				score--;
				lblscore.setText("Score: "+score);
			}
			generate();
		}
		}
		if(ae.getSource()==btnexit)
		{   if(Enable==true){
			timer.stop();
		}
		    ta2.append(name+":  "+score+"\n");
			if(score<0)
			{   
				JOptionPane.showMessageDialog(frmobj,name+": Your Final Score is "+score+"\nBetter luck next time!!!","Message:Game Over",1);
				
			}
			else
			{
				JOptionPane.showMessageDialog(frmobj,name+": Your Final Score is "+score,"Message:Game Over",1);
				
			}
			new ThirdFrame(name,3);
			frmobj.dispose();
		
		}
	}

	public static void main(String args[])
	{
		new CalculationGame("Default Player1");
		
	}
}