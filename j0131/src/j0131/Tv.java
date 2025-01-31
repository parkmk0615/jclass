package j0131;

public class Tv extends Product {
	
//	private String name;
//	private int price;
//	private int point;
	
	private int size;
	private String panel;
	private String color;
	
	// 기본 생성자
	Tv(){
		this("LG50Tv",1000000,100000,50,"LED","BLACK");
	// 매개변수 생성자
	}
	Tv(String name, int price, int point, int size, String pannel, String color){
		setName(name);
		setPrice(price);
		setPoint(point);
		this.size = size;
		this.panel = panel;
		this.color = color;
		
	}
	
}
