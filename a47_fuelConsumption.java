import java.util.Scanner;
public class a47_fuelConsumption {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of Liters to fill the tank:");
        double l=sc.nextDouble();
        System.out.println("Enter the distance covered:");
        double d=sc.nextDouble(); 

        double ans1=(l/d)*100;
        double nl=l*0.2642;
        double nd=d*0.6214;
        double ans2=(nd/nl);

        System.out.println("Liters/100KM");
        System.out.printf("%.2f",ans1);
        System.out.println();
         System.out.println("Miles/gallons");
        System.out.printf("%.2f",ans2);





    }
}
