public class Time
{ 
    // Instance Variables 
    int hour;
    int minute;
    int second;
    int value;
  
    // Constructor Declaration of Class 
    public Time(int hour,int minute,int second) 
    { 
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    } 
  
    public int getHour(){
        return hour;
    }
    
    public int getMinute(){
        return minute;
    }

    public int getSecond(){
            //return second;
            second = this.second % 60;
            return second;
    }
    public void setHour(int h){
        hour = h;
    }
    public void setMinute(int m){
        minute = m;
    }
    public void setSecond(int s){
        second = s;
    }

    public void add(Time t){
        int s = (this.second + t.second) % 60;
        int m = (this.minute + t.minute + (this.second + t.second) / 60) % 60;
        int h = (this.hour + t.hour + (this.minute + t.minute + (this.second + t.second) / 60) / 60) % 24;
        String hr = Integer.toString(h);
        String mn = Integer.toString(m);
        String sc = Integer.toString(s);
        if (h < 10)
            hr = "0" + hr;
        if (m < 10)
            mn = "0" + mn;
        if (s < 10)
            sc = "0" + sc;
        System.out.println(hr + ":" + mn + ":" + sc);
    }
    
  
    //@Override
    public String toUniversal() 
    { 
        return(this.getHour()+":"+this.getMinute()+":"+this.getSecond());
    } 
  
    public static void main(String[] args) 
    { 
        Time t = new Time(23,34,45);
        System.out.println(t.toUniversal());
        Time t2 = new Time(22,11,33);
        t.add(t2);
    } 
} 