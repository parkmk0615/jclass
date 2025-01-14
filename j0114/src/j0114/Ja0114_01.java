package j0114;

public class Ja0114_01 {

	public static void main(String[] args) {
		boolean temp = true;
		char ch = 'a';
		byte n1 = 1;
		short n2 = 2;
		int num = 100;
		long num2 =10000L;
		float f = 3.14f;
		double d = 10.345;
		String str = "abcd";
		//String str2 = new String("abcd");
		
		System.out.println(temp);
		System.out.println(ch);
		System.out.println(num);
		
		//printf
		System.out.printf("논리형 : %b \n",temp);
		System.out.printf("문자형 : %c \n",ch);
		System.out.printf("정수형 : %05d, %d \n",num, num2);
		System.out.printf("실수형 : %.2f, %f \n",f, d);
		System.out.printf("문자열 : %s \n",str);

	}

}
