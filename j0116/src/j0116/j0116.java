package j0116;

public class j0116 {

	public static void main(String[] args) {
		tv t1 = new tv();
		t1.color = "red";
		t1.power = false;
		t1.channel = 7;
		
		t1.power();
		t1.channelUp();
		
		System.out.println("현재채널: "+t1.channel);

	}

}
