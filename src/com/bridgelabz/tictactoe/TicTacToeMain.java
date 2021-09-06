package com.bridgelabz.tictactoe;

public class TicTacToeMain {
	
	static char boardArray[]=new char[10];
	
	public static void main(String[] args) {
		System.out.println("Welcome to tic tac toe program");
		board();
	}
	
	public static void board() {
		
		for(int size=1;size<boardArray.length;size++)
		{
			boardArray[size]=' ';
		}
	}
}
