import java.util.Scanner;

public class a48_foodBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of pizzas bought:");
        int p=sc.nextInt();
        System.out.print("Enter no of puffs bought:");
        int pu=sc.nextInt();
        System.out.print("Enter no of cold drinks bought:");
        int c=sc.nextInt();

        int tot=p*100+pu*20+c*10;
        System.out.println("Bill Details");
        System.out.println("No of pizzas:"+p);
        System.out.println("No of puffs:"+pu);
        System.out.println("No of cold drinks:"+c);
        System.out.println("Total price="+tot); 

    }
}
