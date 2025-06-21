import java.util.Scanner;

public class a46_highestPlacement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String h = null;
        System.out.print("Enter no of placements in CSE:");
        int cse = sc.nextInt();
        System.out.print("Enter no of placements in ECE:");
        int ece = sc.nextInt();
        System.out.print("Enter no of placements in MECH:");
        int mech = sc.nextInt();
        int[] arr = { cse, ece, mech };

        int max = Math.max(cse, Math.max(ece, mech));
        System.out.println("Highest Placement:");
        for (int i = 0; i < arr.length; i++) {
            if (max == arr[0]) {
                h = "CSE";
                break;
            } else if (max == arr[1]) {
                h = "ECE";
                break;
            } else {
                h = "MECH";
                break;
            }
        }

        System.out.println(h);

    }
}
