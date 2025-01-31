package j0128;

import java.util.Scanner;

public class J0128_11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		int score1 = scan.nextInt();
		System.out.println("숫자를 입력하세요");
		int score2 = scan.nextInt();
		System.out.println("숫자를 입력하세요");
		int score3 = scan.nextInt();
		
		int max = (score1>score2)?((score1>score3)?score1:score3):((score2>score3)?score2:score3);
		System.out.println(max);
		
		int min = (score1>score2)?((score2>score3)?score3:score2):((score1>score3)?score3:score1);
		System.out.println(min);
		

	}

}
