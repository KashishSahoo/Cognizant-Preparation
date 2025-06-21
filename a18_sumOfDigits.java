public class a18_sumOfDigits {
    public static void main(String[] args) {
        int n=123;
        int sum=0;
        while (n!=0) {
            int rem=n%10;
            sum+=rem;
            n=n/10;
        }
        // int ans=(int)Math.log10(n)+1; no of digits
        System.out.println(sum);
    }
}
