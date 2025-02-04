package study;

public class Study {
	private int no;
	private String name;
	
	Study(){};
	
	Study(String name){
		this.name=name;
	}

	protected int getNo() {
		return no;
	}

	protected void setNo(int no) {
		this.no = no;
	}

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}
	
	
	
}
