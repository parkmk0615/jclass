package j0128;

import java.util.Scanner;

public class J0128_14 {

	public static void main(String[] args) {

		for(int j=1; j<=9;j++) {
			if(j%2==1) { // 나머지가 홀수면 위로 올라감
				continue;
			}
			for(int i=1;i<=9;i++) {
				System.out.printf("%d * %d = %d\n",j,i,j*i);
			}
		}
		
		Scanner scan = new Scanner(System.in);
		
		String str = "홍길동";
		
		System.out.println("이름을 입력하세요");
		String input = scan.next();
		
		if(str.equals(input)) { //str 값과 input 값이 같은지 비교
			System.out.println("맞습니다.");
		}
		else {
			System.out.println("아닙니다.");
		}
		
		
		String str2 = "홍길동";
		String str3 = "홍길";
		if(input == str2) {
			System.out.println("맞습니다.");
		}
		else {
			System.out.println("아닙니다.");
		}
	}
	
	

}
