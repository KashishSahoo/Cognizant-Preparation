public class a5_workDistribution {
    public static void main(String[] args) {
        //A-X DAYS
        //B-Y DAYS
        //C-Z DAYS
        //TOGETHER IN HOW MANY DAYS
       int x=3;
       int y=4;
       int z=5;

       int ans=(x*y*z)/((x*y)+(y*z)+(z*x));
       System.out.println(ans);
        
    }
}
