package j0114;

import java.util.Scanner;

public class Ja0114_08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		for(int i=2;i<=9;i++) {
			if(i%2==1) {
				continue;
			}
			for(int j=1;j<=9;j++) {
				
				System.out.printf("%d * %d = %d \n",i,j,i*j);
			}
			
		}
		
		
//		String str = "홍길동";
//		System.out.println("이름을 입력하세요");
//		String input =scan.next();
//		
//		if(str.equals(input)) {
//			System.out.println("맞습니다.");
//		}else {
//			System.out.println("아닙니다.");
//		}
//		
		
		
		
//		String str = "안녕하세요.";
//		String str2 = "안녕";
//		String str3 = "안녕하세요.";
//		String str4 = new String("안녕하세요.");
//
//		System.out.println(str);
//		System.out.println(str3);
//		System.out.println(str4);
//		
//		if(str==str4) {
//			System.out.println("같습니다.");
//		}else {
//			System.out.println("다릅니다.");
//		}
//		if(str.equals(str4)) {
//			System.out.println("같습니다.");
//		}else {
//			System.out.println("다릅니다.");
//		}
//		
		
//		if(str==str2) {
//			System.out.println("같습니다.");
//		}else {
//			System.out.println("다릅니다.");
//		}
//		System.out.println("-----------------------");
//		if(str==str3) {
//			System.out.println("같습니다.");
//		}else {
//			System.out.println("다릅니다.");
//		}
		
//		int num = 10;
//		int num2 = 10;
//		
//		if(num == num2) {
//			System.out.println("같습니다.");
//		}else {
//			System.out.println("다릅니다.");
//		}
		
		
		
		
		
		
		
//		//1~100까지 랜덤 숫자를 입력받아, 10번을 입력해서 숫자 맞추기 게임 구현
//		//10번 이후에는 정답 공개.
//		Scanner scan = new Scanner(System.in);
//		int ran = (int)(Math.random()*10)+1;
//		
//		for(int i=0;i<10;i++) {
//			System.out.println("숫자를 입력하세요");
//			int num = scan.nextInt();
//			if(num==ran) {
//				System.out.println("정답입니다.");
//				break;
//			}else if(num>ran) {
//				System.out.println("입력한 숫자가 더 큽니다.");
//			}else if(num<ran) {
//				System.out.println("입력한 숫자가 더 작습니다.");
//			}
//		}
//		System.out.println("정답은:"+ran);
		
	
		

		
		
		
		
		//1~100
//		for(int i=0;i<5;i++) {
//			int ran = (int)(Math.random()*100)+1;
//			System.out.println(ran);			
//		}
		
		
		
//		double i = Math.random(); 
//		System.out.println(i);
				
		// 반복문을 이용해서 000~999까지 출력하시오.
//		for(int i=0; i<=999; i++) {
//			System.out.printf("%03d",i);
//			System.out.printf(",");
//		}
	}
}
