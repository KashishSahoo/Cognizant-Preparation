public class a61_secondLargest {
    public static void main(String[] args) {
        int arr[]={88,90,90,87,100,65,77,88,900};
        int fl=Integer.MIN_VALUE;
        int sl=Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>fl){
                sl=fl;
                fl=arr[i];
            }
            else if(arr[i]>sl && sl!=fl){
                sl=arr[i];
            }
        }
        System.out.println(sl);

    }
}
