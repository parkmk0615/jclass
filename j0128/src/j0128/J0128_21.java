package j0128;

import java.util.Arrays;
import java.util.Scanner;

public class J0128_21 {

	public static void main(String[] args) {
		// 이름, 국어점수 - 5명의 학생의 국어 성적 입력
		Scanner scan = new Scanner(System.in);
		
		String[] name = new String[5];
		int[] kor = new int[5];
		
		for(int i=0;i<5;i++) {
			System.out.println("이름을 입력하세요:");
			name[i]=scan.next();
			System.out.println("국어점수를 입력하세요");
			kor[i]=scan.nextInt();
		}
		
		System.out.println(Arrays.toString(name)); // 각 배열에 저장된 값을 리스트 형태로 출력
		System.out.println(Arrays.toString(kor));  // 각 배열에 저장된 값을 리스트 형태로 출력
		

	}

}
