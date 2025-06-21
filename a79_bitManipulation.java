public class a79_bitManipulation {
public static void main(String[] args) {
    int ans=countFlip(10,7);
    System.out.println(ans);
}
public static boolean checkIthBit(int n,int i){
    if((n&(1<<i))!=0){
        return true;  //1101
    }
    return false;
                 
}

public static int clearIthBit(int n,int i){
   int ans=(n&~(1<<i));
   return ans;
                 
}
public static int toggleIthBit(int n,int i){
   int ans=(n^(1<<i));
   return ans;
                 
}

public static int unsetLastSetBit(int n){
   int ans=(n&n-1);
   return ans;
                 
}
public static boolean powerOf2(int n){
    if((n&(n-1))==0){
        return true;  //1101
    }
    return false;               
}
public static int countSetBits(int n){
   int cnt=0;
   while (n!=0) {
    n=(n&(n-1));
    cnt++;
   }
   return cnt;
                 
}
public static int setLastSetBit(int n){
   int ans=(n|n+1);
   return ans;
                 
}

public static int countFlip(int a,int b){
   int ans=(a^b);
   int res=countSetBits(ans);
   return res;
                 
}





}


