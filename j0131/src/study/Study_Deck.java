package study;

import java.util.Scanner;

public class Study_Deck {
	Scanner scan = new Scanner(System.in);
	String name="";
	
	void study() {
		System.out.println("이름을 입력하시오  (0. 뒤로가기)");
		name = scan.next();
		
		while(true) {
			if(name.equals("0")) {
				break;
			}
		}
	}
}
