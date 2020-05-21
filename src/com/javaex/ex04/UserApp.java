package com.javaex.ex04;

public class UserApp {

	public static void main(String[] args) {
		
		User[] userArray = new User[3];
		
		User a1 = new Customer("jws", "j1234", "정우성", 1000);
		User a2 = new Customer("yjs", "y2345", "유재석", 2000);
		User a3 = new Employee("master", "m7788", "운영자", 5000000);
		
		userArray[0] = a1;
		userArray[1] = a2;
		userArray[2] = a3;
		
		for(int i = 0; i<userArray.length; i++) {
			userArray[i].showInfo();
		}
		
	}

}
