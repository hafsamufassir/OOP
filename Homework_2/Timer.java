

public class Timer {
    int hour;
    int minute;
    int second;

    
    public Timer(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    
    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    // public int add(Timer t){
    //     int h = this.hour + t.hour;
    //     int m = this.minute + t.minute;
    //     int s = this.second + t.second;
    // }

     public void add(Timer t){
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


    public static void main(String... args){
        Timer t = new Timer(10, 12, 12);
        Timer result = t.add(10, 12, 12);
        System.out.println(result);
    }

}


// public void add(Time t){
//         int s = (this.second + t.second) % 60;
//         int m = (this.minute + t.minute + (this.second + t.second) / 60) % 60;
//         int h = (this.hour + t.hour + (this.minute + t.minute + (this.second + t.second) / 60) / 60) % 24;
//         String hr = Integer.toString(h);
//         String mn = Integer.toString(m);
//         String sc = Integer.toString(s);
//         if (h < 10)
//             hr = "0" + hr;
//         if (m < 10)
//             mn = "0" + mn;
//         if (s < 10)
//             sc = "0" + sc;
//         System.out.println(hr + ":" + mn + ":" + sc);
//     }



// public class Time {
//     private int hour;
    
//     public Time(int hour) {
//         this.hour = hour;
//     }
    
//     public int getHour() {
//         return hour;
//     }
    
//     public int addHour(int hour){
//         return getHour() + this.hour;
//     }


//     public static void main(String... args){
//         Time time = new Time(10);
//         int result = time.addHour(10);
//         System.out.println(result);
//     }

// }
