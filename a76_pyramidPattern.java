public class a76_pyramidPattern {
    public static void main(String[] args) {
        int r=5;
        int c=9;
        for(int i=1;i<=r;i++){
        for(int j=1;j<=c;j++){
           if(j>=6-i && j<=4+i){
            System.out.print("*");
           }
           else{
            System.out.print(" ");
           }
        }
        System.out.println();

        }
    }
}
