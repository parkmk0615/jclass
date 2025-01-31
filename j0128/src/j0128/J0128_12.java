package j0128;

import java.util.Scanner;

public class J0128_12 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//조건문 -if, switch
		// 1--입력창 2--검색창 3--수정창 4--삭제창 5--종료
		
		System.out.println("사용자 권한을 생성합니다.");
		int num = scan.nextInt();
		
		switch(num) {
		case 5:
			System.out.println("슈퍼바이저  권한이 부여됩니다.");
			break;
		case 4:
			System.out.println("삭제 권한이 부여됩니다.");
			break;
		case 3:
			System.out.println("수정 권한이 부여됩니다.");
			break;
		case 2:
			System.out.println("작성 권한이 부여됩니다.");
			break;
		case 1:
			System.out.println("읽기 권한이 부여됩니다.");
			break;
		}
		

	}

}
