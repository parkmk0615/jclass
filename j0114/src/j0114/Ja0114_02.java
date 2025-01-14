package j0114;

import java.util.Scanner;

public class Ja0114_02 {

	public static void main(String[] args) {
		//입력을 받기위해선
		//1. scanner 선언
		//정수형 - nextInt, nextLong, nextByte, nextShort
		//실수형 - nextFloat, nextDouble
		//문자형 - next, nextLine
		
		// 입력을 위해서 객체선언을 해야 함
		Scanner scan= new Scanner(System.in);
		//문자열 입력
		System.out.println("문자를 입력하세요");
		String str1 = scan.next();
		System.out.println("문자열1 : "+str1);
		scan.nextLine();
		
		System.out.println("문자를 입력하세요");
		String str2 = scan.nextLine();
		System.out.println("문자열2 : "+str2);
		
//		System.out.println("정수를 입력하세요. ");
//		
//		int num1 = scan.nextInt();
//		System.out.println("숫자: "+num1);
//		
//		System.out.println("실수를 입력하세요. ");
//		
//		float num2 = scan.nextFloat();
//		System.out.println("숫자: "+num2);
//		
	}

}
