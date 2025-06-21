public class a35_minOfFour {
    public static void main(String[] args) {
        int a=88,b=33,c=87,d=75;
        int min=Integer.MAX_VALUE;

        if(a<=b){
            min=a;
        }
        else{
        min=b;
        }
        if(c<=min){
            min=c;
        }
        if(d<=min){
            min=d;
        }
        System.out.println(min);

        //method-2
        min=Math.min(Math.min(a,b),Math.min(c,d));

        //method-3
        min=a;
        if(b<min) min=b;
        if(c<min) min=c;
        if(d<min) min=d;
    }
}
