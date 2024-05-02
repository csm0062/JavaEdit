package test;

import chap11_abstraction.board.Board;
import chap11_abstraction.board.FreeBoard;
import chap11_abstraction.board.NoticeBoard;

public class _02_Board_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Board board = new FreeBoard();
		
		board.post();
		board.modify();
		board.delete();
		
		board = new NoticeBoard();
		
		board.post();
		board.modify();
		board.delete();
		
		
		
		

	}

}
