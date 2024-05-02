package chap09_Inherit;

import chap09_Inherit.animal.Animal;
import chap09_Inherit.animal.Bird;
import chap09_Inherit.animal.Tiger;

public class _02_Override {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Animal animal = new Bird();
		
		// Bird 클래스의 eat, sleep이 실행
		animal.eat();
		animal.sleep();
		
		animal = new Tiger();
		
		// Tiger 클래스의 eat,sleep이 실행
		animal.eat();
		animal.sleep();
		
		

	}

}
