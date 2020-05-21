package com.javaex.ex07;

public class SmartPhone extends MusicPhone {
    
    public void execute(String str){
        
    	if("음악".equals(str)) {
    		spMusic();
    	} else if("앱".equals(str)) {
    		app();
    	} else {
    		super.execute(str);
    	}
        
    }
 
    public void spMusic() {
        System.out.println("다운로드해서 음악재생");
    }

    public void app() {
        System.out.println("앱실행");
    }
    
    
}
