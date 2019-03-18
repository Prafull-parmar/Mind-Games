import java.util.ArrayList;

import javax.swing.JOptionPane;

public class TicTacToeController{
    public static int player1=0,player2=0,draws=0;
	public static boolean player1Turn = true;
	public static boolean player1Won = false;
	public static boolean player2Won = false;
	public static boolean player2Turn = false;
	public static TicTacToe board = new TicTacToe();
	public  static String name1,name2="default";
	public static String[] names=new String[2];
	
	TicTacToeController(String nam){
		if(board.isVisible() == false){
			board.setVisible(true);
		}
		player1=0;player2=0;draws=0;
		board.setLocationRelativeTo(null);
		board.setResizable(false);
		name1=nam;
		board.jLabel.setText("");
	name2=JOptionPane.showInputDialog(board,"Player1:"+name1+"\nEnter the name of the Player2.","Mind Games:Tictactoe",2);
	
	if(name2==null){name2="Default Player";}
	}
	public static void main(String[] args) {
		new TicTacToeController("Default Player");
		
	}
	
	public static void checkforWin(){
		if(board.jButton1.getText().equals("X")){
			if(board.jButton4.getText().equals("X")){
				if(board.jButton7.getText().equals("X")){
					player1Won = true;
					player2Won = false;
					board.jLabel.setText("<html>Last Round Winner:<br>"+name1);
					player1++;
					board.reset();
				}
			}
		}
		if(board.jButton1.getText().equals("X")){
			if(board.jButton5.getText().equals("X")){
				if(board.jButton9.getText().equals("X")){
					player1Won = true;
					player2Won = false;
					board.jLabel.setText("<html>Last Round Winner:<br> "+name1);
					player1++;
					board.reset();
				}
			}
		}
		if(board.jButton1.getText().equals("X")){
			if(board.jButton2.getText().equals("X")){
				if(board.jButton3.getText().equals("X")){
					player1Won = true;
					player2Won = false;
					board.jLabel.setText("<html>Last Round Winner:<br> "+name1);
					player1++;
					board.reset();
				}
			}
		}
		if(board.jButton3.getText().equals("X")){
			if(board.jButton5.getText().equals("X")){
				if(board.jButton7.getText().equals("X")){
					player1Won = true;
					player2Won = false;
					board.jLabel.setText("<html>Last Round Winner:<br> "+name1);
					player1++;
					board.reset();
				}
			}
		}
		if(board.jButton3.getText().equals("X")){
			if(board.jButton6.getText().equals("X")){
				if(board.jButton9.getText().equals("X")){
					player1Won = true;
					player2Won = false;
					board.jLabel.setText("<html>Last Round Winner:<br> "+name1);
					player1++;
					board.reset();
				}
			}
		}
		if(board.jButton7.getText().equals("X")){
			if(board.jButton8.getText().equals("X")){
				if(board.jButton9.getText().equals("X")){
					player1Won = true;
					player2Won = false;
					board.jLabel.setText("<html>Last Round Winner:<br> "+name1);
					player1++;
					board.reset();
				}
			}
		}
		if(board.jButton4.getText().equals("X")){
			if(board.jButton5.getText().equals("X")){
				if(board.jButton6.getText().equals("X")){
					player1Won = true;
					player2Won = false;
					board.jLabel.setText("<html>Last Round Winner:<br> "+name1);
					player1++;
					board.reset();
				}
			}
		}
		if(board.jButton2.getText().equals("X")){
			if(board.jButton5.getText().equals("X")){
				if(board.jButton8.getText().equals("X")){
					player1Won = true;
					player2Won = false;
					board.jLabel.setText("<html>Last Round Winner:<br> "+name1);
					player1++;
					board.reset();
				}
			}
		}
		if(board.jButton1.getText().equals("0")){
			if(board.jButton4.getText().equals("0")){
				if(board.jButton7.getText().equals("0")){
					player1Won = false;
					player2Won = true;
					board.jLabel.setText("<html>Last Round Winner:<br> "+name2);
					player2++;
					board.reset();
				}
			}
		}
		if(board.jButton1.getText().equals("0")){
			if(board.jButton5.getText().equals("0")){
				if(board.jButton9.getText().equals("0")){
					player1Won = false;
					player2Won = true;
					board.jLabel.setText("<html>Last Round Winner:<br> "+name2);
					player2++;
					board.reset();
				}
			}
		}
		if(board.jButton1.getText().equals("0")){
			if(board.jButton2.getText().equals("0")){
				if(board.jButton3.getText().equals("0")){
					player1Won = false;
					player2Won = true;
					board.jLabel.setText("<html>Last Round Winner:<br> "+name2);
					player2++;
					board.reset();
				}
			}
		}
		if(board.jButton3.getText().equals("0")){
			if(board.jButton5.getText().equals("0")){
				if(board.jButton7.getText().equals("0")){
					player1Won = false;
					player2Won = true;
					board.jLabel.setText("<html>Last Round Winner:<br> "+name2);
					player2++;
					board.reset();
				}
			}
		}
		if(board.jButton3.getText().equals("0")){
			if(board.jButton6.getText().equals("0")){
				if(board.jButton9.getText().equals("0")){
					player1Won = false;
					player2Won = true;
					board.jLabel.setText("<html>Last Round Winner:<br> "+name2);
					player2++;
					board.reset();
				}
			}
		}
		if(board.jButton7.getText().equals("0")){
			if(board.jButton8.getText().equals("0")){
				if(board.jButton9.getText().equals("0")){
					player1Won = false;
					player2Won = true;
					board.jLabel.setText("<html>Last Round Winner:<br> "+name2);
					player2++;
					board.reset();
				}
			}
		}
		if(board.jButton4.getText().equals("0")){
			if(board.jButton5.getText().equals("0")){
				if(board.jButton6.getText().equals("0")){
					player1Won = false;
					player2Won = true;
					board.jLabel.setText("<html>Last Round Winner:<br> "+name2);
					player2++;
					board.reset();
				}
			}
		}
		if(board.jButton2.getText().equals("0")){
			if(board.jButton5.getText().equals("0")){
				if(board.jButton8.getText().equals("0")){
					player1Won = false;
					player2Won = true;
					board.jLabel.setText("<html>Last Round Winner:<br> "+name2);
					player2++;
					board.reset();
				}
			}
		}
		if(TicTacToe.counter == 9)
		{
			board.jLabel.setText("Last Round Drawn!");
			draws++;
			board.reset();
		}	
	}
}
