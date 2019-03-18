import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.swing.event.*;

public class FirstFrame {
	boolean enable=false;
	String name;
    JTextField tf;
    JButton b1;
    Font f;
    Color c;
    JFrame jfrm;
    JLabel lb1,lb2,background;
  
    FirstFrame(){
    	
    	try{
    	 BufferedImage img=ImageIO.read(new File("Images/Brain wallpaper.jpg"));//"C:\\Users\\Prafull Parmar\\Pictures\\Mindgames.jpg"));
    	  background=new JLabel(new ImageIcon(img) );
    	}
    	catch(IOException e){
    		System.out.println("Error while loading Image!");
    	}
    	
   	   f= new Font("New Times Roman",Font.BOLD,20);
        jfrm=new JFrame("Mind Games!.");
    	jfrm.setSize(500, 500);
    	jfrm.setLocationRelativeTo(null);
    	jfrm.setResizable(false);
    	
    	tf = new JTextField(" ");
    	tf.requestFocus();
    	b1 = new JButton("START");
    	lb1 = new JLabel("");
        lb2 = new JLabel("Name :");
        background.setBounds(0, 0, 500, 500);
    	c = new Color(255,0,0);
    	lb1.setText("Welcome to the Mind Games!");
    	lb1.setForeground(c);
    	lb1.setFont(f);
          f= new Font("New Times Roman",Font.BOLD,18);
    	c=Color.WHITE;
        lb2.setForeground(c);
        jfrm.setVisible(true);
    	jfrm.setLayout(null);
    	jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	tf.setBounds(160,150,200,30);
        lb2.setBounds(80,150,80,30);
    	b1.setBounds(150,210,200,40);
    	lb1.setBounds(110,50,280,40);
        tf.setFont(f);
        b1.setFont(f);
        lb2.setFont(f);
    	jfrm.add(tf);
    	jfrm.add(b1);
    	jfrm.add(lb1);
    	jfrm.add(lb2);
    	jfrm.add(background);
    	b1.addActionListener(actnbtn);
    
    	
    	tf.getDocument().addDocumentListener(new DocumentListener(){
            @Override
			public void changedUpdate(DocumentEvent arg0) {
				changed();
			}
            @Override
			public void insertUpdate(DocumentEvent arg0) {
				changed();
			}
            @Override
			public void removeUpdate(DocumentEvent arg0) {
				changed();
			}
    		public void changed(){
    			if(tf.getText().equals("")){
    			  enable=false;
    			}
    			else{
    		     enable=true;
    			}
    		}
    	});
    	tf.addKeyListener(keyl);
    }
    
   ActionListener actnbtn =new ActionListener(){
    	public void actionPerformed(ActionEvent ae){
    		if(ae.getSource()==b1){
    			
    				
    		    if(enable==true){
    		    name=tf.getText();
    			
    		    new SecondFrame(name);
    			jfrm.dispose();
    			
    		}
    		}
    }
    };
    	
    
   /* ActionListener txtf =new ActionListener(){
    	public void actionPerformed(ActionEvent ae){
    		if(tf.getText().equals("")){
				enable=false;
			}
			else{
				enable=true;
			}
    		
    	}
    };*/
    KeyListener keyl = new KeyListener(){
	@Override
	public void keyPressed(KeyEvent ae) {
		if(ae.getKeyCode()==KeyEvent.VK_ENTER){
			if(enable==true){
    		    name=tf.getText();
    			new SecondFrame(name);
    			jfrm.dispose();
    			
    		}
		}
	}

	
	@Override
		public void keyTyped(KeyEvent ae) {}
    @Override
	public void keyReleased(KeyEvent arg0) {}
    };
	
    
  
   public static void main(String[] args){
	   new FirstFrame();
   }
}

     

