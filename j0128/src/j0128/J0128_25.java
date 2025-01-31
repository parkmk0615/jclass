package j0128;

import java.util.Scanner;

public class J0128_25 {

	public static void main(String[] args) {
		// 1-45까지 로또번호 6개와 
		// 입력한 숫자 6개를 비교해서 맞춘 개수와 번호를 출력하시오.
		
		Scanner scan = new Scanner(System.in);
		
		int[] lotto = new int[6];
		int[] num= new int[6];
		int count = 0;
		
		for(int i=0;i<6;i++) {
			int rand = (int)(Math.random()*45);
			lotto[i] = rand;
			
			}
		
		for(int i=0;i<6;i++) {
			num[i]=scan.nextInt();
			if(num[i]==lotto[i]) {
				count++;
			}
		}
		
		for(int i=0;i<6;i++) {
			System.out.println(lotto[i]);
		}
		
		System.out.printf("맞춘횟수: %d\n",count);
		
	

	}

}
