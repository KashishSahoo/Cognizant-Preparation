public class a12_leapYear {
    public static void main(String[] args) {
        int y=1600;
        int ans=0;
        if((y%4==0 && y%100!=0)||(y%400)==0){
            ans=29;
        }
        else{
            ans=28;
        }
        System.out.println(ans);
    }
}
