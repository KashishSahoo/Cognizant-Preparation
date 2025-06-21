import java.util.*;

public class a42_Marks {

//     3
// AAA 21 A Female
// BBB 14 B Male
// CCC 24 C Female
// AAA CCC 
// 66
   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int avg=0;
        int cnt=0;
        ArrayList<String> above20=new ArrayList<>();
        sc.nextLine();
        for(int i=0;i<n;i++){
            String[] details=sc.nextLine().split(" ");
            String name=details[0];
            int age=Integer.parseInt(details[1]);
            char grade=details[2].charAt(0);
            String gender=details[3];

            if(age>20){
                above20.add(name);
            }
            if(gender.equalsIgnoreCase("Female")){
             avg+=(int)grade;
             cnt++;
            }

        }
        for(String str:above20){
            System.out.print(str+" ");
        }
        System.out.println();
        System.out.println(avg/cnt);
    }
}

