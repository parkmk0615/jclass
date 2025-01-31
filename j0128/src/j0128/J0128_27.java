package j0128;

import java.util.Scanner;

public class J0128_27 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String[] title = {"이름","국어","영어","수학","합계","평균"};
		
		//국어 영어 수학 3명 학생의 성적 입력
		String[] name = new String[3];
		int[][] score = new int[3][4];
		double[] avg = new double[3];
		
		//성적 입력 받아 출력하기
		for(int i=0;i<score.length;i++) { // score 행의 길이
			System.out.println("이름을 입력하세요");
			name[i] = scan.next();
			
			int total=0;
			for(int j=0;j<score[i].length-1;j++) { // score 열의 길이
				System.out.printf("[%s] 점수를 입력하세요.",title[j+1]);
				score[i][j] = scan.nextInt();
				total += score[i][j];
				if(j==2) {
					score[i][j+1] = total;
					avg[i] = total/3.0;
				}
			}
			
		}
		
		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\n",title[0],title[1],title[2],title[3],title[4],title[5]);;
		System.out.println("-------------------------------------------------");
		for(int i=0;i<score.length;i++) { // score 행의길이
			System.out.print(name[i]+"\t");
			for(int j=0;j<score[i].length;j++) {
				System.out.print(score[i][j]+"\t");
			}
			System.out.println(avg[i]+"\t");
		}
	}

}
