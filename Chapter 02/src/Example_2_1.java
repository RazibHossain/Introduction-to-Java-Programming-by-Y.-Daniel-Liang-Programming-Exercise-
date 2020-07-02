//Compute Area
import java.util.*;
public class Example_2_1 {
	


	public static void main(String[] args) {
		
		 final double PI=3.1416;

		Scanner scanner=new Scanner(System.in);
		
		double radius;
		double area;
		System.out.println("Enter the number ");
		area=scanner.nextDouble();
		radius=area*area*PI;
		System.out.println("The Radius of Circle "+radius +" Square");
	}

}
