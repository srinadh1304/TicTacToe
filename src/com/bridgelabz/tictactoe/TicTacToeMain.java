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
		int whoIsPlaying=playFirst();
		selectLocation();
		showBoard();
		String winOrLost=checkWinner();
		while(winOrLost=="change turn") {
			if(whoIsPlaying==1) {
				int winPositionAvailability=checkForWinningPositionAvailability(COMPUTER);
				if(winPositionAvailability!=0)
				{
					boardArray[winPositionAvailability]=COMPUTER;
				}
				else
				{
					int availabilty=checkIfOpponentWinningPositionAvailable(PLAYER);
					if(availabilty!=0)
					{
						boardArray[availabilty]=COMPUTER;
					}
					else
					{
						int cornerAvailabilty=checkForAvailableCorners();
						if(cornerAvailabilty!=0)
						{
							boardArray[cornerAvailabilty]=COMPUTER;
						}
					}
					
				}
				whoIsPlaying=0;
			}
			else if(whoIsPlaying==0)
			{
				int winPositionAvailability=checkForWinningPositionAvailability(PLAYER);
				if(winPositionAvailability!=0)
				{
					boardArray[winPositionAvailability]=PLAYER;
				}
				else
				{
					int availabilty=checkIfOpponentWinningPositionAvailable(COMPUTER);
					if(availabilty!=0)
					{
						boardArray[availabilty]=PLAYER;
					}
					else
					{
						int cornerAvailabilty=checkForAvailableCorners();
						if(cornerAvailabilty!=0)
						{
							boardArray[cornerAvailabilty]=COMPUTER;
						}
					}
					
				}
				whoIsPlaying=1;
			}
			winOrLost=checkWinner();
			showBoard();
		}
	}

	private static int checkForAvailableCorners() {
		if(boardArray[1]==' ')
			return 1;
		else if(boardArray[3]==' ')
			return 3;
		else if(boardArray[7]==' ')
			return 7;
		else if(boardArray[9]==' ')
			return 9;
		else
			return 0;
	}

	private static int checkIfOpponentWinningPositionAvailable(char opponent) {
		int availability=checkForWinningPositionAvailability(opponent);
		return availability;
		
	}

	private static int checkForWinningPositionAvailability(char whoIsPlaying) {
		if (boardArray[1] == whoIsPlaying && boardArray[2] == whoIsPlaying && boardArray[3] == ' ') {
			return 3;
		}
		if (boardArray[1] == whoIsPlaying && boardArray[3] == whoIsPlaying && boardArray[2] == ' ') {
			return 2;
		}
		if (boardArray[3] == whoIsPlaying && boardArray[2] == whoIsPlaying && boardArray[1] == ' ') {
			return 1;
		}
		if (boardArray[4] == whoIsPlaying && boardArray[5] == whoIsPlaying && boardArray[6] == ' ') {
			return 6;
		}
		if (boardArray[4] == whoIsPlaying && boardArray[6] == whoIsPlaying && boardArray[5] == ' ') {
			return 5;
		}
		if (boardArray[6] == whoIsPlaying && boardArray[5] == whoIsPlaying && boardArray[4] == ' ') {
			return 4;
		}
		if (boardArray[7] == whoIsPlaying && boardArray[8] == whoIsPlaying && boardArray[9] == ' ') {
			return 9;
		}
		if (boardArray[7] == whoIsPlaying && boardArray[9] == whoIsPlaying && boardArray[8] == ' ') {
			return 8;
		}
		if (boardArray[9] == whoIsPlaying && boardArray[8] == whoIsPlaying && boardArray[7] == ' ') {
			return 7;
		}
		if (boardArray[1] == whoIsPlaying && boardArray[4] == whoIsPlaying && boardArray[7] == ' ') {
			return 7;
		}
		if (boardArray[1] == whoIsPlaying && boardArray[7] == whoIsPlaying && boardArray[4] == ' ') {
			return 4;
		}
		if (boardArray[7] == whoIsPlaying && boardArray[4] == whoIsPlaying && boardArray[1] == ' ') {
			return 1;
		}
		if (boardArray[2] == whoIsPlaying && boardArray[5] == whoIsPlaying && boardArray[8] == ' ') {
			return 8;
		}
		if (boardArray[2] == whoIsPlaying && boardArray[8] == whoIsPlaying && boardArray[5] == ' ') {
			return 5;
		}
		if (boardArray[8] == whoIsPlaying && boardArray[5] == whoIsPlaying && boardArray[2] == ' ') {
			return 2;
		}
		if (boardArray[3] == whoIsPlaying && boardArray[6] == whoIsPlaying && boardArray[9] == ' ') {
			return 9;
		}
		if (boardArray[3] == whoIsPlaying && boardArray[9] == whoIsPlaying && boardArray[6] == ' ') {
			return 6;
		}
		if (boardArray[9] == whoIsPlaying && boardArray[6] == whoIsPlaying && boardArray[3] == ' ') {
			return 3;
		}
		if (boardArray[1] == whoIsPlaying && boardArray[5] == whoIsPlaying && boardArray[9] == ' ') {
			return 9;
		}
		if (boardArray[1] == whoIsPlaying && boardArray[9] == whoIsPlaying && boardArray[5] == ' ') {
			return 5;
		}
		if (boardArray[9] == whoIsPlaying && boardArray[5] == whoIsPlaying && boardArray[1] == ' ') {
			return 2;
		}
		if (boardArray[3] == whoIsPlaying && boardArray[5] == whoIsPlaying && boardArray[7] == ' ') {
			return 7;
		}
		if (boardArray[3] == whoIsPlaying && boardArray[7] == whoIsPlaying && boardArray[5] == ' ') {
			return 5;
		}
		if (boardArray[7] == whoIsPlaying && boardArray[5] == whoIsPlaying && boardArray[3] == ' ') {
			return 3;
		} else
			return 0;

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

	private static int playFirst() {
		double playFirst=Math.random();
		if(playFirst<0.5){
			System.out.println("Player plays first");
			return 0;
		}
		else {
			System.out.println("Computer plays first");
			return 1;
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
