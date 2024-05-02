package chap11_abstraction.board;

public class FreeBoard extends Board {
	String attachFile;

	public FreeBoard(long id, String title, String content, String writer, String creDate, String attachFile) {
		super(id, title, content, writer, creDate);
		this.attachFile = attachFile;
	}
	
	

	public FreeBoard() {
		// TODO Auto-generated constructor stub
	}



	@Override
	public void post()
	{
		System.out.println("자유게시판에 게시글을 작성합니다.");
		System.out.println(this.attachFile + "파일을 업로드합니다.");
	}

	@Override
	public void modify() {
		// TODO Auto-generated method stub
		System.out.println("자유게시판에 게시글을 수정합니다.");
		System.out.println(this.attachFile + "파일을 수정합니다.");
		
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("자유게시판에 게시글을 삭제합니다.");
		System.out.println(this.attachFile + "파일을 삭제합니다.");
	}
	

}
