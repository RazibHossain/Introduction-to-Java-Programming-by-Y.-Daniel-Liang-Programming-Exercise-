
public class E_9_2_Tv {
	int channel=1;
	int vol=1;
	boolean on=false;
	
	public E_9_2_Tv() {
		
	}
	public E_9_2_Tv(int k) {
		
	}
	
	public void TurnOn() {
		on=true;
		
	}
	public void TurnOff() {
		on=false;
		
	}
	public void setChannel(int newchannel) {
		if(on && newchannel>=1 && newchannel<=170) {
			channel=newchannel;
		}
		
	}
	public void setVolume(int newvol) {
		if(on && newvol>=1 && newvol<=7) {
			vol=newvol;
		}
		
	}
	public void channelUp() {
		channel++;
		
	}
	public void channelDown() {
		vol--;
		
	}
	public void volUp() {
		vol++;
		
	}
	public void volDown() {
		vol--;
		
	}

}
