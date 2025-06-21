public class a29_factorial {
    public static void main(String[] args) {
        int n=5;
        int fact=1;
       for(int i=2;i<=n;i++){
        fact=fact*i;
       }
      fact=factorial(n);
      System.out.println(fact);
       
    }
    public static int factorial(int n){
        if(n==0){
            return 1;
        }

        return (n)*factorial(n-1);
  }
}
