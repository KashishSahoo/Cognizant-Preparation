import java.util.Scanner;

public class a49_noToChar {
    public static void main(String[] args) {
        int n=65666768;
        int arr[]=new int[4];
        int idx=0;
        while (n!=0) {
            int rem=n%100;
            arr[idx]=rem;
            idx++;
            n=n/100;
        }
        for(int i=arr.length-1;i>=0;i--){
          int num=arr[i];
          System.out.println(arr[i]+"-"+(char)arr[i]);
        }
        func1();
    }
    public static void func(){
        System.out.println("Enter 4 numbers= ");
        Scanner sc=new Scanner(System.in);
        String[] str=sc.nextLine().split(" ");
        if(str.length!=4){
            System.out.println("Please enter 4 numbers");
            return;
        }
        for(String s:str){
            int n=Integer.parseInt(s);
            char ch=(char)n;
            System.out.println(n+"-"+ch+" ");
        }
    }
    public static void func1(){
        String n="65666768";
        for(int i=0;i<n.length();i+=2){
            String twoDig=n.substring(i, i+2);
            int ascii=Integer.parseInt(twoDig);
            char ch=(char)ascii;
            System.out.println(ascii+"-"+ch);
        }
    }

}
