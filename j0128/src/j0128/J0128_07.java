package j0128;

public class J0128_07 {

	public static void main(String[] args) {
		System.out.println(10/3.0);
		
		// %d - 정수형 byte, int, short,long 		%f - 실수형 float, double
		// %s - 문자열 String 		%c - 문자형 char
		// 자릿수 표시, 천 단위 표시, 16진수, 8진수 출력 가능
		
		System.out.printf("%.2f\n",10/3.0);
		System.out.printf("%d\n",100000000);
		System.out.printf("나이: %d, 생년: %d\n",27,1998);
		System.out.printf("%05d\n",100);
		System.out.printf("%5d\n",100);
		System.out.printf("%d\n",0x1A);
		System.out.printf("%X",65);
		
		

	}

}
