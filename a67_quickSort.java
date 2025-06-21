public class a67_quickSort {
    public static void main(String[] args) {
        int arr[] = { 7, 6, 6, 4, 1, 1, 2 };
        int n = arr.length;
        quickSort(arr, 0, n - 1);
        for (int i : arr) {
            System.out.print(i + " ");
        }

    }
    static public void quickSort(int arr[],int l,int h){
        if(l<h){
            int p=partition(arr, l, h);
            quickSort(arr, l, p-1);
            quickSort(arr, p+1, h);
        }
    }
    static public int partition(int arr[],int l,int h){
        int piviot=arr[l];
        int i=l+1;
        int j=h;
        while (i<j) {
            while (i<=h && arr[i]<=piviot) {
                i++;
            }
            while (j>=l && arr[j]>piviot) {
                j--;
            }
            if(i<j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[l];
        arr[l]=arr[j];
        arr[j]=temp;
        return j;
    }
}
