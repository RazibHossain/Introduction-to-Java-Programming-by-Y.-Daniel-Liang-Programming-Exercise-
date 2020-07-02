
public class Fan_Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fan fan1=new Fan();
		Fan fan2=new Fan();
		
		fan1.setSpeed(fan1.MEDIUM);
		fan1.setRadius(10);
		fan1.setColor("Yellow");
		fan1.setOn(true);
		
		
		fan2.setOn(false);
		fan2.setRadius(5);
		fan2.setSpeed(Fan.SLOW);
		fan2.setColor("blue");
		
		System.out.println(fan1.toString());
		System.err.println(fan2.toString());
	}

}
