public class a53_binarySearch {
    public static void main(String[] args) {
        int arr[]={33,44,56,78,98,100,108,890};
        int key=108;
        int n=arr.length;
        int l=0;
        int h=arr.length-1;
        while (l<=h) {
            int mid=l+(h-l)/2;
            if(arr[mid]==key){
            System.out.println(mid);
              return;
            }
            else if(arr[mid]<key) l=mid+1;
            else h=mid-1;
        }
    }
}
