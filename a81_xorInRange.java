public class a81_xorInRange {
    public static void main(String[] args) {
        int n = 4;
        int ans=xorValue(n);

    }

    public static int xorValue(int n) {
        if (n % 4 == 1) {
            return 1;
        } else if (n % 4 == 2) {
            return n+1;
        }
        else if (n % 4 == 3) {
            return 0;
        }
       else if (n % 4 == 0) {
            return n;
        }
        return n;
    }
    public static int xorInRange(int l,int h) {
        int ans=(xorValue(h))^((xorValue(l-1)));
        return ans;

    }

}
