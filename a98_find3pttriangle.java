public class a98_find3pttriangle {
    public static void main(String[] args) {
        int x1=11;
        int y1=12;
        int x2=22;
        int y2=28;
        int cx=16;
        int cy=88;

        //cx=(x1+x2+x3)/3
        //cy=(y1+y2+y3)/3

        int x3=3*cx-x1-x2;
        int y3=3*cy-y1-y2;

        System.out.println(x3+" "+y3);
    }
}
