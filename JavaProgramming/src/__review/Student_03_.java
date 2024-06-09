package __review;

public class Student_03_ {
//  1. 학생의 이름, 학번, 학과를 속성으로 가지고 
//	학생의 정보를 저장하는 메소드와 
//	학생의 정보를 출력하는 메소드를 갖는 학생 클래스를 생성하세요.

	private String name;
	private String major;
	private int no;
	
	public void saveStudentInfo(int sno, String major, String sname) {
		this.no = sno;
		this.name = sname;
		this.major = major;
	}
	
	public void printStudentInfo() {
		System.out.println("학번: " + this.no);
		System.out.println("학생 이름 " + this.name);
		System.out.println("학과: " + this.major);
	}

}
