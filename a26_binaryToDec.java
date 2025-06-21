public class a26_binaryToDec {
    public static void main(String[] args) {
        int ans=0;
        int n=1101;
        int size=(int)Math.log10(n)+1;
        for(int i=0;i<size;i++){
         int r=n%10;
         ans+=r*(int)Math.pow(2, i);
         n=n/10;
        }
        System.out.println(ans);
    }
}
