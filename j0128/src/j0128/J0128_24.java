package j0128;

public class J0128_24 {
	
	public static void main(String[] args) {
		// 1~10까지 랜덤으로 저장. 단, 동일한 번호는 없도록
		
		int[] num = new int[10];
		int i=0;
		loop:while(i<10) {
			int randomN = (int)(Math.random()*10)+1;
			for(int j=0;j<i;j++) {
				if(num[j]==randomN) {
					System.out.println("번호가 동일합니다. "+ randomN);
					continue loop;
				}
			}
			num[i] = randomN;
			i++;
		}
		System.out.print("랜덤 숫자 입력: ");
		for(int j=0;j<10;j++) {
			System.out.println(num[j]+" ");
		}
		System.out.println();
		
		
		
		
	}

}
