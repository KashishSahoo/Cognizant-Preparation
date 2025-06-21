public class a41_mod11 {
    public static void main(String[] args) {
      String str="13589234356546756";
      int n=11;
      int rem=0;
      for (int i = 0; i <str.length(); i++) {
        int digit=str.charAt(i)-'0';
        rem=(rem*10+digit)%n;
      }
      System.out.println(rem);
    }
}
