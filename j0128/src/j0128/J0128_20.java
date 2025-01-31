package j0128;

import java.util.Scanner;

public class J0128_20 {

	public static void main(String[] args) {
		//1~100의 랜덤 숫자 생성
		//총 10번 도전해서 맞추면 종료
		//랜덤 숫자보다 큰 수, 작은 수 입니다 출력
		//입력한 숫자를 모두 출력
		
		Scanner scan = new Scanner(System.in);
		
		int rand = (int)(Math.random()*100)+1;
		int[] num = new int[10];
		
		for(int i=0;i<10;i++) {
			
			int input = scan.nextInt();
			num[i]=input;
			
			if(num[i]==rand) {
				System.out.println("정답입니다.");
				break;
			}else if(input<rand) {
				System.out.println("입력한 값이 더 작습니다.");
			}else if(input>rand) {
				System.out.println("입력한 값이 더 큽니다.");
			}
		}
		for(int i=0;i<10;i++) {
			System.out.printf("입력한 값: %d\n",num[i]);
		}
		
		
	}

}
