package test;

import java.util.Scanner;

public class Exercise20 {
	
	// Printing the board
	private static void print42(int [][] b) {
		System.out.println("    0 1 2 3 4 5 6 7 <- X axis");
		System.out.println("  +----------------+");
		for (int i = 0; i<=7;i++) {
			System.out.print(i+" | ");
			for (int j = 0; j<=7;j++) {
				System.out.print(in(b[i][j]));
			}
			System.out.print("\n");
		}
	}
	private static String in(int arg) {
		if (arg==1) {
			return "1 ";
		}
		else if (arg==2) {
			return "2 ";
		}
		else {
			return "  ";
		}
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// initilizing the board
		int[][] board = {{0,1,0,1,0,1,0,1},
						 {1,0,1,0,1,0,1,0},
						 {0,1,0,1,0,1,0,1},
						 {0,0,0,0,0,0,0,0},
						 {0,0,0,0,0,0,0,0},
						 {2,0,2,0,2,0,2,0},
						 {0,2,0,2,0,2,0,2},
						 {2,0,2,0,2,0,2,0}};
		print42(board);

		
		//setting the number of moves in the total game
		
		for (int d=0; d<3; d++) {
		int breakvar1 = 0;
		
		while(breakvar1 == 0) {
		Scanner s = new Scanner(System.in);
		System.out.println("Player 1, which brick do you want to move"
				+ "(write it as (y,x):");
		String posfromstring = s.nextLine();
		int[] frompos = {(int) posfromstring.charAt(1)-48,(int) posfromstring.charAt(3)-48};

		
		
		
		if ((frompos[1]<=7 && frompos[1]>=0)&& (frompos[0]<=7 && frompos[0]>=0) && board[frompos[0]][frompos[1]]==1) {
			innerloop1: while(true) {
			Scanner t = new Scanner(System.in);
			System.out.println("Player 1, where do you want to move"
					+ "(write it as (y,x):");
			String postostring = t.nextLine();
			int[] topos = {(int) postostring.charAt(1)-48,(int) postostring.charAt(3)-48};

			if ( (topos[1]<=7 && topos[1]>=0)&& (topos[0]<=7 && topos[0]>=0)&&(board[topos[0]][topos[1]]==0) && (topos[0]==(frompos[0]+1)) && ((topos[1]==(frompos[1]+1))||(topos[1]==(frompos[1]-1)))) {
				board[frompos[0]][frompos[1]] =0;
				board[topos[0]][topos[1]] =1;
				breakvar1 = 1;
				break innerloop1;
				}
			if ((topos[1]<=7 && topos[1]>=0)&& (topos[0]<=7 && topos[0]>=0)&&(board[topos[0]][topos[1]]==0) && (topos[0]==(frompos[0]+2)) && ((topos[1]==(frompos[1]+2))&&(board[topos[0]+1][topos[1]+1] ==2))) {
				board[frompos[0]][frompos[1]] =0;
				board[topos[0]][topos[1]] =1;
				board[topos[0]+1][topos[1]+1] =0;
				breakvar1 = 1;
				break innerloop1;
				}
			if ((topos[1]<=7 && topos[1]>=0)&& (topos[0]<=7 && topos[0]>=0)&&(board[topos[0]][topos[1]]==0) && (topos[0]==(frompos[0]+2)) && ((topos[1]==(frompos[1]-2))&&(board[topos[0]+1][topos[1]-1] ==2))) {
				board[frompos[0]][frompos[1]] =0;
				board[topos[0]][topos[1]] =1;
				board[topos[0]+1][topos[1]-1] =0;
				breakvar1 = 1;
				break innerloop1;
				}
			else {
				// break
				System.out.println("Wrong. Try again");
			}}
			}
		else  {
			System.out.println("Wrong. Try again");
		}}
			
			
		
		
		print42(board);
		
		
		int breakvar2 = 0;
		
		while(breakvar2 == 0) {
		Scanner s2 = new Scanner(System.in);
		System.out.println("Player 2, which brick do you want to move"
				+ "(write it as (y,x):");
		String posfromstring2 = s2.nextLine();
		int[] frompos2 = {(int) posfromstring2.charAt(1)-48,(int) posfromstring2.charAt(3)-48};

		
		
		if ( (frompos2[1]<=7 && frompos2[1]>=0)&& (frompos2[0]<=7 && frompos2[0]>=0)&&board[frompos2[0]][frompos2[1]]==2 ) {
			innerloop2: while(true) {
			Scanner t2 = new Scanner(System.in);
			System.out.println("Player 2, where do you want to move"
					+ "(write it as (y,x):");
			String postostring2 = t2.nextLine();
			int[] topos2 = {(int) postostring2.charAt(1)-48,(int) postostring2.charAt(3)-48};

			if ( (topos2[1]<=7 && topos2[1]>=0)&& (topos2[0]<=7 && topos2[0]>=0)&&(board[topos2[0]][topos2[1]]==0) && (topos2[0]==(frompos2[0]-1)) && ((topos2[1]==(frompos2[1]+1))||(topos2[1]==(frompos2[1]-1))) ) {
				board[frompos2[0]][frompos2[1]] =0;
				board[topos2[0]][topos2[1]] =2;
				breakvar2 = 1;
				break innerloop2;
				}
			if ((topos2[1]<=7 && topos2[1]>=0)&& (topos2[0]<=7 && topos2[0]>=0)&&(board[topos2[0]][topos2[1]]==0) && (topos2[0]==(frompos2[0]-2)) && ((topos2[1]==(frompos2[1]-2))&&(board[topos2[0]-1][topos2[1]-1] ==1))) {
				board[frompos2[0]][frompos2[1]] =0;
				board[topos2[0]][topos2[1]] =2;
				board[topos2[0]+1][topos2[1]+1] =0;
				breakvar2 = 1;
				break innerloop2;
				}
			if ((topos2[1]<=7 && topos2[1]>=0)&& (topos2[0]<=7 && topos2[0]>=0)&&(board[topos2[0]][topos2[1]]==0) && (topos2[0]==(frompos2[0]-2)) && ((topos2[1]==(frompos2[1]+2))&&(board[topos2[0]-1][topos2[1]+1] ==1))) {
				board[frompos2[0]][frompos2[1]] =0;
				board[topos2[0]][topos2[1]] =2;
				board[topos2[0]+1][topos2[1]-1] =0;
				breakvar2 = 1;
				break innerloop2;
				}
			
			else {
				System.out.println("Wrong. Try again");
				}}
			}
		else {
			System.out.println("Wrong. Try again");
		}}
		
		print42(board);}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}}

