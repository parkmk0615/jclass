package j0116;

public class tv {
	
	String color;
	boolean power;
	int channel;
	
	void power() {
		power = !power;
	}
	void channelUp(){
		channel++;
	}
	void channelDown() {
		channel--;
	}

}
