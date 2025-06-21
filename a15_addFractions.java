public class a15_addFractions {
    public static void main(String[] args) {
        //(1/2)+(3/2)=(4/2)=(2/1);
        int a=1,b=2;
        int c=3,d=2;
        int num=(a*d+b*c);
        int deno=(b*d);
        int hcf=HCF(num, deno);
        int n1=(num)/hcf;
        int n2=(deno)/hcf; 

        System.out.println(n1+" "+n2);
    }
     public static int HCF(int n1,int n2){
         while (n1%n2!=0) {
            int rem=n1%n2;
            n1=n2;
            n2=rem;
         }
         return n2;
    }
}
