package j0128;

import java.util.Scanner;

public class J0128_18 {

	public static void main(String[] args) {
		// 5개의 숫자를 입력받아 5개를 저장하고, 5개의 값을 출력, 합계를 출력
		
		Scanner scan = new Scanner(System.in);
		int[] num = new int[5];
		int sum = 0;
		
		for(int i=0;i<5;i++) { //num[0]~num[4]까지 값 입력
			num[i] = scan.nextInt();
		}
		
		for(int i=0; i<5;i++) {
			System.out.printf("%d번째의 값은 :%d\n",i,num[i]);
			sum+=num[i];
		}
		System.out.println(sum);
	}

}
