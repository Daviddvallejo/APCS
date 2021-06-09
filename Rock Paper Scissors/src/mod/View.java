package mod;

import cont.JOP;
import java.util.*; 

public class View {
	//counts the longest streak of wins
	int longestStreak = 0;
	//updates the program
	public View(){
		update();
	}
	//runs the initial rock paper scissors, allows for pvp and pve
	public void update(){
		boolean on = true;
		String msg = "Welcome to the Rock, Paper, Scissors game!" + "\n" + "Please type Player to play against another player, and Computer to play against a computer." + "\n" + "Type 'exit' to exit at any time";
		int r1 = 0;
		int r2 = 0;
		int g1 = 0;
		int g2 = 0;
		while(on){
			String input = JOP.in(msg);
			if(input.equalsIgnoreCase("Player")){
				boolean run = true;
				while(run){
					String _p1 = JOP.in("Player one: Please choose Rock, Paper, or Scissors" + "\n" + "\n" + "Current Score:" + "\n" + "Player One: " + "\n" + "           " + "Rounds: "  + r1 + "\n" + "           " + "Games: " + g1 + "\n" + "Player Two: " + "\n" + "           " + "Rounds: "  + r2 + "\n" + "           " + "Games: " + g2 + "\n" + "\n"  + "Type 'High Score' to view the current high score at any time" + "\n" + "Type 'exit' to exit at any time");
					if(_p1.equalsIgnoreCase("Rock")||_p1.equalsIgnoreCase("Paper")||_p1.equalsIgnoreCase("Scissors")){
						boolean run2 = true;
						while(run2){
							String _p2 = JOP.in("Player two: Please choose Rock, Paper, or Scissors" + "\n" + "\n" + "Current Score:" + "\n" + "Player One: " + "\n" + "           " + "Rounds: "  + r1 + "\n" + "           " + "Games: " + g1 + "\n" + "Player Two: " + "\n" + "           " + "Rounds: "  + r2 + "\n" + "           " + "Games: " + g2 + "\n" + "\n"  + "Type 'High Score' to view the current high score at any time" + "\n" + "Type 'exit' to exit at any time");								
							boolean run3 = true;
							while(run3){
								if(_p2.equalsIgnoreCase("Rock")||_p2.equalsIgnoreCase("Paper")||_p2.equalsIgnoreCase("Scissors")){
									checkWin(_p1, _p2);
									checkLose(_p1, _p2);
									if(checkWin(_p1, _p2) == true){						
										r1++;
										if(checkGameWin(r1) == true){
											JOP.msg("Player One Wins the Game!" + "\n" + "Current Score:" + "\n" + "Player One: " + "\n" + "           " + "Rounds: "  + r1 + "\n" + "           " + "Games: " + g1 + "\n" + "Player Two: " + "\n" + "           " + "Rounds: "  + r2 + "\n" + "           " + "Games: " + g2);
											g1++;
											r1 = 0;
											r2 = 0;
											highScore(g1, g2);
										}
										else{
											JOP.msg("Player One Wins!" + "\n" + "Current Score:" + "\n" + "Player One: " + "\n" + "           " + "Rounds: "  + r1 + "\n" + "           " + "Games: " + g1 + "\n" + "Player Two: " + "\n" + "           " + "Rounds: "  + r2 + "\n" + "           " + "Games: " + g2);
										}
										run2 = false;
										run3 = false;
									}
									else if(checkLose(_p1, _p2) == true){
										r2++;
										if(checkGameWin(r2) == true){
											JOP.msg("Player Two Wins the Game!" + "\n" + "Current Score:" + "\n" + "Player One: " + "\n" + "           " + "Rounds: "  + r1 + "\n" + "           " + "Games: " + g1 + "\n" + "Player Two: " + "\n" + "           " + "Rounds: "  + r2 + "\n" + "           " + "Games: " + g2);
											g2++;
											r1 = 0;
											r2 = 0;
											highScore(g1, g2);
										}
										else{
											JOP.msg("Player Two Wins!" + "\n" + "Current Score:" + "\n" + "Player One: " + "\n" + "           " + "Rounds: "  + r1 + "\n" + "           " + "Games: " + g1 + "\n" + "Player Two: " + "\n" + "           " + "Rounds: "  + r2 + "\n" + "           " + "Games: " + g2);
										}
										run2 = false;
										run3 = false;
									}
									else{
										JOP.msg("Tie! Play again" + "\n" + "Current Score:" + "\n" + "Player One: " + "\n" + "           " + "Rounds: "  + r1 + "\n" + "           " + "Games: " + g1 + "\n" + "Player Two: " + "\n" + "           " + "Rounds: "  + r2 + "\n" + "           " + "Games: " + g2);
										run2 = false; 
										run3 = false;
									}
								}
								else if(_p2.equalsIgnoreCase("High Score")){
									JOP.msg("The current High Score is: " + longestStreak);
								}
								else if(_p2.equalsIgnoreCase("exit")){
									JOP.msg("Thank you for Playing!");
									run3 = false;
									run2 = false; 
									run = false;
									on = false;
								}
								else{
									JOP.msg("Please enter a valid input");
									run3 = false;
								}
							}
						}
					}
					else if(_p1.equalsIgnoreCase("High Score")){
						JOP.msg("The current High Score is: " + longestStreak);
					}
					else if(_p1.equalsIgnoreCase("exit")){
						JOP.msg("Thank you for Playing!");
						run = false;
						on = false;
					}
					else{
						JOP.msg("Please enter a valid input");
					}
				}
			}
			else if(input.equalsIgnoreCase("Computer")){
				boolean run1 = true;
				while(run1){
					boolean run = true;
					String _c = " ";
					while(run){
					String _p1 = JOP.in("Player one: Please choose Rock, Paper, or Scissors" + "\n" + "\n" + "Current Score:" + "\n" + "Player One: " + "\n" + "           " + "Rounds: "  + r1 + "\n" + "           " + "Games: " + g1 + "\n" + "Computer: " + "\n" + "           " + "Rounds: "  + r2 + "\n" + "           " + "Games: " + g2 + "\n" + "\n"  + "Type 'High Score' to view the current high score at any time" + "\n" + "Type 'exit' to exit at any time");
					if(_p1.equalsIgnoreCase("Rock")||_p1.equalsIgnoreCase("Paper")||_p1.equalsIgnoreCase("Scissors")){
						_c = Randomize();
						if(checkWin(_p1, _c) == true){						
							r1++;
							if(checkGameWin(r1) == true){
								JOP.msg("You Won the Game!" + "\n" + "Current Score:" + "\n" + "Player One: " + "\n" + "           " + "Rounds: "  + r1 + "\n" + "           " + "Games: " + g1 + "\n" + "Computer: " + "\n" + "           " + "Rounds: "  + r2 + "\n" + "           " + "Games: " + g2);
								g1++;
								r1 = 0;
								r2 = 0;
								highScore(g1, g2);
							}
							else{
								JOP.msg("You win!" + "\n" + "Current Score:" + "\n" + "Player One: " + "\n" + "           " + "Rounds: "  + r1 + "\n" + "           " + "Games: " + g1 + "\n" + "Computer: " + "\n" + "           " + "Rounds: "  + r2 + "\n" + "           " + "Games: " + g2);
							}
							run = false;
							}
						else if(checkLose(_p1, _c) == true){
							r2++;
							if(checkGameWin(r2) == true){
								JOP.msg("Computer Wins the Game!" + "\n" + "Current Score:" + "\n" + "Player One: " + "\n" + "           " + "Rounds: "  + r1 + "\n" + "           " + "Games: " + g1 + "\n" + "Computer: " + "\n" + "           " + "Rounds: "  + r2 + "\n" + "           " + "Games: " + g2);
								g2++;
								r1 = 0;
								r2 = 0;
								highScore(g1, g2);
							}
							else{
								JOP.msg("Computer Wins!" + "\n" + "Current Score:" + "\n" + "Player One: " + "\n" + "           " + "Rounds: "  + r1 + "\n" + "           " + "Games: " + g1 + "\n" + "Computer: " + "\n" + "           " + "Rounds: "  + r2 + "\n" + "           " + "Games: " + g2);
							}
							run = false;
							}
						else{
							JOP.msg("Tie! Play again" + "\n" + "Current Score:" + "\n" + "Player One: " + "\n" + "           " + "Rounds: "  + r1 + "\n" + "           " + "Games: " + g1 + "\n" + "Computer: " + "\n" + "           " + "Rounds: "  + r2 + "\n" + "           " + "Games: " + g2);
							run = false; 
						}
					}	
					else if(_p1.equalsIgnoreCase("High Score")){
						JOP.msg("The current High Score is: " + longestStreak);
					}
					else if(_p1.equalsIgnoreCase("exit")){
						JOP.msg("Thank you for Playing!");
						run = false;
						run1 = false;
						on = false;
					}
					else{
						JOP.msg("Please enter a valid input");
					}
				}
				}
			}
			else if(input.equalsIgnoreCase("exit")){
				JOP.msg("Thank you for Playing!");
				on = false;
			}
			else{
				JOP.msg("Please enter a valid input");
			}
		}	
	}
	//checks if player 1 has won the round
	public boolean checkWin(String s, String x){
		if(s.equalsIgnoreCase("Rock") && x.equalsIgnoreCase("Scissors")){
			return true;
		}
		else if(s.equalsIgnoreCase("Scissors") && x.equalsIgnoreCase("Paper")){
			return true;
		}
		else if(s.equalsIgnoreCase("Paper") && x.equalsIgnoreCase("Rock")){
			return true;
		}
		else{
			return false;
		}
	}
	//checks if player 1 has lost the round
	public boolean checkLose(String s, String x){
		if(s.equalsIgnoreCase("Scissors") && x.equalsIgnoreCase("Rock")){
			return true;
		}
		else if(s.equalsIgnoreCase("Paper") && x.equalsIgnoreCase("Scissors")){
			return true;
		}
		else if(s.equalsIgnoreCase("Rock") && x.equalsIgnoreCase("Paper")){
			return true;
		}
		else{
			return false;
		}
	}
	//checks if player 1 has won the game
	public boolean checkGameWin(int a){
		if(a == 2){
			return true;
		}
		else{
			return false;
		}
	}
	//checks to see if the current score is larger than the highest score, if so, replaces it as the high score
	public void highScore(int a, int b){
        if(longestStreak < a){
            longestStreak = a;
        }
        else if(longestStreak < b){
            longestStreak = b;
        }
        
	}
	//randomizes the computer choice for pve options
	 public String Randomize()
	    { 
	        Random ran = new Random(); 
	        int nxt = ran.nextInt(4); 
	        if(nxt == 1)
	        {
	             return "rock";
	        }
	        else if(nxt == 2)
	        {
	        	return "scissors";
	        }
	        else
	        {
	        	return "paper";
	        }
	    } 
	} 
