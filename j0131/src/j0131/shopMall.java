package j0131;

import java.util.Scanner;

public class shopMall {

	public static void main(String[] args) {
		
		// 상품관리 - product - Tv, computer, refrigerator, washing
		// 유저관리 - Buyer
		// 메소드 관리 - shop_Deck
		// 메인 - ShopMall
		
		Scanner scan = new Scanner(System.in);
		shop_Deck sd = new shop_Deck();
		
		int choice = 0;
		
		sd.login(); //로그인메소드호출
		loop:while(true) {
			// 화면 출력
			choice = sd.mainPrint();
			switch(choice) {
			case 1:
				sd.buy(new Tv());
				break;
			case 2:
				sd.buy(new Tv("LG75TV",1500000,150000,75,"LED","BLACK"));
				break;
			case 3:
				sd.buy(new Computer());
				break;
			case 4:
				sd.buy(new Refrigerator());
				break;
			case 5:
				sd.buy(new Washing());
				break;
			case 7:
				sd.proList();
				break;
			case 8:
				sd.charge();
				break;
			case 0:
				System.out.println("[ 프로그램 종료 ]");
				break;
			}
		}
		
		
		
	}
	

}
