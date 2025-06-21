public class a2_horseJumb {

    public static void main(String[] args) {
        //0 1 2 4 8 16
        int goal=1024;
        boolean canJump=ans3(goal);
        System.out.println(canJump);
    }
    public static boolean ans1(int goal){
        int pos=0;
        int jump=1;
        while (pos<goal) {
            pos=pos+jump;
            jump=pos;
        }
        return pos==goal;
    }
    public static boolean ans2(int goal){
        int n=goal;

        if((n&(n-1))==0){
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean ans3(int goal){
        int n=goal;
        if(n<=0){
            return false;
        }
        double res=Math.log10(n)/Math.log10(2);
        return res==(int)res;
    }



}