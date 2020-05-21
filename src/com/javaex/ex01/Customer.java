package com.javaex.ex01;

public class Customer extends Person{
	
	//필드
	private int cNo;
	private int point;
	
	//생성자
	public Customer() {}
	
	public Customer(String name, String hp, int cNo, int point) {
		super(name, hp);
		this.cNo = cNo;
		this.point = point;
	}
	
	//getter setter
	public void setCNo(int cNo) {
		this.cNo = cNo;
	}
	
	public void setPoint(int point) {
		this.point = point;
	}
	
	public int getCNO() {
		return cNo;
	}
	
	public int getPoint() {
		return point;
	}
	
	//일반메소드
	public void showInfo() {
		System.out.println("이름: "+super.name+", #핸드폰: "+super.hp+", #고객번호: "+cNo+", #포인트 점수: "+point);
	}
	
	
	

	
}
