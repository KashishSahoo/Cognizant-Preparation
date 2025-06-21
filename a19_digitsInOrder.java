public class a19_digitsInOrder {
    public static void main(String[] args) {
        int n=2017;
        // String ans=String.valueOf(n);
        // char arr[]=ans.toCharArray();
        // for(char ch:arr){
        //     System.out.print(ch+" ");
        // }
        int size=(int)Math.log10(n)+1;
        int arr[]=new int[size];
        int i=0;

        while (n!=0) {
            arr[i]=n%10;
            i++;
            n=n/10;
        }
        for(int j=arr.length-1;j>=0;j--){
             System.out.print(arr[j]+" ");
        }
    }
    void printDig(int n){
        int r;
        if(n==0){
            return;
        }
        r=n%10;
        printDig(n/10);
        System.out.print(r+" ");
    }
}
