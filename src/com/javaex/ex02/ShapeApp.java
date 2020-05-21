package com.javaex.ex02;

public class ShapeApp {

	public static void main(String[] args) {
		
		Shape s1 = new Shape("파랑", "파랑");
		System.out.println("================");
		
		Triangle t1 = new Triangle();
		System.out.println("================");
		
		Triangle t2 = new Triangle(3, 4);
		System.out.println("================");
		
		Shape t3 = new Triangle("빨강", "빨강", 15, 15);
		System.out.println("================");
		
		/*
		 1. 인스턴스를 부모 클래스로 정의할 경우
		 	: 부모 클래스의 생성자만 실행
		 	
		 2. 자식 클래스 ()로 정의할 경우
		 	: 부모클래스의 기본 생성자 실행 후
		 	  자식클래스의 기본 생성자 실행
		 	  
		 3. 자식 클래스로 정의, 자식클래스 생성자 사용할 경우
		 	: 부모클래스의 생성자 실행 후
		 	  자식클래스의 생성자 실행
		 	  
		 4. 부모클래스로 정의, 상속받은 자식클래스 생성자 사용할 경우
		 	: 부모클래스 상속하는 생성자 실행 후
		 	  자식클래스의 상속받은 생성자 실행
		 */
		
	}

}

