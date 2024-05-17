package _240517_homework;

public class Student {
	private int sno;
	private String sName;
	private int score;
	private String grade;
	
	public Student() {
		
	}
	
	// 오버로딩된 메소드
	public Student(int sno, String sName, int score) {
		this.sno = sno;
		this.sName = sName;
		this.score = score;
	}
	

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	public void stuInfo() {
		
		System.out.println("학번: " + sno);
		System.out.println("이름 " + sName);
		System.out.println("점수: " + score);
		System.out.println("학점: " + grade);
	}
	
}
	
	


