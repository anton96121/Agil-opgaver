package Homeworks;

class Piece {

	// ...

	/**
	 * This method does not have to check the validity of the position
	 */
	public void setArbitraryPosition(Position currentPosition) {
	}
	public void setArbitraryPosition(char c, int i) {
		// ...
	}

	/**
	 * This method checks if the position is a valid position
	 */
	public boolean isValidPosition(Position newPosition) {
		return true;
	}
	
	/**
	 * This method moves the piece
	 * @return true if the piece has been moved correctly, false otherwise
	 */
	public boolean move(Position newPosition) {
		return true;
	}
}

class King extends Piece {
	Player player;
	char hori;
	int verti;
	public King(Player p){
		this.player = p;
		
		}
	public void setArbitraryPosition(Position currentPosition) {
		this.hori = currentPosition.hori;
		this.verti = currentPosition.verti;
		
		}
	public boolean isValidPosition(Position newPosition) {
		return (newPosition.hori == hori);
		}
	}
class Rook extends Piece {
	Player player;
	char hori;
	int verti;
	public Rook(Player p){
		this.player = p;
		
		}
	public void setArbitraryPosition(char c, int i) {
		this.hori = c;
		this.verti = i;
		
		}
	public boolean isValidPosition(Position newPosition) {
		return (newPosition.verti == verti);
		}
	}
class Bishop extends Piece {
	Player player;
	char hori;
	int verti;
	public Bishop(Player p){
		this.player = p;
		
		}
	public void setArbitraryPosition(Position currentPosition) {
		this.hori = currentPosition.hori;
		this.verti = currentPosition.verti;
		
		}
	public boolean isValidPosition(Position newPosition) {
		return (newPosition.verti == verti+3);
		}
	}
class Knight extends Piece {
	Player player;
	char hori;
	int verti;
	public Knight(Player p){
		this.player = p;
		
		}
	public void setArbitraryPosition(char c, int i) {
		this.hori = c;
		this.verti = i;
		
		}
	public boolean isValidPosition(Position newPosition) {
		return ((newPosition.verti == verti+2 && Character.getNumericValue(newPosition.hori) == Character.getNumericValue(hori)+1)) || ((newPosition.verti == verti-2 && Character.getNumericValue(newPosition.hori) == Character.getNumericValue(hori)-1));
		}
	}

class Pawn extends Piece {
	Player player;
	char hori;
	int verti;
	public Pawn(Player p){
		this.player = p;
		
		}

		public void setArbitraryPosition(char c, int i) {
			this.hori = c;
			this.verti = i;
			
			}
		public boolean isValidPosition(Position newPosition) {
			return ((newPosition.hori == hori && (((player.name == "Black player") && newPosition.verti==verti-1) || ((player.name == "White player") && (newPosition.verti==verti+1 || newPosition.verti==verti+2)))));
			}
	}

class Position {
	char hori;
	int verti;
	Position(char s, int i){
		this.hori = s;
		this.verti = i;
	}
}
	


class Player {
	boolean whiteColor;
	String name;
	
	public Player(String a) {
		this.name = a;
	}
	public void setColorWhite(boolean k) {
		this.whiteColor = k;
	}
	
}


public class Chess {
	
	public static void main(String[] args) {
		Player p1 = new Player("White player");
		p1.setColorWhite(true);
		Player p2 = new Player("Black player");
		p2.setColorWhite(false);
		
		System.out.println("Testing kings:");
		Piece whiteKing = new King(p1);
		whiteKing.setArbitraryPosition(new Position('f', 5));
		test(whiteKing, 'a', 1, false);
		test(whiteKing, 'f', 4, true);
		
		System.out.println("Testing rooks:");
		Rook blackRook = new Rook(p2);
		blackRook.setArbitraryPosition('d', 5);
		test(blackRook, 'h', 5, true);
		test(blackRook, 'h', 1, false);
		test(blackRook, 'd', 9, false);
		
		System.out.println("Testing bishops:");
		Piece whiteBishop = new Bishop(p1);
		whiteBishop.setArbitraryPosition(new Position('d', 5));
		test(whiteBishop, 'b', 2, false);
		test(whiteBishop, 'a', 8, true);
		
		System.out.println("Testing knigts:");
		Knight blackKnight = new Knight(p2);
		blackKnight.setArbitraryPosition('d', 4);
		test(blackKnight, 'e', 6, true);
		test(blackKnight, 'f', 6, false);
		test(blackKnight, 'c', 2, true);
		test(blackKnight, 'i', 8, false);
		
		System.out.println("Testing pawns:");
		Pawn whitePawn = new Pawn(p1);
		Pawn blackPawn = new Pawn(p2);
		blackPawn.setArbitraryPosition('b', 4);
		test(blackPawn, 'b', 3, true);
		test(blackPawn, 'b', 5, false);
		whitePawn.setArbitraryPosition('f', 2);
		test(whitePawn, 'f', 3, true);
		test(whitePawn, 'f', 4, true);
		blackPawn.setArbitraryPosition('g', 5);
		test(blackPawn, 'g', 4, true);
		test(blackPawn, 'g', 3, false);
		whitePawn.setArbitraryPosition('e', 7);
		test(whitePawn, 'd', 8, false);
		test(whitePawn, 'f', 8, false);
	}
	
	public static void test(Piece p, char x, int y, boolean valid) {
		if (p.isValidPosition(new Position(x, y)) == valid) {
			System.out.println("  > Test passed!");
		} else {
			System.out.println("  X Test NOT passed!");
		}
	}
}
