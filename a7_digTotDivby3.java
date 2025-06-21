public class a7_digTotDivby3 {
    public static void main(String[] args) {
        int[] arr={40,50,90};
        int n=arr.length;
        // int sum=0;
        // for(int i=0;i<n;i++){
        //     sum+=sumOfDig(arr[i]);
        // }
        
        // boolean ans;
        // sum=sumOfDig(sum);
        // if(sum%3==0) ans= true;
        // else ans=false;
        // System.out.println(ans);
        boolean ans;

        int rem=0;
        for (int i = 0; i <n; i++) {
            rem=(rem+arr[i])%3;
        }
        if(rem==0){
            ans=true;
        }
        else{
            ans=false;
        }
        System.out.println(ans);
    }
    public static int sumOfDig(int n){
        int sum=0;
        while (n!=0) {
            int rem=n%10;
            sum=sum+rem;
            n=n/10;
        }
        return sum;
    }
}
