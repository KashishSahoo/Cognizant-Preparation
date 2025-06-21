import java.util.*;

public class a44_opShoes {
    public static void main(String[] args) {
        String str = "5 7R 7L 8R 10R 10L";
        String[] arr = str.split(" ");
        int n = Integer.parseInt(arr[0]);

        Map<Integer, Integer> leftCount = new HashMap<>();
        Map<Integer, Integer> rightCount = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            String shoe = arr[i];
            int size = Integer.parseInt(shoe.substring(0, shoe.length() - 1));
            char pos = shoe.charAt(shoe.length() - 1);

            if (pos == 'L') {
                leftCount.put(size, leftCount.getOrDefault(size, 0) + 1);
            } else {
                rightCount.put(size, rightCount.getOrDefault(size, 0) + 1);
            }
        }

        int cnt = 0;
        for (int size : leftCount.keySet()) {
            if (rightCount.containsKey(size)) {
                cnt += Math.min(leftCount.get(size), rightCount.get(size));
            }
        }

        System.out.println(cnt); 
    }
}
