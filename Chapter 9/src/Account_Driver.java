import java.util.*;
public class Account_Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account razib=new Account(151, 20000);
		
		razib.setInterestRate(4.5);
		razib.withdraw(5000);
		
		System.out.println(razib.getDate());
		
		

	}

}
