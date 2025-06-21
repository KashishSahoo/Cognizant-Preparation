public class a96_totalNoOfDays {
    public static void main(String[] args) {
        int[] years={2023,1988,2020};
        int totalDays = 0;
        for (int year : years) {
            totalDays += calculateDaysInYear(year);
        }
        System.out.println(totalDays);
    }
    public static int calculateDaysInYear(int year) {
        if (year < 1) {
            return 0; // Invalid year
        }
        if (isLeapYear(year)) {
            return 366; // Leap year
        } else {
            return 365; // Non-leap year
        }
    }
    public static boolean isLeapYear(int year) {
        if(year%4==0 && year%100!=0){
            return true;
        }
        else if(year%400==0){
            return true;
        }
        else{
            return false;
        }
    }
}
