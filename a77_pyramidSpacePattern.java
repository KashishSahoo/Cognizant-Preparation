public class a77_pyramidSpacePattern {
    public static void main(String[] args) {
        int r = 5;
        int c = 9;
        int k = 1;
        for (int i = 1; i <= r; i++) {
             k=1;
            for (int j = 1; j <= c; j++) {
                if (j >= 6 - i && j <= 4 + i &&k==1) {
                    System.out.print("*");
                    k=0;
                } else {
                    System.out.print(" ");
                    k=1;
                }
            }
            System.out.println();

        }
    }
}
