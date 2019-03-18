import javax.imageio.*;
import javax.swing.*;
import javax.swing.Timer;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.*;
public class MemoryGame extends JFrame implements ActionListener  {
  
    private static JTextArea ta3;
    JFrame jfrm=this;
    JLabel lbrecord,lbmean,lbscore,lbcheck,lbtime,background;
    JButton bst,bq,by,bn;
    int score=0,counter=60;
    int[] xpoints={120,180,260,320,320,260,180,120};
    int[] ypoints={280,220,220,280,360,420,420,360};
    int ranshape1=0,randomizer,rancol1=0,randomizer1,randomizer2;
    Font f;
    Color c,c1;
    JPanel pan;
    Timer timer;
    Random r;
    String name="Prafull";
    int i,col=0,shape=0;
    boolean enable=false,colour=false;
    MemoryGame(String nam){
        name=nam;
        try{
        	BufferedImage img=ImageIO.read(new File("Images/memory.jpg"));
        	background=new JLabel(new ImageIcon(img));
        	
        }
        catch(IOException e){
        	System.out.println("Error occured while loading image!");
        }
	   f=new Font("New Times Roman",Font.BOLD,17);
    	c1=Color.WHITE;
    	bst=new JButton("START");
    	bq=new JButton("QUIT");
        by=new JButton("YES");
        bn=new JButton("NO");
        lbrecord=new JLabel("**********Game Record**********");
        lbmean=new JLabel();
        lbscore=new JLabel("Score: "+score);
         lbtime=new JLabel();
         lbcheck = new JLabel();
        setSize(700,700);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        background.setBounds(0, 0, 700, 700);
         ta3=new JTextArea();
        setLayout(null);
        bq.setBounds(50, 580, 150, 50);
        bq.setFont(f);
        bst.setBounds(240,580,150,50);
        bst.setFont(f);
        ta3.setBounds(440, 40, 250, 600);
        ta3.setEditable(false);
        ta3.setLineWrap(true);
        ta3.setWrapStyleWord(true);
        lbrecord.setBounds(440,20,250,20);
        lbrecord.setFont(f);
       
        lbmean.setBounds(25, 100, 390, 80);
        lbmean.setFont(f);
        lbscore.setBounds(340, 20, 100, 40);
        lbscore.setFont(f);
        lbtime.setBounds(200, 20, 150, 40);
        lbtime.setFont(f);
        lbcheck.setBounds(165, 400, 150, 50);
        lbcheck.setFont(new Font("Times Roman",Font.BOLD,28));
        lbrecord.setForeground(c1);
        lbscore.setForeground(c1);
        lbtime.setForeground(c1);
        lbcheck.setForeground(c1);
        lbmean.setForeground(c1);
        bn.setBounds(50, 500, 150, 50);
        bn.setFont(f);
        by.setBounds(240, 500, 150, 50);
        by.addActionListener(this);
        bn.addActionListener(this);
        bst.addActionListener(this);
        bq.addActionListener(this);
        by.setFont(f);
        this.add(by);
        this.add(bn);
        add(lbscore);
        add(lbtime);
        add(lbcheck);
        add(bq);
        add(bst);
        add(ta3);
        add(lbrecord);
        add(lbmean);
        add(background);
        //rancol1=r.nextInt(5);
        randomcolor();
        Randomgen();
       // c=new Color(0,0,0);
      //draw d =new draw();
    // d.setBounds(150,200,200,70);
     // this.add(d);
        setVisible(true);
       
    	} 
    
  public  void Randomgen(){
    	
    	ranshape1 = (int)(Math.random()*6);
    	//rannum2 = r.nextInt(5);
    	rancol1 = (int)(Math.random()*5);
    	//rancol2 = r.nextInt(5);
    	randomizer =(int)(Math.random()*2);
    	randomizer1=(int)(Math.random()*2);
    	if(randomizer==0){
    	switch(randomizer1){
    	case 0:{
    		lbmean.setText("Does the SHAPE Match the previous Shape?");
    		lbcheck.setText("SHAPE");
    		i=shape;
    		colour=false;
    		randomcolor();
    		//col=rancol1;
    		repaint();
    		break;
    	}
    	case 1:{
    		lbmean.setText("Does the COLOUR Match the previous Colour?");
    		lbcheck.setText("COLOUR");
    		i=ranshape1;
    		colour=true;
    		randomcolor();
    		repaint();
    		break;
    	}
    	
    	}
    	}
    	if(randomizer==1){
    		switch(randomizer1){
    		case 0:{
        		lbmean.setText("Does the SHAPE Match the previous Shape?");
        		lbcheck.setText("SHAPE");
        		i=ranshape1;
        	    colour=false;
        		randomcolor();
        	     repaint();
        	     break;
        	     }
    		case 1:{
        		lbmean.setText("Does the COLOUR Match the previous Colour?");
        		lbcheck.setText("COLOUR");
        		rancol1=col;
        		i=ranshape1;
        		colour=true;
        		randomcolor();
        		repaint();
        		break;
        	}}
    }
  }
   public void randomcolor(){
    	switch(rancol1)
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
    }
    
  // public void painter(){
   public void paint(Graphics g){
	  
	   if(i==0){
	   super.paint(g);
	   g.setColor(c);
	   g.fillRect(120, 220, 200,200);
	   }
		if(i==1){
		   super.paint(g);
		   g.setColor(c);
		   g.fillRoundRect(120, 220, 200, 200, 75, 75);
		}
		if( i==2){
		    super.paint(g);
		    g.setColor(c);
		    g.fillRect(120, 260, 200, 120);
		}
		if(i==3){
			super.paint(g);
			g.setColor(c);
			g.fillRoundRect(120, 260, 200, 120, 70, 70);
		}
		if(i==4){
			super.paint(g);
			g.setColor(c);
			g.fillOval(120, 220, 200, 200);
		}
		if(i==5){
			super.paint(g);
			g.setColor(c);
			g.fillPolygon(xpoints, ypoints, 8);
	       
		}
		}
  // }
  
   
    	
	
	
	
	@Override
	public void actionPerformed(ActionEvent ae) {
	     if(ae.getSource()==by){
	    	 if(enable==true){
	    		 if(shape==i&&colour==false){
	    			 score++;
	    			 lbscore.setText("Score: "+score);
	    		     col=rancol1;
	    		 }
	    		 else if(col==rancol1&&colour==true){
	    			 score++;
	    			 lbscore.setText("Score: "+score);
	    		     shape=i;
	    		 }
	    		 else{
	    			 score--;
	    			 lbscore.setText("Score: "+score);
	    		     shape=i;
	    		     col=rancol1;
	    		 }
	    		 Randomgen();
	    	 }
	     }
	     if(ae.getSource()==bn){
	    	 if(enable==true){
	    		 if(shape!=i&&colour==false){
	    			 score++;
	    			 lbscore.setText("Score: "+score);
	    		     col=rancol1;
	    		 }
	    		 else if(col!=rancol1&&colour==true){
	    			 score++;
	    			 lbscore.setText("Score: "+score);
	    		     shape=i;
	    		 }
	    		 else{
	    			 score--;
	    			 lbscore.setText("Score: "+score);
	    		     shape=i;
	    		     col=rancol1;
	    		 }
	    		 Randomgen();
	    	 }
	     }
	     if(ae.getSource() == bst){
	   	  if(enable!=true){ enable=true;
	   	lbtime.setText("Time left:"+counter);

	   	timer =new Timer(1000,new ActionListener(){
	   		
	   	       public void actionPerformed(ActionEvent e)
	   			{
	   				
	   				counter--;
	   				if(counter>=0)
	   				{
	   					//SimpleDateFormat sdf=new SimpleDateFormat("HH:mm:ss");
	   					//l4.setText(sdf.format(counter));
	   					lbtime.setText("Time left:"+counter);
	   					
	   				
	   				}
	   				else{
	   					timer.stop();
	   					lbtime.setText("Done!Game Over");
	   					ta3.append(name +":  "+score+"\n");
	   					if(score<0)
	   					{
	   						JOptionPane.showMessageDialog(jfrm,name+ " :Your Final Score is "+score+"\nBetter luck next time!!!", "Message:Game Over",1);
	   					}
	   					else
	   					{
	   						JOptionPane.showMessageDialog( jfrm,name+":Your Final Score is "+score, "Message:Game Over",1);
	   					}	
	   					new ThirdFrame(name,4);
	   					
	   					jfrm.dispose();
	   				}
	   			}
	   		});
	   		timer.start();
	   		shape=i;
			col=rancol1;
	   	     Randomgen();
	   	  }
	   }
	   if(ae.getSource()==bq){
	   	if(enable==true)
	   		{
	   		timer.stop();
	   		}
	   	ta3.append(name +":  "+score+"\n");
	   		
	   	JOptionPane.showMessageDialog( jfrm,name+":Your Final Score is "+score, "Message:Game Over",1);
	   	new ThirdFrame(name,4);
	   	jfrm.dispose();
	   	//System.exit(0);	
	   }
	   }

	    
	
 public static void main(String[] args){
	 new MemoryGame("Default Player");
	 
 }
}

