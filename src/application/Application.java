package application;

import boardGame.Board;
import boardGame.Position;

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

	}

}
