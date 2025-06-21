import java.util.Scanner;

public class a10_countNoOfGoals {
    public static void main(String[] args) {
        int x,y,z;
        int cnt1=0,cnt2=0;
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        y=sc.nextInt();
        z=sc.nextInt();

        while (z!=1) {
            if(x%z==0){
              cnt1++;
              x--;
            }
            if(y%z==0){
             cnt2++;
             y--;
            }
            z--;
        }
        System.out.println(cnt1+" "+cnt2);
       }
}
