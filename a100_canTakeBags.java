public class a100_canTakeBags {
    public static void main(String[] args) {
        int a=8;
        int b=5;
        int c=7;
        int d=15;
        int e=6;

        if (a+b<=d && c<=e) {
            System.out.println("yes");
        }
         else if (b+c<=d && a<=e) {
            System.out.println("yes");
        }
        else if (a+c<=d && b<=e) {
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}
