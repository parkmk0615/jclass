package j0115;

import java.util.Scanner;

public class Ja0115_04 {

	public static void main(String[] args) {
		// 1-100의 랜덤 숫자를 생성
		// 10번의 도전으로 해서 정답을 맞추면 종료
		// 랜덤 숫자보다 큰 수, 작은 수 입니다 출력
		// 입력한 숫자를 모두 출력
		
		//랜덤 숫자 : 55
		//입력한 숫자 : 1,2,3,4,55
		//도전: 5
		
		Scanner scan = new Scanner(System.in);
		int rand = (int)(Math.random()*100)+1;
		int[] num= new int[10];
		int count=0;
		
		for(int i=0; i<10; i++) {
			int input= scan.nextInt();
			num[i]=input;
			count+=1;
			if(rand<input){
				System.out.println("랜덤 숫자보다 큽니다.");
			}else if(rand>input) {
				System.out.println("랜덤 숫자보다 작습니다.");
			}
			else {
				System.out.println("정답입니다.");
				break;
			}
		}
		
		System.out.println("랜덤숫자: "+rand);
		System.out.print("입력한 숫자: ");
		
		for(int i=0;i<count;i++) {
			System.out.print("\t"+num[i]);
		}
		
		System.out.println("");
		System.out.println("도전: "+count);
		
		
		
	}

}
