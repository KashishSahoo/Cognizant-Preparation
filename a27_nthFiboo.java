public class a27_nthFiboo {
   public static void main(String[] args) {
    int n=9;
    int a=0,b=1;
    int c = 0;
    for(int i=2;i<=n;i++){
      c=a+b;
      a=b;
      b=c;
    }
    System.out.println(c);
   } 
   public static int fibo(int n){
    int arr[]=new int[n+1];
    arr[0]=0;
    arr[1]=1;
    for(int i=2;i<=n;i++){
        arr[i]=arr[i-1]+arr[i-2];
    }
    return arr[n];
   }
}
