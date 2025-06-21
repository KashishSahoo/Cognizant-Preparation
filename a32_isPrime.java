public class a32_isPrime {
    public static void main(String[] args) {
        int cnt=0;
        int n=37;
        for(int i=1;i*i<=n;i++){
          if(n%i==0){
            cnt++;
            if(n/i!=i){
                cnt++;
            }
          }
        } 
        if(cnt==2){
            System.out.println("prime");
        }
        else{
            System.out.println("not prime");
        }
    }
}
