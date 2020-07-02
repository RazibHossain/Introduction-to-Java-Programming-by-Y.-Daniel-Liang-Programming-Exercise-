
public class Linear_Equation {
	
	private   int  a  ;
	private int   f  ;
	private   int  b  ;
	private   int  c  ;
	private    int d  ;
	private    int e  ;
	
	
	public Linear_Equation(int a,int b,int c,int d, int e, int f) {
		this.a=a;
		this.b=b;
		this.c=c;
		this.d=d;
		this.e=e;
		this.f=f;
	}
	public int getA() {
		return a;
		
	}
	public void setA(int A) {
		this.a=A;
		
	}
	public int getB() {
		return b;
	}
	
	public void setB(int B) {
		b=B;
		
	}
	public int getC() {
		return c;
		
	}
	
	public void setC(int C) {
		c=C;
		
	}
	
	public int setD() {
		return d;
	}
	public void setD(int D) {
		d=D;
		
	}
	public int getE() {
		return e;
	}
	public void setE(int E) {
		e=E;
		
	}
	public int getF() {
		return f;
	}
	public void setF(int F) {
		f=F;
		
	}
	
	
	public boolean isSolvable() {
		
		if(((a*d)-(b*c))!=0) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public double getX() {
		int lob;
		lob=(e*d)-(b*f);
		int hor;
		hor=(a*d)-(b*c);
		
		double result=lob/hor;
		
		return result;
		
		
	}
	
	public double getY() {
		
		int lob;
		int hor;
		lob=(a*f)-(e*c);
		hor=(a*d)-(b*c);
		double result;
		result=lob/hor;
		
		return result;
		
	}
	
	
	

}
