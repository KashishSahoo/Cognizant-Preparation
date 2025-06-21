import java.util.Arrays;

public class a90_SmallestNumberFromUnits {
    public static void main(String[] args) {
      int[] arr={66,89,34,12,75,90,76,89};
      int[] ans=new int[arr.length];

      for (int i = 0; i < arr.length; i++) {
        ans[i] = arr[i] % 10; // Extracting the unit digit
      }
      Arrays.sort(ans); // Sorting the array of unit digits
      int res=0;
      for(int num:ans){
        res=res*10+num; // Constructing the smallest number from unit digits
      }
      System.out.println(res); // Output the result
    }
}
