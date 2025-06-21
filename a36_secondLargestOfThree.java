public class a36_secondLargestOfThree {
    public static void main(String[] args) {
        int a=90,b=67,c=99;
        int Smax=0;

        if(a>=b && a>=c){
            if(b>=c){
                Smax=b;
            }
            else{
                Smax=c;
            }
        }
        else if(b>=a && b>=c){
            if(a>=c){
                Smax=a;
            }
            else{
                Smax=c;
            }
        }
        else{
            if(a>=b){
                Smax=a;
            }
            else{
                Smax=b;
            }
        }
        System.out.println(Smax);
        
    }
}
