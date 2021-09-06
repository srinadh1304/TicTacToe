package com.bridgelabz.tictactoe;
import java.util.Scanner;
public class TicTacToeMain {
	
	static char boardArray[]=new char[11];
	static char PLAYER;
	static char COMPUTER;
	
	public static void main(String[] args) {
		System.out.println("Welcome to tic tac toe program");
		board();
		PLAYER=choose();
		COMPUTER=(PLAYER=='X')?'O':'X';
		System.out.println(PLAYER+" "+COMPUTER);
		showBoard();
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
		scannerObject.close();
		return inputChoice;
		
	}
	
	public static void showBoard() {
		for(int index=1;index<boardArray.length;index++)
		{
			System.out.println(boardArray[index]+" ");
		}
	}
}
