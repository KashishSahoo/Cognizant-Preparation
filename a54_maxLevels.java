public class a54_maxLevels {
    public static void main(String[] args) {
        int n=18;
        int ans=maxLevelss(n);
        System.out.println(ans);
    }
    public static int maxLevelss(int n){
        StringBuilder sb = new StringBuilder();
        while (n!=0) {
         int maxPowerOf2=calMaxPowOf2(n);
         sb.append(maxPowerOf2);
         n=n-maxPowerOf2;  
        }
        String str=sb.toString();
        return Integer.parseInt(str);
    }
    public static int calMaxPowOf2(int n){
        int res=1;
        while (res*2<=n) {
            res=res*2;
        }
        return res;
    }

}