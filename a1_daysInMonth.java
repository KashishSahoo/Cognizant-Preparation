import java.util.*;
public class a1_daysInMonth {
    public static void main(String[] args) {
        try (// String inputDate = "09-03-2003"; // Format: dd-MM-yyyy
        Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter date in dd-MM-yyyy format");

            String inputDate = sc.nextLine(); // Read the date from user input

            // Split the date
            String[] parts = inputDate.split("-");
            int month = Integer.parseInt(parts[1]); 
            int year = Integer.parseInt(parts[2]);

            int daysInMonth = 0;

            // Logic to find number of days in month
            switch(month) {
                case 1: case 3: case 5: case 7:
                case 8: case 10: case 12:
                    daysInMonth = 31;
                    break;
                case 4: case 6: case 9: case 11:
                    daysInMonth = 30;
                    break;
                case 2:
                    // Leap year check
                    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                        daysInMonth = 29;
                    } else {
                        daysInMonth = 28;
                    }
                    break;
                default:
                    System.out.println("Invalid month");
                    return;
            }

            System.out.println("Number of days in month: " + daysInMonth);
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
