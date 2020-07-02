import java.util.*;
import java.math.*;
public class BigIntegerTest {
	
	
	public static BigInteger BigFact(int n) {
		
		BigInteger result=new BigInteger("1");
		for(int i=1;i<=n;i++) {
			result=result.multiply(new BigInteger(i +""));
		}
		return result;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(BigFact(50));
		int k=5;
		BigInteger pBigInteger =new BigInteger("1");
		BigInteger r=new BigInteger("1");
		BigInteger y=new BigInteger("11111111111111111111111111111111111111111111111111");
		r=y.multiply(new BigInteger(k+""));
		System.err.println(r);
	}

}
