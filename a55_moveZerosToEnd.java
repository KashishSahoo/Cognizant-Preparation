import java.util.Arrays;

public class a55_moveZerosToEnd {
    public static void main(String[] args) {
        int arr[]={9,0,8,7,0,8,0,7,0,0,7,8,9};
        int n=arr.length;
        int i;
        for ( i = 0; i < arr.length; i++) {
            if(arr[i]==0){
                break;
            }
        }
        for (int j2 = i+1; j2 < arr.length; j2++) {
            if(arr[j2]!=0){
           swap(arr,i,j2);
            i++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void swap(int arr[],int l,int r){
        int temp;
        temp=arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
    }
}
