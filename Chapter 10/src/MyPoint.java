
public class MyPoint {
		private double x;
		private double y;
		
		public MyPoint() {
			this(0,0);
		}
		public MyPoint(double p,double q) {
			this.x=p;
			this.y=q;
		}
		
		public double Distance(MyPoint myPoint) {
			return Math.sqrt(Math.pow(x - x, 2) + 
		   			 Math.pow(y - y, 2));
		}
		
		public double distance(double x, double y) {
	 		return Distance(new MyPoint(x, y));
	 	}
		
		
		
		
		
		
		
		
}
