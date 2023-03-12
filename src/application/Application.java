package application;

import boardGame.Board;
import boardGame.Position;
import chess.ChessMatch;

public class Application {

	public static void main(String[] args) {
		
		/*
		 * 
		 * 
		 * 
		 * */
		
		Position pos = new Position(2,3);
		
		System.out.println(pos.toString());
		
		Board board = new Board(8,8);
		System.out.println(board.getPieces());
		
		System.out.println();
		
		ChessMatch chessMatch = new ChessMatch();
		UI.printBoard(chessMatch.getPieces());

	}
	
	
	

}
