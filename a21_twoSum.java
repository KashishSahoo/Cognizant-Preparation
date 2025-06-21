import java.util.Arrays;
import java.util.HashMap;

public class a21_twoSum {
    public static void main(String[] args) {
        int sum=12;
        int arr[]={10,2,5,7,9,6,10,20,18};
        boolean ans=twoSum2(arr,sum);
        System.out.println(ans);
    }
    public static boolean twoSum1(int arr[],int sum){
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=arr.length;
        for(int i=0;i<n;i++){
            int req=sum-arr[i];
            if(map.containsKey(req)){
                return true;
            }
            map.put(arr[i],i);
        }
        return false;
    }
    public static boolean twoSum2(int arr[],int sum){
        Arrays.sort(arr);
        int n=arr.length;
        int l=0;
        int r=n-1;
        while (l<r) {
            if(arr[l]+arr[r]==sum){
                return true;
            }
            else if(arr[l]+arr[r]<sum){
                l++;
            }
            else{
                r--;
            }
        }
        return false;

    }

}
