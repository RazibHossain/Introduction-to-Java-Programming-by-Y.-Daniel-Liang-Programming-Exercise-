
public class ATMMachine {
		int id;//[]={0,1,2,3,4,5,6,7,8,9};
		double balance;
		
		public ATMMachine(double balance) {
			this.balance=balance;
		}
		
		
		public int getID() {
			return id;
		}
		
		public void setId(int id) {
			this.id=id;
		}
		
		public double getBalance() {
			return balance;
			
		}
		
		public void setBalance(double balance) {
			this.balance=balance;
		}
		
		public void withdraw(int money) {
			balance-=money;
		}
		
		public void deposite(int taka) {
			balance+=taka;
		}
		
		
}
