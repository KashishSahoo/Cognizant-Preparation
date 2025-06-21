import java.util.Scanner;

public class a23_timeConversion{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter time in 12-hour format (e.g., 09:15:55PM): ");
        String time12 = sc.nextLine().trim();

        // Check minimum length and AM/PM ending
        if (time12.length() < 9 || 
            (!time12.toLowerCase().endsWith("am") && 
             !time12.toLowerCase().endsWith("pm"))) {
            System.out.println(" Invalid input format! Must be like hh:mm:ssAM or hh:mm:ssPM.");
            sc.close();
            return;
        }

        try {
            // Extract period (am/pm)
            String period = time12.substring(time12.length() - 2).toLowerCase();
            String timePart = time12.substring(0, time12.length() - 2); // Remove AM/PM
            String[] parts = timePart.split(":");

            // Validate correct splitting into 3 parts
            if (parts.length != 3) {
                System.out.println(" Invalid time format! Use hh:mm:ssAM or hh:mm:ssPM.");
                sc.close();
                return;
            }

            // Parse hour, minute, second
            int hour = Integer.parseInt(parts[0]);
            int minute = Integer.parseInt(parts[1]);
            int second = Integer.parseInt(parts[2]);

            // **Validation that handles invalid input like 78:90:09pm**
            // Hour must be between 1 and 12
            // Minute and Second must be between 0 and 59
            if (hour < 1 || hour > 12 || minute < 0 || minute > 59 || second < 0 || second > 59) {
                System.out.println(" Invalid time values! Hour should be 1–12, Minute & Second 0–59.");
                sc.close();
                return;
            }

            // Convert hour to 24-hour format
            if (period.equals("am")) {
                if (hour == 12) hour = 0;
            } else {
                if (hour != 12) hour += 12;
            }

            // Format output with leading zeros
            String hourStr = String.format("%02d", hour);
            String minuteStr = String.format("%02d", minute);
            String secondStr = String.format("%02d", second);

            // Output converted time
            System.out.println(" 24-hour format: " + hourStr + ":" + minuteStr + ":" + secondStr);

        } catch (NumberFormatException e) {
            System.out.println(" Invalid number! Please use digits only in hh:mm:ss.");
        } catch (Exception e) {
            System.out.println(" Unexpected error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
