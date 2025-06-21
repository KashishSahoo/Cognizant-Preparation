import java.util.ArrayList;

public class a68_mergeSort {
    public static void main(String[] args) {
        int arr[] = { 7, 6, 6, 4, 1, 1, 2 };
        int n = arr.length;
        mergeSort(arr, 0, n - 1);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    public static void mergeSort(int arr[],int l,int h){
        if (l<h) {
            int mid=(l+h)/2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid+1, h);
            merge(arr,l,mid,h);

        }
    }
    public static void merge(int arr[],int low,int mid,int high){
        ArrayList<Integer> temp=new ArrayList<>();
        int left=low;
        int right=mid+1;

        while (left<=mid && right<=high) {
            if(arr[left]<=arr[right]){
                temp.add(arr[left]);
                left++;
            }
            else{
                temp.add(arr[right]);
                right++;
            }
        }
        while (left<=mid) {
             temp.add(arr[left]);
                left++;
        }
        while (right<=high) {
            temp.add(arr[right]);
            right++;
            
        }
        for(int i=low;i<=high;i++){
            arr[i]=temp.get(i-low);
        }
    }
    
}
