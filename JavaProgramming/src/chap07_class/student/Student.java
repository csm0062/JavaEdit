// chap07_class 패키지안에 student 패키지 만들고 Student 클래스를 생성하세요.
// 필드로는 String name, int age, String major를 갖게 하고 
// 생성자는 기본생성자 name만 초기화하는 생성자,
// name과 age를 초기화하는 생성자,
// name, age, major 모두 초기화하는 생성자를 만드세요. 
// 메소드는 학생정보를 출력하는 메소드를 생성하세요.

package chap07_class.student;


public class Student {
	
	//필드값 지정해주기.
	public String name;
	public int age;
	public String major;
	
	//기본생성자
	public Student()
	{
		
	}
	
	//매개변수가 있는 생성자 name만 초기화 하는 생성자
	public Student(String name)
	{
		this.name = name;
	}
	
	//매개변수가 있는 생성자 name,age만 초기화 하는 생성자
	public Student(String name, int age)
	{
		this.name =name;
		this.age = age;
	}
	
	//매개변수가 있는 생성자 name,age,major 모두 초기화 하는 생성자
	public Student(String name, int age, String major)
	{
		this.name =name;
		this.age = age;
		this.major = major;
	}
	
	//학생정보를 출력하는 메소드
	public void printStdInfo()
	{
		// 생성자에서 this 객체가 생성된 객체를 의미한다면.
		// 인스턴스 메소드에서 this 객체는 해당 메소드를 소유하고 있는 객체를 의미한다.
		
		System.out.println("이름: " + this.name);
		System.out.println("나이: " + this.age);
		System.out.println("학년: " + this.major);
	}

}
