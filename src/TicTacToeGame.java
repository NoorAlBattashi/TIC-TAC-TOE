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
	 * @param args : This class created to play Tic Tac Toe game
	**/	
	private static void printBoard(String[][] board) {
		System.out.println();
		System.out.println(board[0][0] + "  |  " + board[0][1] + "  |  " + board[0][2]);
		System.out.println("-------------");
		System.out.println(board[1][0] + "  |  " + board[1][1] + "  |  " + board[1][2]);
		System.out.println("-------------");
		System.out.println(board[2][0] + "  |  " + board[2][1] + "  |  " + board[2][2]);
		System.out.println();
	}

	private static boolean checkWinner(String[][] board, String symbol) {
		boolean playerWon = false;
		if (board[0][0] == symbol && board[0][1] == symbol && board[0][2] == symbol
				|| board[1][0] == symbol && board[1][1] == symbol && board[1][2] == symbol
				|| board[2][0] == symbol && board[2][1] == symbol && board[2][2] == symbol
				|| board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol
				|| board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol
				|| board[0][0] == symbol && board[1][0] == symbol && board[2][0] == symbol
				|| board[0][1] == symbol && board[1][1] == symbol && board[2][1] == symbol
				|| board[0][2] == symbol && board[1][2] == symbol && board[2][2] == symbol) {

			// display the board
			printBoard(board);

			// display win message
			System.out.println(symbol + ", You win !");
			playerWon = true;
		}
		return playerWon;
	}

	private static boolean checkDraw(String[][] board) {
		boolean Draw = false;
		if (board[0][0] != "1" && board[0][1] != "2" && board[0][2] != "3" && board[1][0] != "4" && board[1][1] != "5"
				&& board[1][2] != "6" && board[2][0] != "7" && board[2][1] != "8" && board[2][2] != "9") {

			// display the board
			printBoard(board);

			// display draw message
			System.out.println("Draw, No winner !");
			Draw = true;
		}
		return Draw;

	}

	private static boolean checkMove(int playerMove, String[][] board, String symbol, boolean PlayerTurn) {
		int rowIndex = 0;
		int colIndex = 0;

		if (playerMove == 1) {
			rowIndex = 0;
			colIndex = 0;
		} else if (playerMove == 2) {
			rowIndex = 0;
			colIndex = 1;
		} else if (playerMove == 3) {
			rowIndex = 0;
			colIndex = 2;
		} else if (playerMove == 4) {
			rowIndex = 1;
			colIndex = 0;
		} else if (playerMove == 5) {
			rowIndex = 1;
			colIndex = 1;
		} else if (playerMove == 6) {
			rowIndex = 1;
			colIndex = 2;
		} else if (playerMove == 7) {
			rowIndex = 2;
			colIndex = 0;

		} else if (playerMove == 8) {
			rowIndex = 2;
			colIndex = 1;
		} else if (playerMove == 9) {
			rowIndex = 2;
			colIndex = 2;
		}
		else {
			System.out.println("Wrong selection");
			PlayerTurn = true;
		}

		if (board[rowIndex][colIndex] != symbol) {
			board[rowIndex][colIndex] = symbol;
			PlayerTurn = false;
		} else if (board[rowIndex][colIndex] == symbol){
			System.out.println("The position already choosen");
			PlayerTurn = true;
		}
		return PlayerTurn;
	}
	public static void main(String[] args) {
		
		// create array for the TicTacToe positions
				String[][] ticTacToeArr = { { "1", "2", "3" }, { "4", "5", "6" }, { "7", "8", "9" } };
				System.out.println("Start the Game!");
				// display the board
				printBoard(ticTacToeArr);

				// players select there symbol
				System.out.print("Player 1 write your Symbol: ");
				Scanner selectSymbol1sc = new Scanner(System.in);
				String player1Symbol = selectSymbol1sc.next();
				System.out.print("Player 2 write your Symbol: ");
				Scanner selectSymbol2sc = new Scanner(System.in);
				String player2Symbol = selectSymbol2sc.next();
				System.out.println();

				// Play the Game
				
				// define the player turn
				boolean PlayerOneTurn;
				boolean PlayerTwoTurn;
				int validTurnsCounter = 0;

				// player turn
				PlayerOneTurn = true;
				PlayerTwoTurn = false;
				boolean isThereAWinner = false;
				boolean isDraw = false;

				// LOOP TO CONTINUE THE GAME
				while (validTurnsCounter < 9 && isThereAWinner == false && isDraw == false) {

					// display the board
					printBoard(ticTacToeArr);

					// player 1 turn
					if (PlayerOneTurn == true && PlayerTwoTurn == false && isThereAWinner == false && isDraw == false) {
						// player 1 select move
						System.out.print("Player 1, Make a move, Enter position: ");
						Scanner player1Movesc = new Scanner(System.in);
						int player1Move = Integer.parseInt(player1Movesc.nextLine());
						// player1Movesc.close();

						// check the selection position of player1 and add value
						if (PlayerOneTurn == true && PlayerTwoTurn == false) {
							PlayerOneTurn = checkMove(player1Move, ticTacToeArr, player1Symbol, PlayerOneTurn);
							if (PlayerOneTurn == false) {
								PlayerTwoTurn = true;
								validTurnsCounter++;
							} else {
								PlayerOneTurn = true;
								PlayerTwoTurn = false;
							}
						}

						// check winner
						if (isThereAWinner == false) {
							isThereAWinner = checkWinner(ticTacToeArr, player1Symbol);
						}

						// check Draw
						if (isThereAWinner == false) {
							isDraw = checkDraw(ticTacToeArr);
						}

						// player 2 turn
						if (PlayerOneTurn == false && PlayerTwoTurn == true && isThereAWinner == false && isDraw == false) {
							System.out.print("Player 2, Make a move, Enter position: ");
							Scanner player2Movesc = new Scanner(System.in);
							int player2Move = Integer.parseInt(player2Movesc.nextLine());
							// player2Movesc.close();

							// check the selection position of player2 and add value
							if (PlayerTwoTurn == true && PlayerOneTurn == false) {
								PlayerTwoTurn = checkMove(player2Move, ticTacToeArr, player2Symbol, PlayerTwoTurn);
								if (PlayerTwoTurn == false) {
									PlayerOneTurn = true;
									validTurnsCounter++;
								} else {
									PlayerTwoTurn = true;
									PlayerOneTurn = false;
								}
							}

							// check winner
							if (isThereAWinner == false) {
								isThereAWinner = checkWinner(ticTacToeArr, player2Symbol);
								checkWinner(ticTacToeArr, player2Symbol);
							}
						}
					}
				} // loop
		}//END of the method
	}
