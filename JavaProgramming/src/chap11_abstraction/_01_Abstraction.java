package chap11_abstraction;

import chap11_abstraction.academy.Academy;
import chap11_abstraction.academy.ComAcademy;
import chap11_abstraction.academy.EngAcademy;

public class _01_Abstraction{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 추상클래스의 추상메소드는 완전한 형태의 메소드가 아니기 때문에
		// 추상클래스는 인스턴스화가 불가능하다.
//		Academy academy = new Academy();
		
		// 추상클래스는 자식클래스의 객체로 사용해야 한다.
		// 타입으로 사용할 수 있지만 객체화가 안될 뿐.
		Academy academy = new ComAcademy();
		
		academy.teach();
		academy.solveHomework();
		academy.rest();
		academy.attend();
		
		academy = new EngAcademy();
		
		academy.teach();
		academy.solveHomework();
		academy.rest();
		academy.attend();
			
			
	}
	

}
