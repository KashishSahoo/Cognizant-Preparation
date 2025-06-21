public class a50_asciiLuckyNo {
  public static void main(String[] args) {
    int n=5;
    String str="JAMES";
    char[] arr=new char[n+1];
    for(int i=1;i<=n;i++){
      arr[i]=str.charAt(i-1);
    }
    int prod=0;
    for(int i=1;i<=n;i++){
        if(i%2==1 || (int)arr[i]%2==1){
            prod=prod+(i*(int)arr[i]);
        }
    }
    System.out.println(prod);
  }
}
