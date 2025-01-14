package j0114;

import java.util.Scanner;

public class Ja0114_07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//while문 구구단
		int i = 2;
		while(i<=9) {
			System.out.printf("%d단\n",i);
			int j = 1;
			while(j <= 9) {
				System.out.printf("%d * %d = %d\t",i,j,i*j);
				j++;
				
			}
			System.out.println("\n");
			i++;
		}
		
		
		
		
//		int i=1;
//		while(i<=5) {
//			System.out.println("안녕"+i);
//			i++;
//		}
//		
//		for(int j=1;j<=5;j++) {
//			System.out.println("안녕"+j);
//			
//		}

		
		
		
		
		
		
//		// 입력받은 숫자부터 구구단 시작		
//		// 3~5단까지  출력
//		for(int i=3; i<=5; i++) {
//			System.out.printf("%d단\n",i);
//			for(int j =1; j<=9;j++) {
//				System.out.printf("%d * %d = %d\n",i,j,i*j);
//			}
//		}
//		
		
		
		
		
		
		
		
		// 구구단
//		for(int i=2; i<=9;i++) {
//			System.out.printf("%d단\n",i);
//			for(int j=1;j<=9;j++) {
//				System.out.printf("%d * %d = %d\n",i,j,i*j);
//			}
//		}
		
		
		
		
		
//		Scanner scan = new Scanner(System.in);
//
//		// for
//		for(int i=0;i<=10;i++) { //무한반복
//			System.out.println("ㅎㅇ"+i);
//
//		}
		
		
		
		
//		// 입력 받은 글자를 1개씩 출력하는 프로그램 구현
//		System.out.println("글자를 입력하세요.(영문자만 입력가능) : ");
//		String str = scan.next();
//		
//		// 모두 영문자 일때만 1개씩 출력
//		// 1. 영문자인지 확인
//		int temp = 0;
//		for(int i=0; i<str.length();i++) {
//			if (!(str.charAt(i)>='a' && str.charAt(i)<='z' || str.charAt(i)>='A' && str.charAt(i)<='Z')) {
//				temp=1;
//				break;
//			}
//		}
//		// 2. 영문자이면 출력,그렇지 않으면 다시 입력
//		if(temp==0) {
//			for(int i=0; i<str.length();i++) {
//				System.out.println(str.charAt(i));
//			}
//		}else {
//			System.out.println("영문자가 아닌것이 포함되어 있습니다..");
//		}
		
		
		
		
		
//		String input = "abcdefghijk";
		//모든 단어를 1개씩 출력
//		for(int i=0; i<input.length();i++) {
//			System.out.println(input.charAt(i));
//		}
		
//		System.out.println(input.length());
//		System.out.println(input.charAt(input.length()-1));
		
		
		
		
//		System.out.println("글자를 입력하세요.(영문자만 입력가능) : ");
//		String str = scan.next();
//		char ch = str.charAt(0);
//		if (ch>='a' && ch<='z' || ch>='A' && ch<='Z') {
//			System.out.println("출력: "+ch);
//		}else {
//			System.out.println("영문자가 아닙니다. 다시 입력하세요.");
//		}
//		
		
		
		
		// 반복문
//		int sum = 0;
//		for (int i=1; i<=10; i++) {
//			System.out.println("ㅎㅇ");
//			sum=sum+i;
//			//sum += i;
//		}
//		
//		System.out.println(sum);
	}

}
