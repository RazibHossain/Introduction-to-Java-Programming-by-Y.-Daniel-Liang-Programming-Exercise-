import java.util.Scanner;

public class ATMMachineDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ATMMachine objAtmMachine=new ATMMachine(100);
		for(int i=0;i<10;i++) {
			objAtmMachine.setId(i);
		}
		
		Scanner scanner=new Scanner(System.in);
		
		while (true) {
			System.out.println("Enter an id: ");
			int n;
			n=scanner.nextInt();
			if(n>=0 && n<=10) {
				System.out.print("Main menu\n"
						+ "1: check balance\n"
						+ "2: withdraw\n"
						+ "3: deposite\n"
						+ "4: exit\n");
				
				int choose;
				System.out.println("Enter a choice: \n");
				choose=scanner.nextInt();
				if(choose!=4) {
					if(choose==1) {
						System.out.println(objAtmMachine.balance);
					}
					else if(choose==2) {
						System.out.println("Enter an amount to withdraw: ");
						int am;
						am=scanner.nextInt();
						objAtmMachine.withdraw(am);
						
					}
					else {
						System.out.println("Enter an amount to deposite: ");
						int dp;
						dp=scanner.nextInt();
						objAtmMachine.deposite(dp);
					}
				}
				
				
				
			}
			else {
				System.out.println("Enter Correct id Number. ");
			}
		}
		
		

	}

}
