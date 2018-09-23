import java.util.Scanner;

public class Time {
	private int hour;
	private int minute;
	private int second;
	
	public Time(){
	}

	
	public Time(int hour, int minute, int second){
		if((hour >= 0 && hour < 24) && (minute >= 0 && minute < 60) && (second >= 0 && second < 60)){
			this.hour = hour;
			this.minute = minute;
			this.second = second;
		}
		else{
			throw new IllegalArgumentException("Hour, minute and/or second was out of range");
		}
	}
	
	public void add(Time a){
		int lastSecond = this.second;
		int lastMinute = this.minute;
		this.second = (lastSecond + a.second) % 60;
		this.minute = (lastMinute + a.minute) % 60 + (lastSecond + a.second) / 60;
		this.hour = (this.hour + a.hour) % 24 + (lastMinute + a.minute) / 60; 
		
	}
	
	public String toUniversal(){
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}
	
	public String toStandard(){
		return String.format("%02d:%02d:%02d %s", ((hour == 0 || hour == 12) ? 12 : hour % 12), minute, second,
				(hour < 12 ? "AM" : "PM"));
	}

	public static void main(String[] args){
		Time t = new Time(13, 24, 8);
		Time t2 = new Time(11, 35, 58);
		
		System.out.printf("Time 1:\n%s\n%s\n", t.toUniversal(), t.toStandard());
		
		System.out.println("\nTime 2:\n" + t2.toUniversal() +"\n" + t2.toStandard());
		t.add(t2);
		
		System.out.printf("\nSum:\n%s\n%s", t.toUniversal(), t.toStandard());
	}
}
