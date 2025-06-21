import java.util.Arrays;

public class a58_impactSum {
    public static void main(String[] args) {
        int n=4;
        int arr[]={1,2,3,4};
        int c=10;

        int sum=0;
        for (int i = 0; i < arr.length; i++) {
          sum+=arr[i];  
        } 
        for (int i = 0; i < arr.length; i++) {
            int impact=sum-arr[i];
            if(impact<c){
                arr[i]=impact;
            }
            else{
                arr[i]=c;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
} 
