import java.util.ArrayList;
 
public class a16_noOfDivisors {
    public static void main(String[] args) {
        int n=100;
        int c=0;
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=1;i<=n;i++){
            int cnt=countDiv(i);
            if(cnt==9){
                arr.add(i);
                c++;
            }
        }
        System.out.println(c);
        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+" ");
        }
        

    }
    public static int countDiv(int n){
        int cnt=0;
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                cnt++;
                if(n/i!=i){
                    cnt++;
                }
            }
        }
        return cnt;
    }

}
