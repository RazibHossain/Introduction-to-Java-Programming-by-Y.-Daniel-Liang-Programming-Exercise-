import java.util.*;
public class Linear_Equation_Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the value of a , b, c, d, e, f");
		
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		int d=scan.nextInt();
		int e=scan.nextInt();
		int f=scan.nextInt();
		
		Linear_Equation e1=new Linear_Equation(a,b,c,d,e,f);
		
		
		if (e1.isSolvable()) {
			System.out.println("The action is Solvable");
		}
		else {
			System.err.println("Sorry this can't be possible");
		}


	}

}
