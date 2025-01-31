package j0128;

public class J0128_17 {

	public static void main(String[] args) {
		//score배열 100개를 만들어서, 1부터 100까지 숫자를 입력해서 출력
		//배열에 들어가 있는 숫자 합계 출력
		int[] score = new int[100];
		int sum=0;
		
		for(int i=0;i<100;i++) {
			score[i]=(int)(Math.random()*10)+1;
			System.out.println(score[i]);
			sum+=score[i];
		}
		System.out.printf("총 합은: %d",sum);

	}

}
