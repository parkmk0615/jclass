package j0128;

import java.util.Scanner;

public class J0128_13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//구구단
		//for문
		for(int i=3; i<=5; i++) { //초기값, 조건식, 증감
			System.out.printf("for 문 %d단\n",i);
			for(int j=1;j<=9;j++) {
				System.out.printf("%d X %d\n",i,j);
			}
		}
		
		//while문
		int a=1; // 초기값
		while(a<=5) { // 조건식
			System.out.printf("while문 %d단\n",a);
			int b=1; // 초기값
			while(b<=9) { // 조건식
				System.out.printf("%d X %d\n",a,b);
				b++;
			}
			a++; //증감
		}
	}

}
