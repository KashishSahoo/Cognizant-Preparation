public class a40_salInc {
    public static void main(String[] args) {
        double sal=8000;
        double incSal = 0;
        int rate=3;

        if(sal<=0 || (rate<1 || rate>5)){
            System.out.println("invalid input");
            return;
        }
        if(rate>=1 && rate<=3){
            incSal=sal*0.1;
        }
        else if(rate>=3.1 && rate<=4){
            incSal=sal*0.25;
        }
           if(rate>=4.1 && rate<=5){
            incSal=sal*0.3;
        }
        sal=sal+incSal;
        System.out.println((int)sal);
        
    }
}
