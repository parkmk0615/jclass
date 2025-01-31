package j0128;

import java.util.Scanner;

public class J0128_19 {

	public static void main(String[] args) {
		// 1~5까지 랜덤 숫자생성
		// 5번 입력받아 랜덤 숫자를 몇 번 맞췄는지 횟수 출력
		// 입력했던 숫자모두 출력
		
		Scanner scan = new Scanner(System.in);
		
		
		int[] num = new int[5];
		int[] num2 = new int[5];
		int count=0;
		
		for(int j=0;j<5;j++) {	//num2에 랜덤한 값 5개를 삽입
			int rand =(int)(Math.random()*5)+1;
			num2[j]=rand;
		}
		
		for(int i=0;i<5;i++) { // num 값을 입력 받고, num2와 같은 값을 입력했을때 count에 +1
			num[i]=scan.nextInt();
			if(num2[i] == num[i]) {
				count+=1;
			}
		}
		
		for(int c=0;c<5;c++) {
			System.out.println("랜덤 값: "+num2[c]);
		}
		for(int d=0;d<5;d++) {
			System.out.println("입력한  값: "+num[d]);
		}
		System.out.println("정답을 맞춘 횟수: "+count);
		

	}

}
