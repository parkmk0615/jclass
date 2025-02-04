package study;

import java.util.Scanner;

public class studyMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int choice = 0;
		Study_Deck sd = new Study_Deck();
		
		while(true) {
			System.out.println("1. 이름 출력");
			System.out.println("2. 번호 출력");
			
			System.out.println("원하는 번호를 입력하세요.>> ");
			choice = scan.nextInt();
			
			switch(choice) {
				case 1:
					sd.study();
					break;
			}
			
		}
	}
}
