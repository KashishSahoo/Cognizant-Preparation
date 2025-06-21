import java.util.Scanner;

public class a8_findStartingPt {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x,y;
        int cx=sc.nextInt();
        int cy=sc.nextInt();
        int n=sc.nextInt();

        for (int i = 0; i < n; i++)    
        {
            x=sc.nextInt();
            y=sc.nextInt();

            cx-=x;
            cy-=y;
        }
        System.out.println(cx+" "+cy);
    }
}
