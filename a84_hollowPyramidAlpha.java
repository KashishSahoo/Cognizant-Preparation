public class a84_hollowPyramidAlpha {
    public static void main(String[] args) {
        int r = 4;
        int c = 7;
        for (int i = 1; i <= r; i++) {
            char k = 'A';
            for (int j = 1; j <= c; j++) {
                if (j <= 5 - i || j >= 3 + i) {
                    System.out.print(k);
                    k++;
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
}
