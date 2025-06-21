public class a31_GCD {
   public static void main(String[] args) {
    int a=18,b=36;
    int hcf=gcd(a,b);
    System.out.println(hcf);
   } 
   public static int gcd(int a,int b){
    if(a==0) return b;
    if(b==0) return a;
    if(a==b) return a;
    if(a>b) return gcd(a-b,b);
    return gcd(a,b-a);
   }
}
