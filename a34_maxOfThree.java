public class a34_maxOfThree {
    public static void main(String[] args) {
        int a=90,b=76,c=77;
        int max=0;
        if(a>=b){
            max=a;
        }
        else {
            max=b;
        }
        if(c>=max){
            max=c;
        }
        System.out.println(max);

        //method-2
        max = Math.max(a, Math.max(b, c));

        //method-3

         max = a;
        if (b > max) max = b;
        if (c > max) max = c;

    }
}
