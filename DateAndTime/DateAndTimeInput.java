package Java.DateAndTime;

import java.util.Scanner;


public class DateAndTimeInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String date1 = sc.nextLine();
        String[] dates1 = date1.split(":");
        int year1 = Integer.parseInt(dates1[2]);
        int month1 = Integer.parseInt(dates1[1]);
        int days1 = Integer.parseInt(dates1[0]);
        String date2 = sc.nextLine();
        String[] dates2 = date2.split(":");
        int year2 = Integer.parseInt(dates2[2]);
        int month2 = Integer.parseInt(dates2[1]);
        int days2 = Integer.parseInt(dates2[0]);
        sc.close();
        int monthnum1 = 0;
        switch (month1) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                monthnum1 = 31;
                break;
            case 2:
                if(year1%4==0){
                    monthnum1 = 29;
                }
                else{
                    monthnum1 = 28;
                }
            default:
                monthnum1 = 30;
                break;
        }
        int monthnum2 = 0;
        switch (month2) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                monthnum2 = 31;
                break;
            case 2:
                if(year2%4==0){
                    monthnum2 = 29;
                }
                else{
                    monthnum2 = 28;
                }
            default:
                monthnum2 = 30;
                break;
        }
        int numdays = (year2-year1)*365 + (month2*monthnum2-month1*monthnum1)+days2-days1;
        System.out.println(numdays);


    }
}
