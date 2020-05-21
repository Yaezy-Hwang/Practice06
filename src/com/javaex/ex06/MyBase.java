package com.javaex.ex06;

public class MyBase extends Base{

	public void service(String state) {

        if (state.equals("낮")) { //문자열의 같다(==) 는 equals()를 사용합니다.
            day();
        } else if(state.equals("오후")){
            afternoon();
        } else {
        	night();
        }
    }

	public void day() {
		System.out.println("낮에는 열심히 수업을 듣자");
	}
	
    public void afternoon() {
        System.out.println("오후에도 낮처럼 공부를 하자");
    }

    public void night() {
    	System.out.println("밤에는 숙면");
    }

    
}
