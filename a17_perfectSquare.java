class a17_perfectSquare{
  public static void main(String[] args) {
    int n=26;
    int iv;
    double fl=Math.sqrt(n);
    iv=(int) fl;
    // if(iv==fl){
    //     System.out.println("Success");
    // }
    if((iv*iv)==n){
       System.out.println("Success");
    } 
    else{
        System.out.println("Failure");
    }
    

  }
}