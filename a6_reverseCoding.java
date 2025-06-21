public class a6_reverseCoding {
    public static void main(String[] args) {
        //10-5
        //15-8

        int n=7;
        int ans=cal(n);
        System.out.println(ans);
    }
    public static int cal(int n){
        int sum=0;
        for (int i = 1; i <=n; i++) {
            sum+=(i%2);
        }
        return sum;
    } 
}
