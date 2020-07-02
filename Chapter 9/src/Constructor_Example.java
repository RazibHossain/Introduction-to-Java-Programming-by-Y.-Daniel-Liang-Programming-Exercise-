
public class Constructor_Example {
	
	int x=10;
	public Constructor_Example() {
		x=20;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Constructor_Example s =new Constructor_Example();
		Constructor_Example s2= new Constructor_Example();
		System.err.println(s2.x);

	}

}
