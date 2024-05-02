package chap09_Inherit;

import chap09_Inherit.board.Board;
import chap09_Inherit.board.FreeBoard;
import chap09_Inherit.board.NoticeBoard;

public class _03_Board {
	
	
	public static void main(String[] args) {
		Board board = new FreeBoard
				(1, "안녕하세요", "자바어려워요", "최수민", "2024-05-02", "첨부파일1");
		
		board.post();
		
		board = new NoticeBoard
				(1, "안녕하세요", "공지사항", "관리자", "2024-05-02", false);
		board.post();
	
	
		
	}
	
	    
		
		
	
	

}
