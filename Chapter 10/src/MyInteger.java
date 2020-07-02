
public class MyInteger {

	int value=0;
	
	
	public MyInteger() {
		this.value=value;
	}
	
	public int getInt() {
		return value;
	}
	public void setInt(int x) {
		this.value=x;
	}
	
	public boolean isEven(int m) {
		if(m%2==0) {
			return true;
		}
		return false;
	}
	public boolean isPrime(int m) {
		if(m>2 && m%2==0) {
			return true;
		}
		return false;
	}
		public boolean isOdd(int m) {
			if(m%2==1) {
				return true;
			}
			return false;
	
		}	
	
}
