public class a14_gcdAndLcm {
    public static void main(String[] args) {
        int n1=98;
        int n2=56;

        int num1=n1;
        int num2=n2;

        int hcf=HCF(n1,n2);
        int lcm=LCM(num1,num2,hcf);

        System.out.println(hcf);
        System.out.println(lcm);

    }
    public static int HCF(int n1,int n2){
         while (n1%n2!=0) {
            int rem=n1%n2;
            n1=n2;
            n2=rem;
         }
         return n2;
    }
    public static int LCM(int n1,int n2,int hcf){
     int ans=(n1*n2)/hcf;
     return ans;
    }


}
