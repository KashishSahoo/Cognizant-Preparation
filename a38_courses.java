import java.util.Scanner;

public class a38_courses {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter No Of Courses:");
        int n=sc.nextInt();
          sc.nextLine(); // Clear buffer
        if(n<=0 || n>20){
            System.out.println("Invalid Range");
            return;
        }
        String[] arr=new String[n];
        System.out.println("Enter course names:");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextLine();
        }
        System.out.println("Enter the course to be searched");
        String str=sc.nextLine();
         boolean f = false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].equals(str)){
               f=true;
                System.out.println(str+" Course is Availiable");
                break;
            }
        }
        if(!f){
        System.out.println("Course not found");
        }



    }
}