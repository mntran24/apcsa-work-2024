import java.util.Scanner;

public class NoonSnooze {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter snooze value: ");
        int snooze = input.nextInt();
        if (snooze < 0) {
            System.out.println("No negative values are allowed");
        } else {
            int output_hr = 0;
            int num_hrs = snooze / 60;
            int output_min = snooze - num_hrs * 60;
            String time = "pm";
            if (num_hrs % 24 < 12) {
                output_hr += (num_hrs % 24);
            } else {
                if (num_hrs % 24 > 12) {
                    output_hr += (num_hrs % 24) - 12;
                    time = "am";
                } else {
                    output_hr = 12;
                    time = "am";
                }
            }
            if (output_min >= 10) {
                System.out.println(output_hr + ":" + output_min + time);
            } else {
                System.out.println(output_hr + ":0" + output_min + time);
            }
        }
    }
}
