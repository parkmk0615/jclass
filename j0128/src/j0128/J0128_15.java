package j0128;

import java.util.Scanner;

public class J0128_15 {

	public static void main(String[] args) {
		//1~100까지 랜덤 숫자를 입력받아, 10번을 입력해서 숫자 맞추기 게임 구현
		//10번 이후에는 정답 공개.
		Scanner scan = new Scanner(System.in);
		
		int rand = (int)(Math.random()*100)+1; // random함수 사용:0~1 사이 값, 10을 곱해줌으로0~10까지 랜덤 값 출력
		
		for(int i=0;i<10;i++) {
			System.out.printf("%d번째 도전\n",i+1);
			
			System.out.println("숫자를 입력하세요");
			int num = scan.nextInt();
			
			if(num==rand) {
				System.out.println("정답입니다.");
				break;
			}else if(num>rand) {
				System.out.println("입력한 값이 더 큽니다.");
			}else if(num<rand) {
				System.out.println("입력한 값이 더 작습니다.");
			}
			
		}
		System.out.println("게임 끝");
	}

}
