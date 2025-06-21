public class a45_palindrome {
    public static void main(String[] args) {
        int n=121;
        int num=n;
        int rev=0;
        while (n!=0) {
           int rem=n%10;
           rev=rev*10+rem;
           n=n/10; 
        }
        if (rev==num) {
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
