import java.util.Scanner;

public class MyIntegerDriver {

	public static void main(String[] args) {
		int n;
		Scanner scanner=new Scanner(System.in);
		n=scanner.nextInt();
		
		MyInteger obj=new MyInteger();
		
		obj.setInt(n);
		obj.show();
		

	}

}
