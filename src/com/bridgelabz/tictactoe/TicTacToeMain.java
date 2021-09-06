package com.bridgelabz.tictactoe;
import java.util.Scanner;
public class TicTacToeMain {

	static char boardArray[]=new char[10];
	static char PLAYER;
	static char COMPUTER;

	public static void main(String[] args) {
		System.out.println("Welcome to tic tac toe program");
		board();
		PLAYER=choose();
		COMPUTER=(PLAYER=='X')?'O':'X';
		System.out.println(PLAYER+" "+COMPUTER);
		showBoard();
		selectLocation();
		showBoard();
	}


	private static void selectLocation() {
		System.out.println("Enter the location in which the character has to be placed");
		Scanner scannerObject=new Scanner(System.in);
		int selectedLocation;
		selectedLocation=scannerObject.nextInt();
		if(boardArray[selectedLocation]!=' ')
		{
			System.out.println("The selected location is already filled. Choose another.");
			selectLocation();
		}
		else
		{
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
		System.out.println("Enter the input");
		inputChoice=scannerObject.next().toUpperCase().charAt(0);

		return inputChoice;

	}

	public static void showBoard() {
		System.out.println("Board:");
		int count=0;
		for(int index=1;index<boardArray.length;index++)
		{
			System.out.print(boardArray[index]+"|");
			count++;
			if(count==3)
			{
				count=0;
				System.out.println();
			}
		}
	}
}
