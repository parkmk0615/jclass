package j0128;

public class J0128_22 {

	public static void main(String[] args) {
		int[] ball = new int[45];
		
		//1~45번호 저장
		for(int i=0;i<45;i++) {
			ball[i]=i+1;
		}
		//1~45 순차출력
		for(int i=0;i<45;i++) {
			System.out.println(ball[i]);
		}
		
		int temp = 0;
		for(int i=0; i<300;i++) {
			int ran= (int)(Math.random()*45);
			temp = ball[0];
			ball[0] = ball[ran];
			ball[ran]=temp;
		}
		
		for(int i=0;i<45;i++) {
			System.out.println(ball[i]);
		}
	}

}
