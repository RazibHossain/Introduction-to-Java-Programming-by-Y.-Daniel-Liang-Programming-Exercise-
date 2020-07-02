import java.sql.Date;

public class Account {
	private int id;
	private double balance;
	private static double annualInterestRate=0.0;
	private Date dateCreateDate;
	
	public Account() {
		balance=0.0;
		annualInterestRate=0.0;
	}
	
	public Account(int id,double balance) {
		this.id=id;
		this.balance=balance;
	}
	
	int getID(){
		return id;
	}
	
	public void setID(int id) {
		this.id=id;
		
	}
	
	public double getBalance() {
		return balance;
		
	}
	
	public void setBalance(double balance) {
		this.balance=balance;
	}
	public double getInterestRate() {
		return annualInterestRate;
	}
	public void setInterestRate(double annualInterestRate) {
		this.annualInterestRate=annualInterestRate;
		
	}
	
	public Date getDate() {
		return dateCreateDate;
	}
	
	
	public double getMonthlyInterestRate() {
		return annualInterestRate/(12*100);
	}
	
	public double getMonthlyInterest() {
		return balance*getMonthlyInterestRate();
	}
	
	public void withdraw(int money) {
		balance-=money;
	}
	
	public void deposite(int taka) {
		balance+=taka;
	}
	
	
	
	
	
}
