package Java.DateAndTime;

import java.util.Scanner;
public class TimeInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String time1 = sc.nextLine();
        String[] times1 = time1.split(":");
        int hour1 = Integer.parseInt(times1[0]);
        int min1 = Integer.parseInt(times1[1]);
        int sec1 = Integer.parseInt(times1[2]);
        String time2 = sc.nextLine();
        String[] times2 = time2.split(":");
        int hour2 = Integer.parseInt(times2[0]);
        int min2 = Integer.parseInt(times2[1]);
        int sec2 = Integer.parseInt(times2[2]);
        int t = (hour2-hour1)*3600+(min2-min1)*60+(sec2-sec1);
        System.out.println(t);
        String tdiff = (t/3600)+":"+((t%3600)/60)+":"+(((t%3600)%60));
        System.out.println(tdiff);
    }
}
