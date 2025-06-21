import java.util.Arrays;

public class a56_segregate0sAnd1s {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 0, 1, 0, 1, 1, 1, 0, 0, 1 };
        int n = arr.length;
        int ptr1 = 0;
        int ptr2 = n - 1;

        while (ptr1 < ptr2) {
            if (arr[ptr1] == 1 && arr[ptr2] == 0) {
                int temp;
                temp = arr[ptr1];
                arr[ptr1] = arr[ptr2];
                arr[ptr2] = temp;
            } else if (arr[ptr1] == 0) {
                ptr1++;
            } else if (arr[ptr2] == 1) {
                ptr2--;
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
