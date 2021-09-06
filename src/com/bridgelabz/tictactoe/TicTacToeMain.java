package com.bridgelabz.tictactoe;
import java.util.Scanner;
public class TicTacToeMain {

	static char boardArray[]=new char[10];
	static final char PLAYER=choose();
	static final char COMPUTER=(PLAYER=='X')?'O':'X';

	public static void main(String[] args) {
		System.out.println("Welcome to tic tac toe program");
		board();
		showBoard();
		playFirst();
		selectLocation();
		showBoard();
		String winOrLost=checkWinner();
		while(winOrLost=="change turn"){
			winOrLost=checkWinner();
		}
	}
	static String checkWinner()
	{
		for (int index = 1; index < 9; index++) {
			String line = null;

			switch (index) {
			case 1:
				line = Character.toString(boardArray[1]) + Character.toString(boardArray[2]) + Character.toString(boardArray[3]);
				break;
			case 2:
				line = Character.toString(boardArray[4]) + Character.toString(boardArray[5]) + Character.toString(boardArray[6]);
				break;
			case 3:
				line = Character.toString(boardArray[7]) + Character.toString(boardArray[8]) + Character.toString(boardArray[9]);
				break;
			case 4:
				line = Character.toString(boardArray[1]) + Character.toString(boardArray[4]) + Character.toString(boardArray[7]);
				break;
			case 5:
				line = Character.toString(boardArray[2]) + Character.toString(boardArray[5]) + Character.toString(boardArray[8]);
				break;
			case 6:
				line = Character.toString(boardArray[3]) + Character.toString(boardArray[6]) + Character.toString(boardArray[9]);
				break;
			case 7:
				line = Character.toString(boardArray[1]) + Character.toString(boardArray[5]) + Character.toString(boardArray[9]);
				break;
			case 8:
				line = Character.toString(boardArray[3]) + Character.toString(boardArray[5]) + Character.toString(boardArray[7]);
				break;
			}
			if (line.equals("XXX")) {
				return "X";
			}

			// For O winner
			else if (line.equals("OOO")) {
				return "O";
			}
		}

		for (int a = 1; a < 10; a++) {
			if (boardArray[a]==' ') {
				return "change turn";
			}
		}
		return "draw";
	}

	private static void playFirst() {
		double playFirst=Math.random();
		if(playFirst<0.5){
			System.out.println("Player plays first");
		}
		else {
			System.out.println("Computer plays first");
		}

	}


	private static void selectLocation() {
		System.out.println("Enter the location in which the character has to be placed");
		Scanner scannerObject=new Scanner(System.in);
		int selectedLocation;
		selectedLocation=scannerObject.nextInt();
		if(boardArray[selectedLocation]!=' '){
			System.out.println("The selected location is already filled. Choose another.");
			selectLocation();
		}
		else{
			boardArray[selectedLocation]=PLAYER;
		}
	}

	public static void board() {

		for(int size=1;size<boardArray.length;size++) {

			boardArray[size]=' ';
		}
	}

	public static char choose() {

		char inputChoice=' ';
		Scanner scannerObject=new Scanner(System.in);
		System.out.println("Enter your letter");
		inputChoice=scannerObject.next().toUpperCase().charAt(0);

		return inputChoice;

	}

	public static void showBoard() {
		System.out.println("Board:");
		int count=0;
		for(int index=1;index<boardArray.length;index++){
			System.out.print(boardArray[index]+"|");
			count++;
			if(count==3){
				count=0;
				System.out.println();
			}
		}
	}
}
