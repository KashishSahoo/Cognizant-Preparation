public class a94_busGame {
    public static void main(String[] args) {
        int r = 3;
        int c = 4;
        int k = 1;
        String[][] arr = new String[r][c];  //  Change to String matrix

        // Fill the matrix
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (k % 5 == 0) {
                    arr[i][j] = "bus";  //  Replace 100 with "bus"
                } else {
                    arr[i][j] = String.valueOf(k);  // Convert number to string
                }
                k++;
            }
        }

        // Print the matrix
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
