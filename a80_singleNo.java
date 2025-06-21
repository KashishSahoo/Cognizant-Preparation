public class a80_singleNo {
    public static void main(String[] args) {
     int[] arr={9,9,7,8,8,7,5,4,4};
     int ans=0;
     for (int i = 0; i < arr.length; i++) {
        ans^=arr[i];
     }
     System.out.println(ans);
    }
}
