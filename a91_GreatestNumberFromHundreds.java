import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class a91_GreatestNumberFromHundreds {
    public static void main(String[] args) {
        int[] arr = {1234, 456, 7823, 32, 943};
        List<Integer> hundreds = new ArrayList<>();

        // Step 1: Extract 100th place digits
        for (int num : arr) {
            int digit = (num / 100) % 10;
            hundreds.add(digit);
        }

        // Step 2: Sort in descending order
        Collections.sort(hundreds, Collections.reverseOrder());

        // Step 3: Form the number
        int result = 0;
        for (int digit : hundreds) {
            result = result * 10 + digit;
        }

        System.out.println("Greatest number formed from 100th digits: " + result);
    }
}