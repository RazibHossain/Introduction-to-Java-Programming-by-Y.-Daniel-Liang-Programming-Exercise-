public class Time {
	private long hour;
	private long minute;
	private long second;
	
	
	public Time() {
		long sec=System.currentTimeMillis()/1000;
		long min=sec/60;
		long hour=min/60;
		
		this.hour=hour%24;
		this.minute=min%60;
		this.second=sec%60;
	
	}
	public Time(long hour, long minute, long second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public Time(long elapseTime) {
        long totalSeconds = elapseTime / 1000;
        long totalMinutes = totalSeconds / 60;
        long totalHours = totalMinutes / 60;
        this.hour = totalHours % 24;
        this.minute = totalMinutes % 60;
        this.second = totalSeconds % 60;

    }

    public long getHour() {
        return hour;
    }


    public long getMinute() {
        return minute;
    }


    public long getSecond() {
        return second;
    }



}
	
	
	
	

