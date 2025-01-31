package j0128;

public class J0128_23 {

	public static void main(String[] args) {
		int[] lotto = new int[6];
		
		int i=0;
		
		loop:while(i<6) {
			int ran = (int)(Math.random()*45)+1;
			
			for(int j=0;j<i;j++) {
				if(lotto[j]==ran) {
					System.out.println("동일한 숫자가 있습니다. "+ran);
					continue loop;
				}
			}
			lotto[i] = ran;
			i++;
		}
		System.out.println("로또번호: ");
		for(int j=0; j<lotto.length;j++) {
			System.out.println(lotto[j]+" ");
		}
		System.out.println();
	}

}
