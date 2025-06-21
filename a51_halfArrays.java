import java.util.Arrays;

public class a51_halfArrays {
    public static void main(String[] args) {
        int arr[]={1,2,3,10,20,30};
        int sum1=0;
        int sum2=0;
        int n=arr.length;
        for(int i=0;i<n/2;i++){
            sum1+=arr[i];
        }
        for(int i=n/2;i<n;i++){
            sum2+=arr[i];
        }
        if(sum1<sum2){
            for (int i = 0; i <n/2; i++) {
                int temp=arr[i];
                arr[i]=arr[n-i-1];
                arr[n-i-1]=temp;
            }
            System.out.println(Arrays.toString(arr));
        }
        else{
            System.out.println(Arrays.toString(arr));
        }

    }
}
