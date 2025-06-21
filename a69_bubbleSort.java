public class a69_bubbleSort {
    public static void main(String[] args) {
        int arr[] = { 7, 6, 6, 4, 1, 1, 2 };
        int n = arr.length;
        bubbleSort(arr, n);
        for (int i : arr) {
            System.out.print(i + " ");
        } 
    }
    
        
public static void bubbleSort(int arr[],int n){
    for(int i=0;i<n;i++){
        int flag=0;
        for(int j=0;j<n-i-1;j++){
            if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                flag=1;
            }
        }
        if(flag==0){
            break; // If no swaps were made, the array is sorted
        }
    }
}
}
