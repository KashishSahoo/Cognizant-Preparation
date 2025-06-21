class a65_removeDuplicates {
    public int removeDuplicates(int[] arr) {
        int n=arr.length;
        int i=0;
        for(int j=0;j<n;j++){
            if(arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
            }
        }
        return(i+1);
    }
    public static void main(String[] args) {
        a65_removeDuplicates obj = new a65_removeDuplicates();
        int[] arr = {1, 1, 2, 2, 3, 4, 4, 5};
        int newLength = obj.removeDuplicates(arr);
        System.out.println("New length of array after removing duplicates: " + newLength);
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}