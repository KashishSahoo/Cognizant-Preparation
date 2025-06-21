public class a20_pattern {
    public static void main(String[] args) {
        int r=5;
        int c=6;
        int arr[][]=new int[r][c];
        patternPrint2(arr,r,c);
        // System.out.println(Arrays.deepToString(arr));
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int[][] patternPrint(int arr[][],int r,int c){
     for(int i=0;i<c;i++){
        arr[0][i]=1;
     }
      for(int i=0;i<r;i++){
        arr[i][0]=1;
     }
      for(int i=0;i<r-1;i++){
        arr[i][c-1]=1;
     }
      for(int i=0;i<c;i++){
        arr[r-1][i]=1;
     }
     return arr;
    }
     public static void patternPrint2(int[][] arr, int r, int c) {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                // Set border cells to 1
                if (i == 0 || j == 0 || i == r - 1 || j == c - 1) {
                    arr[i][j] = 1;
                }
            }
        }
    }
}
