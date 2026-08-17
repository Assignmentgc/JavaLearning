class Time {
    int hours;
    int minutes;
    int seconds;

    public Time(int h, int m, int s) {
        hours = h;
        minutes = m;
        seconds = s;
    }

    public void displayTime() {
        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}

public class TestTime {
    public static void main(String[] args) {
        Time t1 = new Time(10, 30, 45);
        t1.displayTime();
    }
}