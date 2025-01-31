package j0128;

import java.util.Scanner;

public class J0128_09 {

	public static void main(String[] args) {
		//입력 받기
		Scanner scan = new Scanner(System.in);
		
		System.out.println("문자를 입력하세요");
		String str1 = scan.next();
		System.out.println("문자열1 : "+str1);
		scan.nextLine();
		
		System.out.println("숫자를 입력하세요");
		int num1 = scan.nextInt();
		System.out.println("숫자: "+num1);
	}

}
