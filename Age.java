
import java.util.Scanner;

public class Age {
    int month[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    int month_l[] = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    String id;
    int d, m, y;

    public static boolean isLeapYear(int y) {
        if (y % 100 == 0) {
            return (y % 400 == 0);
        } else {
            return (y % 4 == 0);
        }
    }

    public Age() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Date of Birth (DD/MM/YYYY) : ");
        id = input.next();
        d = Integer.parseInt(id.substring(0, 2));
        m = Integer.parseInt(id.substring(3, 5));
        y = Integer.parseInt(id.substring(6, 10));
       // System.out.println(d + " " + m + " " + y);
    }

    public void CalculateAge() {
        int today_d = 12, today_m = 10, today_y = 2020;
        int dob_num_days = 0, today_num_days = 0;
        dob_num_days = getToday_num_days(d, m, y, dob_num_days);
        today_num_days = getToday_num_days(today_d, today_m, today_y, today_num_days);
        System.out.println((today_y - y) + " years "); 
        }

    private int getToday_num_days(int today_d, int today_m, int today_y, int today_num_days) {
        today_num_days += today_d;
        if (isLeapYear(today_y)) {
            for (int i = 0; i < today_m - 1; i++)
                today_num_days += month_l[i];
        } else {
            for (int i = 0; i < today_m - 1; i++)
                today_num_days += month[i];
        }
        return today_num_days;
    }

    public static void main(String args[]) {
        Age a = new Age();
        a.CalculateAge();
    }
}