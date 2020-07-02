
public class Fan {
	public static final int SLOW=1;
	public static final int MEDIUM=2;
	public static final int FAST=3;
	
	
	private int speed;
	private boolean on;
	private double radius;
	private String color;
	public String ss;
	
	
	public Fan() {
		speed=SLOW;
		on=false;
		radius=5;
		color="blue";
	}
	
	public int getSpeed() {
		return speed;
		
	}
	
	public void setSpeed(int s) {
		speed=s;
	}
	
	public boolean getOn() {
		return on;
	}
	public void setOn(boolean o) {
		on=o;
		
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double r) {
		radius=r;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String c) {
		color=c;
	}
	
	public String toString() {
		
		if(on==true) {
			return "Speed " +getSpeed()+ " Radius: " +getRadius()+ " Color: "+ getColor();
		}
		else {
			return "Color: "+ getColor()+ " Radius: "+getRadius();
		}
		
	}
	
	
}
