package j0115;

import java.util.Scanner;

public class Ja0115_02 {

	public static void main(String[] args) {
		// 5개의 숫자를 입력받아 5개를 저장하고, 5개의 값을 출력, 합계를 출력
		Scanner scan =new Scanner(System.in);
		int[] num = new int[5];
		int sum=0;
		
		for(int i=0;i<5;i++) {
			num[i] = scan.nextInt();
		}
		for(int i=0;i<5;i++) {
			System.out.printf("%d번째 숫자:%d \n",i,num[i]);
			sum+=num[i];
		}
		System.out.println(sum);
		
		
	}

}
