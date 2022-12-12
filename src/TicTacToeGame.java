/**
 * 
 */

/**
 * @author LAP-9
 *
 */
import java.util.Scanner;

public class TicTacToeGame {

	/**
	 * @param args
	**/		 
	public static void main(String[] args) {
		
		System.out.println("Welcome to Tic Tac Toe Game!!");
		
		//create array for the Tic Tac Toe values
		String [][] ticTacToeAr = {{"1","2","3"},{"4","5","6"},{"7","8","9"}};
		
		//Draw the Game shape
		System.out.println("----------------------------------");
		System.out.println("Let's get started !");
		System.out.println("Below the positions of the game:");
		System.out.println(" ");
		System.out.println(1 +" | "+ 2+" | "+3);
		System.out.println("----------");
		System.out.println(4 +" | "+ 5+" | "+6);
		System.out.println("----------");
		System.out.println(7 +" | "+ 8+" | "+9);
		
		String p1;
		String p2;
		
		//Player 1 selection
		System.out.println(" ");
		System.out.print("Player 1: Enter Your Symbol : ");
		Scanner playerSymbolOne = new Scanner(System.in);
		String playerSymbol1 = playerSymbolOne.next();
		p1 = playerSymbol1;
		
		//Player 2 selection
		System.out.print("Player 2: Enter Your Symbol : ");
		Scanner playerSymbolTwo = new Scanner(System.in);
		String playerSymbol2 = playerSymbolTwo.next();
		p2 = playerSymbol2;
		
		
		

		
		for (int a = 0; a< 9 ; a++) {
			//Draw the Game shape
			System.out.println("----------------------------------");
			System.out.println(" "+ticTacToeAr[0][0] +" | "+ ticTacToeAr[0][1]+" | "+ticTacToeAr[0][2]);
			System.out.println("----------");
			System.out.println(" "+ticTacToeAr[1][0] +" | "+ ticTacToeAr[1][1]+" | "+ticTacToeAr[1][2]);
			System.out.println("----------");
			System.out.println(" "+ticTacToeAr[2][0] +" | "+  ticTacToeAr[2][1]+" | "+ticTacToeAr[2][2]);
			
			//Player 1
			System.out.println(" ");
			System.out.print("Player 1, Make a move, Enter a Position: ");
			Scanner player1MoveSc = new Scanner(System.in);
			int player1Move = player1MoveSc.nextInt();
			
			//Add player1 symbol
			if (player1Move == 1) {
				ticTacToeAr[0][0] = p1;
				//compare the symbols of p1
				if (ticTacToeAr[0][0] == p1 && ticTacToeAr[0][1] == p1 && ticTacToeAr[0][2] == p1 ||
						ticTacToeAr[1][0] == p1 && ticTacToeAr[1][1] == p1 && ticTacToeAr[1][2] == p1 ||
						ticTacToeAr[2][0] == p1 && ticTacToeAr[2][1] == p1 && ticTacToeAr[2][2] == p1 ||
						ticTacToeAr[0][0] == p1 && ticTacToeAr[1][0] == p1 & ticTacToeAr[2][0] == p1 ||
						ticTacToeAr[0][1] == p1 && ticTacToeAr[1][1] == p1 & ticTacToeAr[2][1] == p1 ||
						ticTacToeAr[0][2] == p1 && ticTacToeAr[1][2] == p1 & ticTacToeAr[2][2] == p1 ||
						ticTacToeAr[0][0] == p1 && ticTacToeAr[1][1] == p1 & ticTacToeAr[2][2] == p1 ||
						ticTacToeAr[0][2] == p1 && ticTacToeAr[1][1] == p1 & ticTacToeAr[2][0] == p1) {
					
					//Draw the Game shape
					System.out.println("----------------------------------");
					System.out.println(" "+ticTacToeAr[0][0] +" | "+ ticTacToeAr[0][1]+" | "+ticTacToeAr[0][2]);
					System.out.println("----------");
					System.out.println(" "+ticTacToeAr[1][0] +" | "+ ticTacToeAr[1][1]+" | "+ticTacToeAr[1][2]);
					System.out.println("----------");
					System.out.println(" "+ticTacToeAr[2][0] +" | "+  ticTacToeAr[2][1]+" | "+ticTacToeAr[2][2]);
					
					//Show wining message
					System.out.println(" ");
					System.out.println("Player 1,You win!");
					break;
				}
			}
			else if (player1Move == 2) {
				ticTacToeAr[0][1] = p1;
				//compare the symbols of p1
				if (ticTacToeAr[0][0] == p1 && ticTacToeAr[0][1] == p1 && ticTacToeAr[0][2] == p1 ||
						ticTacToeAr[1][0] == p1 && ticTacToeAr[1][1] == p1 && ticTacToeAr[1][2] == p1 ||
						ticTacToeAr[2][0] == p1 && ticTacToeAr[2][1] == p1 && ticTacToeAr[2][2] == p1 ||
						ticTacToeAr[0][0] == p1 && ticTacToeAr[1][0] == p1 & ticTacToeAr[2][0] == p1 ||
						ticTacToeAr[0][1] == p1 && ticTacToeAr[1][1] == p1 & ticTacToeAr[2][1] == p1 ||
						ticTacToeAr[0][2] == p1 && ticTacToeAr[1][2] == p1 & ticTacToeAr[2][2] == p1 ||
						ticTacToeAr[0][0] == p1 && ticTacToeAr[1][1] == p1 & ticTacToeAr[2][2] == p1 ||
						ticTacToeAr[0][2] == p1 && ticTacToeAr[1][1] == p1 & ticTacToeAr[2][0] == p1) {
					
					//Draw the Game shape
					System.out.println("----------------------------------");
					System.out.println(" "+ticTacToeAr[0][0] +" | "+ ticTacToeAr[0][1]+" | "+ticTacToeAr[0][2]);
					System.out.println("----------");
					System.out.println(" "+ticTacToeAr[1][0] +" | "+ ticTacToeAr[1][1]+" | "+ticTacToeAr[1][2]);
					System.out.println("----------");
					System.out.println(" "+ticTacToeAr[2][0] +" | "+  ticTacToeAr[2][1]+" | "+ticTacToeAr[2][2]);
					
					//Show wining message
					System.out.println(" ");
					System.out.println("Player 1,You win!");
					break;
				}
			}
			else if (player1Move == 3) {
				ticTacToeAr[0][2] = p1;
				//compare the symbols of p1
				if (ticTacToeAr[0][0] == p1 && ticTacToeAr[0][1] == p1 && ticTacToeAr[0][2] == p1 ||
						ticTacToeAr[1][0] == p1 && ticTacToeAr[1][1] == p1 && ticTacToeAr[1][2] == p1 ||
						ticTacToeAr[2][0] == p1 && ticTacToeAr[2][1] == p1 && ticTacToeAr[2][2] == p1 ||
						ticTacToeAr[0][0] == p1 && ticTacToeAr[1][0] == p1 & ticTacToeAr[2][0] == p1 ||
						ticTacToeAr[0][1] == p1 && ticTacToeAr[1][1] == p1 & ticTacToeAr[2][1] == p1 ||
						ticTacToeAr[0][2] == p1 && ticTacToeAr[1][2] == p1 & ticTacToeAr[2][2] == p1 ||
						ticTacToeAr[0][0] == p1 && ticTacToeAr[1][1] == p1 & ticTacToeAr[2][2] == p1 ||
						ticTacToeAr[0][2] == p1 && ticTacToeAr[1][1] == p1 & ticTacToeAr[2][0] == p1) {
					
					//Draw the Game shape
					System.out.println("----------------------------------");
					System.out.println(" "+ticTacToeAr[0][0] +" | "+ ticTacToeAr[0][1]+" | "+ticTacToeAr[0][2]);
					System.out.println("----------");
					System.out.println(" "+ticTacToeAr[1][0] +" | "+ ticTacToeAr[1][1]+" | "+ticTacToeAr[1][2]);
					System.out.println("----------");
					System.out.println(" "+ticTacToeAr[2][0] +" | "+  ticTacToeAr[2][1]+" | "+ticTacToeAr[2][2]);
					
					//Show wining message
					System.out.println(" ");
					System.out.println("Player 1,You win!");
					break;
				}
			}
			else if (player1Move == 4) {
				ticTacToeAr[1][0] = p1;
				//compare the symbols of p1
				if (ticTacToeAr[0][0] == p1 && ticTacToeAr[0][1] == p1 && ticTacToeAr[0][2] == p1 ||
						ticTacToeAr[1][0] == p1 && ticTacToeAr[1][1] == p1 && ticTacToeAr[1][2] == p1 ||
						ticTacToeAr[2][0] == p1 && ticTacToeAr[2][1] == p1 && ticTacToeAr[2][2] == p1 ||
						ticTacToeAr[0][0] == p1 && ticTacToeAr[1][0] == p1 & ticTacToeAr[2][0] == p1 ||
						ticTacToeAr[0][1] == p1 && ticTacToeAr[1][1] == p1 & ticTacToeAr[2][1] == p1 ||
						ticTacToeAr[0][2] == p1 && ticTacToeAr[1][2] == p1 & ticTacToeAr[2][2] == p1 ||
						ticTacToeAr[0][0] == p1 && ticTacToeAr[1][1] == p1 & ticTacToeAr[2][2] == p1 ||
						ticTacToeAr[0][2] == p1 && ticTacToeAr[1][1] == p1 & ticTacToeAr[2][0] == p1) {
					
					//Draw the Game shape
					System.out.println("----------------------------------");
					System.out.println(" "+ticTacToeAr[0][0] +" | "+ ticTacToeAr[0][1]+" | "+ticTacToeAr[0][2]);
					System.out.println("----------");
					System.out.println(" "+ticTacToeAr[1][0] +" | "+ ticTacToeAr[1][1]+" | "+ticTacToeAr[1][2]);
					System.out.println("----------");
					System.out.println(" "+ticTacToeAr[2][0] +" | "+  ticTacToeAr[2][1]+" | "+ticTacToeAr[2][2]);
					
					//Show wining message
					System.out.println(" ");
					System.out.println("Player 1,You win!");
					break;
				}
			}
			else if (player1Move == 5) {
				ticTacToeAr[1][1] = p1;
				//compare the symbols of p1
				if (ticTacToeAr[0][0] == p1 && ticTacToeAr[0][1] == p1 && ticTacToeAr[0][2] == p1 ||
						ticTacToeAr[1][0] == p1 && ticTacToeAr[1][1] == p1 && ticTacToeAr[1][2] == p1 ||
						ticTacToeAr[2][0] == p1 && ticTacToeAr[2][1] == p1 && ticTacToeAr[2][2] == p1 ||
						ticTacToeAr[0][0] == p1 && ticTacToeAr[1][0] == p1 & ticTacToeAr[2][0] == p1 ||
						ticTacToeAr[0][1] == p1 && ticTacToeAr[1][1] == p1 & ticTacToeAr[2][1] == p1 ||
						ticTacToeAr[0][2] == p1 && ticTacToeAr[1][2] == p1 & ticTacToeAr[2][2] == p1 ||
						ticTacToeAr[0][0] == p1 && ticTacToeAr[1][1] == p1 & ticTacToeAr[2][2] == p1 ||
						ticTacToeAr[0][2] == p1 && ticTacToeAr[1][1] == p1 & ticTacToeAr[2][0] == p1) {
					
					//Draw the Game shape
					System.out.println("----------------------------------");
					System.out.println(" "+ticTacToeAr[0][0] +" | "+ ticTacToeAr[0][1]+" | "+ticTacToeAr[0][2]);
					System.out.println("----------");
					System.out.println(" "+ticTacToeAr[1][0] +" | "+ ticTacToeAr[1][1]+" | "+ticTacToeAr[1][2]);
					System.out.println("----------");
					System.out.println(" "+ticTacToeAr[2][0] +" | "+  ticTacToeAr[2][1]+" | "+ticTacToeAr[2][2]);
					
					//Show wining message
					System.out.println(" ");
					System.out.println("Player 1,You win!");
					break;
				}
			}
			else if (player1Move == 6) {
				ticTacToeAr[1][2] = p1;
				//compare the symbols of p1
				if (ticTacToeAr[0][0] == p1 && ticTacToeAr[0][1] == p1 && ticTacToeAr[0][2] == p1 ||
						ticTacToeAr[1][0] == p1 && ticTacToeAr[1][1] == p1 && ticTacToeAr[1][2] == p1 ||
						ticTacToeAr[2][0] == p1 && ticTacToeAr[2][1] == p1 && ticTacToeAr[2][2] == p1 ||
						ticTacToeAr[0][0] == p1 && ticTacToeAr[1][0] == p1 & ticTacToeAr[2][0] == p1 ||
						ticTacToeAr[0][1] == p1 && ticTacToeAr[1][1] == p1 & ticTacToeAr[2][1] == p1 ||
						ticTacToeAr[0][2] == p1 && ticTacToeAr[1][2] == p1 & ticTacToeAr[2][2] == p1 ||
						ticTacToeAr[0][0] == p1 && ticTacToeAr[1][1] == p1 & ticTacToeAr[2][2] == p1 ||
						ticTacToeAr[0][2] == p1 && ticTacToeAr[1][1] == p1 & ticTacToeAr[2][0] == p1) {
					
					//Draw the Game shape
					System.out.println("----------------------------------");
					System.out.println(" "+ticTacToeAr[0][0] +" | "+ ticTacToeAr[0][1]+" | "+ticTacToeAr[0][2]);
					System.out.println("----------");
					System.out.println(" "+ticTacToeAr[1][0] +" | "+ ticTacToeAr[1][1]+" | "+ticTacToeAr[1][2]);
					System.out.println("----------");
					System.out.println(" "+ticTacToeAr[2][0] +" | "+  ticTacToeAr[2][1]+" | "+ticTacToeAr[2][2]);
					
					//Show wining message
					System.out.println(" ");
					System.out.println("Player 1,You win!");
					break;
				}
			}
			else if (player1Move == 7) {
				ticTacToeAr[2][0] = p1;
				//compare the symbols of p1
				if (ticTacToeAr[0][0] == p1 && ticTacToeAr[0][1] == p1 && ticTacToeAr[0][2] == p1 ||
						ticTacToeAr[1][0] == p1 && ticTacToeAr[1][1] == p1 && ticTacToeAr[1][2] == p1 ||
						ticTacToeAr[2][0] == p1 && ticTacToeAr[2][1] == p1 && ticTacToeAr[2][2] == p1 ||
						ticTacToeAr[0][0] == p1 && ticTacToeAr[1][0] == p1 & ticTacToeAr[2][0] == p1 ||
						ticTacToeAr[0][1] == p1 && ticTacToeAr[1][1] == p1 & ticTacToeAr[2][1] == p1 ||
						ticTacToeAr[0][2] == p1 && ticTacToeAr[1][2] == p1 & ticTacToeAr[2][2] == p1 ||
						ticTacToeAr[0][0] == p1 && ticTacToeAr[1][1] == p1 & ticTacToeAr[2][2] == p1 ||
						ticTacToeAr[0][2] == p1 && ticTacToeAr[1][1] == p1 & ticTacToeAr[2][0] == p1) {
					
					//Draw the Game shape
					System.out.println("----------------------------------");
					System.out.println(" "+ticTacToeAr[0][0] +" | "+ ticTacToeAr[0][1]+" | "+ticTacToeAr[0][2]);
					System.out.println("----------");
					System.out.println(" "+ticTacToeAr[1][0] +" | "+ ticTacToeAr[1][1]+" | "+ticTacToeAr[1][2]);
					System.out.println("----------");
					System.out.println(" "+ticTacToeAr[2][0] +" | "+  ticTacToeAr[2][1]+" | "+ticTacToeAr[2][2]);
					
					//Show wining message
					System.out.println(" ");
					System.out.println("Player 1,You win!");
					break;
				}
			}
			else if (player1Move == 8) {
				ticTacToeAr[2][1] = p1;
				//compare the symbols of p1
				if (ticTacToeAr[0][0] == p1 && ticTacToeAr[0][1] == p1 && ticTacToeAr[0][2] == p1 ||
						ticTacToeAr[1][0] == p1 && ticTacToeAr[1][1] == p1 && ticTacToeAr[1][2] == p1 ||
						ticTacToeAr[2][0] == p1 && ticTacToeAr[2][1] == p1 && ticTacToeAr[2][2] == p1 ||
						ticTacToeAr[0][0] == p1 && ticTacToeAr[1][0] == p1 & ticTacToeAr[2][0] == p1 ||
						ticTacToeAr[0][1] == p1 && ticTacToeAr[1][1] == p1 & ticTacToeAr[2][1] == p1 ||
						ticTacToeAr[0][2] == p1 && ticTacToeAr[1][2] == p1 & ticTacToeAr[2][2] == p1 ||
						ticTacToeAr[0][0] == p1 && ticTacToeAr[1][1] == p1 & ticTacToeAr[2][2] == p1 ||
						ticTacToeAr[0][2] == p1 && ticTacToeAr[1][1] == p1 & ticTacToeAr[2][0] == p1) {
					
					//Draw the Game shape
					System.out.println("----------------------------------");
					System.out.println(" "+ticTacToeAr[0][0] +" | "+ ticTacToeAr[0][1]+" | "+ticTacToeAr[0][2]);
					System.out.println("----------");
					System.out.println(" "+ticTacToeAr[1][0] +" | "+ ticTacToeAr[1][1]+" | "+ticTacToeAr[1][2]);
					System.out.println("----------");
					System.out.println(" "+ticTacToeAr[2][0] +" | "+  ticTacToeAr[2][1]+" | "+ticTacToeAr[2][2]);
					
					//Show wining message
					System.out.println(" ");
					System.out.println("Player 1,You win!");
					break;
				}
			}
			else if (player1Move == 9) {
				ticTacToeAr[2][2] = p1;
				//compare the symbols of p1
				if (ticTacToeAr[0][0] == p1 && ticTacToeAr[0][1] == p1 && ticTacToeAr[0][2] == p1 ||
						ticTacToeAr[1][0] == p1 && ticTacToeAr[1][1] == p1 && ticTacToeAr[1][2] == p1 ||
						ticTacToeAr[2][0] == p1 && ticTacToeAr[2][1] == p1 && ticTacToeAr[2][2] == p1 ||
						ticTacToeAr[0][0] == p1 && ticTacToeAr[1][0] == p1 & ticTacToeAr[2][0] == p1 ||
						ticTacToeAr[0][1] == p1 && ticTacToeAr[1][1] == p1 & ticTacToeAr[2][1] == p1 ||
						ticTacToeAr[0][2] == p1 && ticTacToeAr[1][2] == p1 & ticTacToeAr[2][2] == p1 ||
						ticTacToeAr[0][0] == p1 && ticTacToeAr[1][1] == p1 & ticTacToeAr[2][2] == p1 ||
						ticTacToeAr[0][2] == p1 && ticTacToeAr[1][1] == p1 & ticTacToeAr[2][0] == p1) {
					
					//Draw the Game shape
					System.out.println("----------------------------------");
					System.out.println(" "+ticTacToeAr[0][0] +" | "+ ticTacToeAr[0][1]+" | "+ticTacToeAr[0][2]);
					System.out.println("----------");
					System.out.println(" "+ticTacToeAr[1][0] +" | "+ ticTacToeAr[1][1]+" | "+ticTacToeAr[1][2]);
					System.out.println("----------");
					System.out.println(" "+ticTacToeAr[2][0] +" | "+  ticTacToeAr[2][1]+" | "+ticTacToeAr[2][2]);
					
					//Show wining message
					System.out.println(" ");
					System.out.println("Player 1,You win!");
					break;
				}
			}

			//Draw the Game shape
			System.out.println("----------------------------------");
			System.out.println(" "+ticTacToeAr[0][0] +" | "+ ticTacToeAr[0][1]+" | "+ticTacToeAr[0][2]);
			System.out.println("----------");
			System.out.println(" "+ticTacToeAr[1][0] +" | "+ ticTacToeAr[1][1]+" | "+ticTacToeAr[1][2]);
			System.out.println("----------");
			System.out.println(" "+ticTacToeAr[2][0] +" | "+  ticTacToeAr[2][1]+" | "+ticTacToeAr[2][2]);
			
			//Player 2 turn
			System.out.println(" ");
			System.out.print("Player 2, Make a move, Enter a Position: ");
			Scanner player2MoveSc = new Scanner(System.in);
			int player2Move = player2MoveSc.nextInt();
			
			//Add player2 symbol
			if (player2Move == 1) {
				ticTacToeAr[0][0] = p2;
				//compare the symbols of p2
				if (ticTacToeAr[0][0] == p2 && ticTacToeAr[0][1] == p2 && ticTacToeAr[0][2] == p2 ||
						ticTacToeAr[1][0] == p2 && ticTacToeAr[1][1] == p2 && ticTacToeAr[1][2] == p2 ||
						ticTacToeAr[2][0] == p2 && ticTacToeAr[2][1] == p2 && ticTacToeAr[2][2] == p2 ||
						ticTacToeAr[0][0] == p2 && ticTacToeAr[1][0] == p2 & ticTacToeAr[2][0] == p2 ||
						ticTacToeAr[0][1] == p2 && ticTacToeAr[1][1] == p2 & ticTacToeAr[2][1] == p2 ||
						ticTacToeAr[0][2] == p2 && ticTacToeAr[1][2] == p2 & ticTacToeAr[2][2] == p2 ||
						ticTacToeAr[0][0] == p2 && ticTacToeAr[1][1] == p2 & ticTacToeAr[2][2] == p2 ||
						ticTacToeAr[0][2] == p2 && ticTacToeAr[1][1] == p2 & ticTacToeAr[2][0] == p2) {
					
					//Draw the Game shape
					System.out.println("----------------------------------");
					System.out.println(" "+ticTacToeAr[0][0] +" | "+ ticTacToeAr[0][1]+" | "+ticTacToeAr[0][2]);
					System.out.println("----------");
					System.out.println(" "+ticTacToeAr[1][0] +" | "+ ticTacToeAr[1][1]+" | "+ticTacToeAr[1][2]);
					System.out.println("----------");
					System.out.println(" "+ticTacToeAr[2][0] +" | "+  ticTacToeAr[2][1]+" | "+ticTacToeAr[2][2]);
					
					//Show wining message
					System.out.println(" ");
					System.out.println("Player 2,You win!");
					break;
				}
			}
			else if (player2Move == 2) {
				ticTacToeAr[0][1] = p2;
				//compare the symbols of p2
				if (ticTacToeAr[0][0] == p2 && ticTacToeAr[0][1] == p2 && ticTacToeAr[0][2] == p2 ||
						ticTacToeAr[1][0] == p2 && ticTacToeAr[1][1] == p2 && ticTacToeAr[1][2] == p2 ||
						ticTacToeAr[2][0] == p2 && ticTacToeAr[2][1] == p2 && ticTacToeAr[2][2] == p2 ||
						ticTacToeAr[0][0] == p2 && ticTacToeAr[1][0] == p2 & ticTacToeAr[2][0] == p2 ||
						ticTacToeAr[0][1] == p2 && ticTacToeAr[1][1] == p2 & ticTacToeAr[2][1] == p2 ||
						ticTacToeAr[0][2] == p2 && ticTacToeAr[1][2] == p2 & ticTacToeAr[2][2] == p2 ||
						ticTacToeAr[0][0] == p2 && ticTacToeAr[1][1] == p2 & ticTacToeAr[2][2] == p2 ||
						ticTacToeAr[0][2] == p2 && ticTacToeAr[1][1] == p2 & ticTacToeAr[2][0] == p2) {
					
					//Draw the Game shape
					System.out.println("----------------------------------");
					System.out.println(" "+ticTacToeAr[0][0] +" | "+ ticTacToeAr[0][1]+" | "+ticTacToeAr[0][2]);
					System.out.println("----------");
					System.out.println(" "+ticTacToeAr[1][0] +" | "+ ticTacToeAr[1][1]+" | "+ticTacToeAr[1][2]);
					System.out.println("----------");
					System.out.println(" "+ticTacToeAr[2][0] +" | "+  ticTacToeAr[2][1]+" | "+ticTacToeAr[2][2]);
					
					//Show wining message
					System.out.println(" ");
					System.out.println("Player 2,You win!");
					break;
				}
			}
			else if (player2Move == 3) {
				ticTacToeAr[0][2] = p2;
				//compare the symbols of p2
				if (ticTacToeAr[0][0] == p2 && ticTacToeAr[0][1] == p2 && ticTacToeAr[0][2] == p2 ||
						ticTacToeAr[1][0] == p2 && ticTacToeAr[1][1] == p2 && ticTacToeAr[1][2] == p2 ||
						ticTacToeAr[2][0] == p2 && ticTacToeAr[2][1] == p2 && ticTacToeAr[2][2] == p2 ||
						ticTacToeAr[0][0] == p2 && ticTacToeAr[1][0] == p2 & ticTacToeAr[2][0] == p2 ||
						ticTacToeAr[0][1] == p2 && ticTacToeAr[1][1] == p2 & ticTacToeAr[2][1] == p2 ||
						ticTacToeAr[0][2] == p2 && ticTacToeAr[1][2] == p2 & ticTacToeAr[2][2] == p2 ||
						ticTacToeAr[0][0] == p2 && ticTacToeAr[1][1] == p2 & ticTacToeAr[2][2] == p2 ||
						ticTacToeAr[0][2] == p2 && ticTacToeAr[1][1] == p2 & ticTacToeAr[2][0] == p2) {
					
					//Draw the Game shape
					System.out.println("----------------------------------");
					System.out.println(" "+ticTacToeAr[0][0] +" | "+ ticTacToeAr[0][1]+" | "+ticTacToeAr[0][2]);
					System.out.println("----------");
					System.out.println(" "+ticTacToeAr[1][0] +" | "+ ticTacToeAr[1][1]+" | "+ticTacToeAr[1][2]);
					System.out.println("----------");
					System.out.println(" "+ticTacToeAr[2][0] +" | "+  ticTacToeAr[2][1]+" | "+ticTacToeAr[2][2]);
					
					//Show wining message
					System.out.println(" ");
					System.out.println("Player 2,You win!");
					break;
				}
			}
			else if (player2Move == 4) {
				ticTacToeAr[1][0] = p2;
				//compare the symbols of p2
				if (ticTacToeAr[0][0] == p2 && ticTacToeAr[0][1] == p2 && ticTacToeAr[0][2] == p2 ||
						ticTacToeAr[1][0] == p2 && ticTacToeAr[1][1] == p2 && ticTacToeAr[1][2] == p2 ||
						ticTacToeAr[2][0] == p2 && ticTacToeAr[2][1] == p2 && ticTacToeAr[2][2] == p2 ||
						ticTacToeAr[0][0] == p2 && ticTacToeAr[1][0] == p2 & ticTacToeAr[2][0] == p2 ||
						ticTacToeAr[0][1] == p2 && ticTacToeAr[1][1] == p2 & ticTacToeAr[2][1] == p2 ||
						ticTacToeAr[0][2] == p2 && ticTacToeAr[1][2] == p2 & ticTacToeAr[2][2] == p2 ||
						ticTacToeAr[0][0] == p2 && ticTacToeAr[1][1] == p2 & ticTacToeAr[2][2] == p2 ||
						ticTacToeAr[0][2] == p2 && ticTacToeAr[1][1] == p2 & ticTacToeAr[2][0] == p2) {
					
					//Draw the Game shape
					System.out.println("----------------------------------");
					System.out.println(" "+ticTacToeAr[0][0] +" | "+ ticTacToeAr[0][1]+" | "+ticTacToeAr[0][2]);
					System.out.println("----------");
					System.out.println(" "+ticTacToeAr[1][0] +" | "+ ticTacToeAr[1][1]+" | "+ticTacToeAr[1][2]);
					System.out.println("----------");
					System.out.println(" "+ticTacToeAr[2][0] +" | "+  ticTacToeAr[2][1]+" | "+ticTacToeAr[2][2]);
					
					//Show wining message
					System.out.println(" ");
					System.out.println("Player 2,You win!");
					break;
				}
			}
			else if (player2Move == 5) {
				ticTacToeAr[1][1] = p2;
				//compare the symbols of p2
				if (ticTacToeAr[0][0] == p2 && ticTacToeAr[0][1] == p2 && ticTacToeAr[0][2] == p2 ||
						ticTacToeAr[1][0] == p2 && ticTacToeAr[1][1] == p2 && ticTacToeAr[1][2] == p2 ||
						ticTacToeAr[2][0] == p2 && ticTacToeAr[2][1] == p2 && ticTacToeAr[2][2] == p2 ||
						ticTacToeAr[0][0] == p2 && ticTacToeAr[1][0] == p2 & ticTacToeAr[2][0] == p2 ||
						ticTacToeAr[0][1] == p2 && ticTacToeAr[1][1] == p2 & ticTacToeAr[2][1] == p2 ||
						ticTacToeAr[0][2] == p2 && ticTacToeAr[1][2] == p2 & ticTacToeAr[2][2] == p2 ||
						ticTacToeAr[0][0] == p2 && ticTacToeAr[1][1] == p2 & ticTacToeAr[2][2] == p2 ||
						ticTacToeAr[0][2] == p2 && ticTacToeAr[1][1] == p2 & ticTacToeAr[2][0] == p2) {
					
					//Draw the Game shape
					System.out.println("----------------------------------");
					System.out.println(" "+ticTacToeAr[0][0] +" | "+ ticTacToeAr[0][1]+" | "+ticTacToeAr[0][2]);
					System.out.println("----------");
					System.out.println(" "+ticTacToeAr[1][0] +" | "+ ticTacToeAr[1][1]+" | "+ticTacToeAr[1][2]);
					System.out.println("----------");
					System.out.println(" "+ticTacToeAr[2][0] +" | "+  ticTacToeAr[2][1]+" | "+ticTacToeAr[2][2]);
					
					//Show wining message
					System.out.println(" ");
					System.out.println("Player 2,You win!");
					break;
				}
			}
			else if (player2Move == 6) {
				ticTacToeAr[1][2] = p2;
				//compare the symbols of p2
				if (ticTacToeAr[0][0] == p2 && ticTacToeAr[0][1] == p2 && ticTacToeAr[0][2] == p2 ||
						ticTacToeAr[1][0] == p2 && ticTacToeAr[1][1] == p2 && ticTacToeAr[1][2] == p2 ||
						ticTacToeAr[2][0] == p2 && ticTacToeAr[2][1] == p2 && ticTacToeAr[2][2] == p2 ||
						ticTacToeAr[0][0] == p2 && ticTacToeAr[1][0] == p2 & ticTacToeAr[2][0] == p2 ||
						ticTacToeAr[0][1] == p2 && ticTacToeAr[1][1] == p2 & ticTacToeAr[2][1] == p2 ||
						ticTacToeAr[0][2] == p2 && ticTacToeAr[1][2] == p2 & ticTacToeAr[2][2] == p2 ||
						ticTacToeAr[0][0] == p2 && ticTacToeAr[1][1] == p2 & ticTacToeAr[2][2] == p2 ||
						ticTacToeAr[0][2] == p2 && ticTacToeAr[1][1] == p2 & ticTacToeAr[2][0] == p2) {
					
					//Draw the Game shape
					System.out.println("----------------------------------");
					System.out.println(" "+ticTacToeAr[0][0] +" | "+ ticTacToeAr[0][1]+" | "+ticTacToeAr[0][2]);
					System.out.println("----------");
					System.out.println(" "+ticTacToeAr[1][0] +" | "+ ticTacToeAr[1][1]+" | "+ticTacToeAr[1][2]);
					System.out.println("----------");
					System.out.println(" "+ticTacToeAr[2][0] +" | "+  ticTacToeAr[2][1]+" | "+ticTacToeAr[2][2]);
					
					//Show wining message
					System.out.println(" ");
					System.out.println("Player 2,You win!");
					break;
				}
			}
			else if (player2Move == 7) {
				ticTacToeAr[2][0] = p2;
				//compare the symbols of p2
				if (ticTacToeAr[0][0] == p2 && ticTacToeAr[0][1] == p2 && ticTacToeAr[0][2] == p2 ||
						ticTacToeAr[1][0] == p2 && ticTacToeAr[1][1] == p2 && ticTacToeAr[1][2] == p2 ||
						ticTacToeAr[2][0] == p2 && ticTacToeAr[2][1] == p2 && ticTacToeAr[2][2] == p2 ||
						ticTacToeAr[0][0] == p2 && ticTacToeAr[1][0] == p2 & ticTacToeAr[2][0] == p2 ||
						ticTacToeAr[0][1] == p2 && ticTacToeAr[1][1] == p2 & ticTacToeAr[2][1] == p2 ||
						ticTacToeAr[0][2] == p2 && ticTacToeAr[1][2] == p2 & ticTacToeAr[2][2] == p2 ||
						ticTacToeAr[0][0] == p2 && ticTacToeAr[1][1] == p2 & ticTacToeAr[2][2] == p2 ||
						ticTacToeAr[0][2] == p2 && ticTacToeAr[1][1] == p2 & ticTacToeAr[2][0] == p2) {
					
					//Draw the Game shape
					System.out.println("----------------------------------");
					System.out.println(" "+ticTacToeAr[0][0] +" | "+ ticTacToeAr[0][1]+" | "+ticTacToeAr[0][2]);
					System.out.println("----------");
					System.out.println(" "+ticTacToeAr[1][0] +" | "+ ticTacToeAr[1][1]+" | "+ticTacToeAr[1][2]);
					System.out.println("----------");
					System.out.println(" "+ticTacToeAr[2][0] +" | "+  ticTacToeAr[2][1]+" | "+ticTacToeAr[2][2]);
					
					//Show wining message
					System.out.println(" ");
					System.out.println("Player 2,You win!");
					break;
				}
			}
			else if (player2Move == 8) {
				ticTacToeAr[2][1] = p2;
				//compare the symbols of p2
				if (ticTacToeAr[0][0] == p2 && ticTacToeAr[0][1] == p2 && ticTacToeAr[0][2] == p2 ||
						ticTacToeAr[1][0] == p2 && ticTacToeAr[1][1] == p2 && ticTacToeAr[1][2] == p2 ||
						ticTacToeAr[2][0] == p2 && ticTacToeAr[2][1] == p2 && ticTacToeAr[2][2] == p2 ||
						ticTacToeAr[0][0] == p2 && ticTacToeAr[1][0] == p2 & ticTacToeAr[2][0] == p2 ||
						ticTacToeAr[0][1] == p2 && ticTacToeAr[1][1] == p2 & ticTacToeAr[2][1] == p2 ||
						ticTacToeAr[0][2] == p2 && ticTacToeAr[1][2] == p2 & ticTacToeAr[2][2] == p2 ||
						ticTacToeAr[0][0] == p2 && ticTacToeAr[1][1] == p2 & ticTacToeAr[2][2] == p2 ||
						ticTacToeAr[0][2] == p2 && ticTacToeAr[1][1] == p2 & ticTacToeAr[2][0] == p2) {
					
					//Draw the Game shape
					System.out.println("----------------------------------");
					System.out.println(" "+ticTacToeAr[0][0] +" | "+ ticTacToeAr[0][1]+" | "+ticTacToeAr[0][2]);
					System.out.println("----------");
					System.out.println(" "+ticTacToeAr[1][0] +" | "+ ticTacToeAr[1][1]+" | "+ticTacToeAr[1][2]);
					System.out.println("----------");
					System.out.println(" "+ticTacToeAr[2][0] +" | "+  ticTacToeAr[2][1]+" | "+ticTacToeAr[2][2]);
					
					//Show wining message
					System.out.println(" ");
					System.out.println("Player 2,You win!");
					break;
				}
			}
			else if (player2Move == 9) {
				ticTacToeAr[2][2] = p2;
				//compare the symbols of p2
				if (ticTacToeAr[0][0] == p2 && ticTacToeAr[0][1] == p2 && ticTacToeAr[0][2] == p2 ||
						ticTacToeAr[1][0] == p2 && ticTacToeAr[1][1] == p2 && ticTacToeAr[1][2] == p2 ||
						ticTacToeAr[2][0] == p2 && ticTacToeAr[2][1] == p2 && ticTacToeAr[2][2] == p2 ||
						ticTacToeAr[0][0] == p2 && ticTacToeAr[1][0] == p2 & ticTacToeAr[2][0] == p2 ||
						ticTacToeAr[0][1] == p2 && ticTacToeAr[1][1] == p2 & ticTacToeAr[2][1] == p2 ||
						ticTacToeAr[0][2] == p2 && ticTacToeAr[1][2] == p2 & ticTacToeAr[2][2] == p2 ||
						ticTacToeAr[0][0] == p2 && ticTacToeAr[1][1] == p2 & ticTacToeAr[2][2] == p2 ||
						ticTacToeAr[0][2] == p2 && ticTacToeAr[1][1] == p2 & ticTacToeAr[2][0] == p2) {
					
					//Draw the Game shape
					System.out.println("----------------------------------");
					System.out.println(" "+ticTacToeAr[0][0] +" | "+ ticTacToeAr[0][1]+" | "+ticTacToeAr[0][2]);
					System.out.println("----------");
					System.out.println(" "+ticTacToeAr[1][0] +" | "+ ticTacToeAr[1][1]+" | "+ticTacToeAr[1][2]);
					System.out.println("----------");
					System.out.println(" "+ticTacToeAr[2][0] +" | "+  ticTacToeAr[2][1]+" | "+ticTacToeAr[2][2]);
					
					//Show wining message
					System.out.println(" ");
					System.out.println("Player 2,You win!");
					break;
				}
			}	
			
			
			
		}
	}
		

}
