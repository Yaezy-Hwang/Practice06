package com.javaex.ex01;

public class Person{
	
	//필드
	protected String name;
	protected String hp;
	
	//생성자
	public Person() {}
	
	public Person(String name, String hp) {
		this.name = name;
		this.hp = hp;
	}
	
	//getter setter
	public void setName(String name) {
		this.name = name;
	}
	
	public void setHp(String hp) {
		this.hp = hp;
	}
	
	public String getName() {
		return name;
	}
	
	public String getHp() {
		return hp;
	}
	
	//일반 메소드
	public void showInfo() {
		System.out.println("이름: "+name+", #핸드폰: "+hp);
	}
	
}
