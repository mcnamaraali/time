
public class Time1 {
	private int h;
	private int m;
	private int s;

	
	public void setTime(int hour, int minute, int second) {
		
		if(hour < 0 || hour >= 24 || minute < 0 || minute > 60 ||
				second < 0 || second >= 60) {
			throw new IllegalArgumentException(""
					+ "hour, minute and/or second was out of range");
		}
		this.h = hour;
		this.m = minute;
		this.s = second;
		
	}
	
	public String toUniversalString() {
		return String.format("%02d:%02d:%02d:", h,m,s);
	}

	public String toString() {
		return String.format("%d:%02d:%02d %s", ((h == 0 || h == 12 ) ? 12 : 
			h % 12), m, s, (h < 12 ? "AM" : "PM"));
	}


}
