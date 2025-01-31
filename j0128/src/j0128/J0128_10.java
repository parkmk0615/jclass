package j0128;

import java.util.Scanner;

public class J0128_10 {

	public static void main(String[] args) {
		//학생 성적 프로그램
		Scanner scan = new Scanner(System.in);
		
		System.out.println("학생 이름을 입력하세요");
		String name= scan.next();
		
		System.out.println("국어 점수를 입력하세요");
		int kor = scan.nextInt();
		
		System.out.println("영어 점수를 입력하세요");
		int eng = scan.nextInt();
		
		System.out.printf("학생 이름:%s, 국어 점수:%d, 영어 점수:%d",name,kor,eng);
				
	}

}
