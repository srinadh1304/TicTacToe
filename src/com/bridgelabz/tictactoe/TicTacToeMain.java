package com.bridgelabz.tictactoe;

public class TicTacToeMain {

	public static void main(String[] args) {
		System.out.println("Welcome to tic tac toe program");
	}
	public void Board() {
		char boardArray[]=new char[11];
		for(int size=1;size<boardArray.length;size++)
		{
			boardArray[size]='\0';
		}
	}
}
