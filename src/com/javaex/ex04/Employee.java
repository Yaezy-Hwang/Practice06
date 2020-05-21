package com.javaex.ex04;

public class Employee extends User{

	//필드
	private int salary;
	
	//생성자
	public Employee(String id, String password, String name, int salary) {
		super(id, password, name);
		this.salary = salary;
	}
	
	//getter setter
	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getSalary() {
		return salary;
	}
	
	//일반메소드
	public void showInfo() {
		System.out.println("#아이디: "+id+", #패스워드: "+password+", #이름: "+name+", 급여:"+salary);
		System.out.println(name+"의 급여는 "+salary+"원 입니다.");
	}
	

	
}
