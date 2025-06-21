public class a25_decTohexa {
    public static void main(String[] args) {
      int n=255;
      StringBuilder str=new StringBuilder();
      while (n!=0) {
        int rem=n%16;
        if(rem<10){
            str.append(rem);
        }
        else{
            char ch=(char)('A'+rem-10);
            str.append(ch);
        }
        n=n/16;
      }  
        str.reverse();
        System.out.println(str);
        // String hex = Integer.toHexString(n).toUpperCase();
    }
}
