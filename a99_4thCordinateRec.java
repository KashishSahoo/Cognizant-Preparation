public class a99_4thCordinateRec {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        //(x1+x3)/2=(x2+x4)/2;
        //(y1+y3)/2=(y2+y4)/2;
        System.out.print("Enter x1 y1: ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        System.out.print("Enter x2 y2: ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        System.out.print("Enter x3 y3: ");
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();

        // The fourth coordinate (x4, y4) of the rectangle
        int x4 = x1 + x3 - x2;
        int y4 = y1 +y2 - y2;

        System.out.println("The fourth coordinate is: (" + x4 + ", " + y4 + ")");
        sc.close();
    }
}
