
/**
 * 
 */

/**
 * @author LAP-9
 *
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.invoke.WrongMethodTypeException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

public class TicTacToeGame {
	public static final String FILE_PATH = "data/TicTacToe.json";

	/**
	 * This method used to display the board of the game
	 * @param board
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
	/**
	 * This method used to check the winner of the game 
	 * @param board
	 * @param symbol
	 * @return playerWon
	 **/
	private static boolean checkWinner(String[][] board, String symbol) {
		boolean playerWon = false;
		if (board[0][0].equals(symbol) && board[0][1].equals(symbol) && board[0][2].equals(symbol)
				|| board[1][0].equals(symbol) && board[1][1].equals(symbol) && board[1][2].equals(symbol)
				|| board[2][0].equals(symbol) && board[2][1].equals(symbol) && board[2][2].equals(symbol)
				|| board[0][0].equals(symbol) && board[1][1].equals(symbol) && board[2][2].equals(symbol)
				|| board[0][2].equals(symbol) && board[1][1].equals(symbol) && board[2][0].equals(symbol)
				|| board[0][0].equals(symbol) && board[1][0].equals(symbol) && board[2][0].equals(symbol)
				|| board[0][1].equals(symbol) && board[1][1].equals(symbol) && board[2][1].equals(symbol)
				|| board[0][2].equals(symbol) && board[1][2].equals(symbol) && board[2][2].equals(symbol)) {

			// display the board
			printBoard(board);

			// display win message
			System.out.println(symbol + ", You win !");
			playerWon = true;
			clearFile();
		}
		return playerWon;
	}
	/**
	 * This method used to check if the game reach draw
	 * @param board
	 * @return Draw
	 **/
	private static boolean checkDraw(String[][] board) {
		boolean Draw = false;
		if (!board[0][0].equals("1") && !board[0][1].equals("2") && !board[0][2].equals("3") && !board[1][0].equals("4")
				&& !board[1][1].equals("5") && !board[1][2].equals("6") && !board[2][0].equals("7")
				&& !board[2][1].equals("8") && !board[2][2].equals("9")) {

			// display the board
			printBoard(board);

			// display draw message
			System.out.println("Draw, No winner !");
			Draw = true;

			// clear the file
			clearFile();
		}
		return Draw;

	}
	/**
	 * This method used to check the moves of the players if the selected position is already choosen or not
	 * @param playerMove
	 * @param board
	 * @param symbol
	 * @param PlayerTurn
	 * @return PlayerTurn
	 **/
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
		} else {
			System.out.println("Wrong selection");
			PlayerTurn = true;
		}

		if (!board[rowIndex][colIndex].equals(symbol)) {
			board[rowIndex][colIndex] = symbol;
			PlayerTurn = false;
		} else {
			System.out.println("The position already choosen");
			PlayerTurn = true;
		}
		return PlayerTurn;
	}
	/**
	 * This method used to start playing or continuing the game
	 * @param validTurnsCounter
	 * @param isThereAWinner
	 * @param isDraw
	 * @param player1Symbol
	 * @param player2Symbol
	 * @param PlayerOneTurn
	 * @param PlayerTwoTurn
	 * @param ticTacToeArr
	 * 
	 **/
	public static void startGame(int validTurnsCounter, boolean isThereAWinner, boolean isDraw, String player1Symbol,
			String player2Symbol, boolean PlayerOneTurn, boolean PlayerTwoTurn, String[][] ticTacToeArr) {
		// LOOP TO CONTINUE THE GAME
		while (validTurnsCounter < 9 && isThereAWinner == false && isDraw == false) {
			// display the board
			printBoard(ticTacToeArr);
			System.out.print("Press 0 if you want to exit and 1 to continue: ");
			Scanner playerChoiceSc = new Scanner(System.in);
			int playerchoice = Integer.parseInt(playerChoiceSc.nextLine());
			// exit the game
			if (playerchoice == 0) {
				// add Symbols
				String[][] playersSymbolStrings = { { "player1Symbol", player1Symbol },
						{ "player2Symbol", player2Symbol } };
				writeInFileArray("playersSymbol", playersSymbolStrings);
				// add playersturn
				String[][] playersturnStrings = { { "PlayerOneTurn", String.valueOf(PlayerOneTurn) },
						{ "PlayerTwoTurn", String.valueOf(PlayerTwoTurn) } };
				writeInFileArray("playersturn", playersturnStrings);
				// add validTurnsCounter
				String[][] counterStrings = { { "validTurnsCounter", Integer.toString(validTurnsCounter) } };
				writeInFileArray("validTurnsCounter", counterStrings);
				// add the ticTacToeArr
				writeInFileArray("ticTacToeArr", ticTacToeArr);

				System.out.println("Exit");
				break;
			} else if (playerchoice == 1) {
				// player 1 turn
				if (PlayerOneTurn == true && PlayerTwoTurn == false && isThereAWinner == false && isDraw == false) {
					// player 1 select move

					System.out.println();
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
						System.out.println();
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

			} else {
				System.out.println("Wrong selection!");
			}

		} // loop
	}
	// add array values
		public static void writeInFileArray(String name, String[][] array) {
			HashMap<String, String[][]> store = new HashMap<String, String[][]>();
			store.put(name, array);
			try (FileWriter filrWriter = new FileWriter(FILE_PATH, true)) {
				Gson gson = new GsonBuilder().create();
				gson.toJson(store, filrWriter);
				filrWriter.write("\n");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		// clear the file
		public static void clearFile() {
			try (FileWriter filrWriter = new FileWriter(FILE_PATH)) {
				Gson gson = new GsonBuilder().create();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	public static void main(String[] args) {

		// create array for the TicTacToe positions
		String[][] ticTacToeArr = { { "1", "2", "3" }, { "4", "5", "6" }, { "7", "8", "9" } };
		System.out.println("Start the Game!");

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

		System.out.println("Do you want to: ");
		System.out.println("1-Continue the previous game");
		System.out.println("2-Start new game");
		System.out.print("Here: ");
		Scanner chooseSc = new Scanner(System.in);
		int choose = chooseSc.nextInt();
		System.out.println();

		// 1 means continue the previous game
		if (choose == 1) {
			// Read json file
			File dataFile = new File(FILE_PATH);
			// create hashmaps to store the values
			HashMap<String, String[][]> storeValues = new HashMap<String, String[][]>();

			String player1Symbol = "";
			String player2Symbol = "";
			try {
				Scanner scanFile = new Scanner(dataFile);
				while (scanFile.hasNextLine()) {
					// System.out.println(scanFile.nextLine());
					// read from json file, convert json to hash map
					Gson gson = new GsonBuilder().create();
					Type type = new TypeToken<Map<String, String[][]>>() {
					}.getType();
					Map<String, String[][]> myMap = gson.fromJson(scanFile.nextLine(), type);

					for (String iString : myMap.keySet()) {
						storeValues.put(iString, myMap.get(iString));
					}
				}

				// Add the values inside the variables
				player1Symbol = storeValues.get("playersSymbol")[0][1];
				player2Symbol = storeValues.get("playersSymbol")[1][1];
				PlayerOneTurn = Boolean.parseBoolean(storeValues.get("playersturn")[0][1]);
				PlayerTwoTurn = Boolean.parseBoolean(storeValues.get("playersturn")[1][1]);
				validTurnsCounter = Integer.valueOf(storeValues.get("validTurnsCounter")[0][1]);
				ticTacToeArr = storeValues.get("ticTacToeArr");

				scanFile.close();

			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// continue the game
			startGame(validTurnsCounter, isThereAWinner, isDraw, player1Symbol, player2Symbol, PlayerOneTurn,
					PlayerTwoTurn, ticTacToeArr);
			// 2 means start new game
		} else if (choose == 2) {
			// clear the file
			clearFile();
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
			// new game
			startGame(validTurnsCounter, isThereAWinner, isDraw, player1Symbol, player2Symbol, PlayerOneTurn,
					PlayerTwoTurn, ticTacToeArr);
		} else {
			System.out.println("Wrong Selection!!");
		}

	}// END of the method

	

}
