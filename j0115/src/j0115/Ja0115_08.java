package j0115;

public class Ja0115_08 {

	public static void main(String[] args) {
		// 1-10까지 랜덤 숫자 저장받아 동일한 번호가 없게 저장하시
		int[] num = new int[10];
		
		loop:for(int i=0; i<num.length;i++) {
			int ran=(int)(Math.random()*10)+1;
			for(int j=0;j<i+1;j++) {
				if(num[j]==ran) {
					continue loop;
				}
			}
			num[i]=ran;
		}
		
		for(int i=0;i<num.length;i++) {
			System.out.println("숫자: "+num[i]);			
		}
	}

}
