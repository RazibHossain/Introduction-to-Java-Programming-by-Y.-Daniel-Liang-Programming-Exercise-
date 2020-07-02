
public class MyPointDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyPoint p1=new MyPoint();
		MyPoint p2=new MyPoint(10,20);
		
		
		System.out.println("The distance between (" 
				+ p1.x + ", " + p1.y + ") and ("
				+ p2.y + ", " + p2.y + ") is: " + 
				p1.distance(p2));
	}

}
