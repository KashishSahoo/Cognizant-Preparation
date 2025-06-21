public class a62_missNo {
    public static void main(String[] args) {
        int arr[]={1,6,4,4,3,2};
        int n=arr.length;
        int tsum=(n*(n+1))/2;
        int sum=0;

        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        int ans=Math.abs(tsum-sum);
        System.out.println(ans);
    }
}
