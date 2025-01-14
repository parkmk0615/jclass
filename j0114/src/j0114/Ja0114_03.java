package j0114;

import java.util.Scanner;

public class Ja0114_03 {

	public static void main(String[] args) {
		// 학생성적 프로그램
		Scanner s = new Scanner(System.in);
		System.out.println("학생 이름을 입력하세요");
		String name = s.nextLine();
		
		System.out.println("국어점수를 입력하세요");
		int kor = s.nextInt();
		
		System.out.println("영어 점수를 입력하세요");
		int eng = s.nextInt();
		
		System.out.println("수학 점수를 입력하세요");
		int math = s.nextInt();
		
		int sum = kor+eng+math;
		double avg = sum/3.0;
		
		System.out.printf("이름 : %s, 국어 : %d 영어 : %d, 수학:%d, 합계:%d, 평균:%.2f\n",name,kor,eng,math,sum,avg);
		

	}

}
