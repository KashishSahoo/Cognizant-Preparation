import java.util.Scanner;

public class a9_noOfWords {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int cnt=0;
        String str=sc.nextLine();
        for(char ch:str.toCharArray()){
            if(Character.isUpperCase(ch)){
                cnt++;
            }
        }
        System.out.println(cnt+1);
    }
}
