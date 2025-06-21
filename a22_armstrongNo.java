public class a22_armstrongNo {
    public static void main(String[] args) {
        int n=1634;
        int num=n;
        int sum=0;
        int size=(int)Math.log10(n)+1;

        while (n!=0) {
            int rem=n%10;
            sum+=Math.pow(rem, size);
            n=n/10;
        }
        if(num==sum){
            System.out.println("Armstrong no");
        }
        else{
            System.out.println("Not Armstrong no");
        }

        
    }
}
