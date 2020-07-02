import java.util.*;
public class P_01 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length from the center to a vertex :");
		double ss=scan.nextDouble();
		double s=2*ss*Math.sin(Math.PI/5);
		double area=(5*s*s)/(4*(Math.tan(Math.PI/5)));
		
		System.out.printf("The area of the pentagon is %4.2f" ,area);
	}

}
