
public class TestTv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E_9_2_Tv parentTv=new E_9_2_Tv();
		E_9_2_Tv nobinTv=new E_9_2_Tv();
		
		parentTv.TurnOn();
		parentTv.channelUp();
		parentTv.volUp();
		
		System.out.println("The number is on " +parentTv.channel);
		
		
	}

}
