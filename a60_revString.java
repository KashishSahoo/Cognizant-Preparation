public class a60_revString {
    public static void main(String[] args) {
        String str="Hello World";
        String rev=revString(str);
        System.out.println(rev);
    }
    public static String revString(String str){
        char[] arr=str.toCharArray();
        int n=arr.length;
        for (int i = 0; i <n/2; i++) {
            char temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
        }
        return new String(arr);           
        }
    }

