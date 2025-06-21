import java.util.Arrays;

public class a33_primeInRange {
    public static void main(String[] args) {
        int n=50;
        int[] arr=new int[n+1];
        sieve(arr);
        int start=20;
        int end=50;
        for(int i=start;i<=end;i++){
            if(arr[i]==1){
                System.out.print(i+" ");
            }
        }
    }
    static void sieve(int[] arr){
        Arrays.fill(arr,1);
        arr[0]=0;
        arr[1]=0;
        int n=arr.length;
        for(int i=2;i*i<n;i++){
           for(int j=i*i;j<n;j+=i){
            arr[j]=0;
           }
        }
    }
}
