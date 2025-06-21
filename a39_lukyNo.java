public class a39_lukyNo {
    public static void main(String[] args) {
        int n=1234;
        if(n<1000 ||n>9999){
            System.out.println("Invalid Range");
            return;
        }
        int sum=0;
        while (n!=0) {
            int rem=n%10;
            sum+=rem;
            n=n/10;
        }
        if(sum%3==0 || sum%5==0 || sum%7==0){
            System.out.println("Lucky Number");
        }
        else{
            System.out.println("Not Lucky Number");
        }
    }
}
