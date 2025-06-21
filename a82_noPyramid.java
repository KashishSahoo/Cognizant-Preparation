public class a82_noPyramid {
    public static void main(String[] args) {
        int r = 4;
        int c = 7;
        for (int i = 1; i <= r; i++) {
            int k = 1;
            for (int j = 1; j <= c; j++) {
                if(j>=5-i && j<=3+i){
                System.out.print(k);
                k++;
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
