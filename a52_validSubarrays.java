public class a52_validSubarrays {
    public static void main(String[] args) {
        int n = 8;
        int idx = 0;
        int cnt = 0;
        int arr1[] = new int[3];
        int arr[] = { 1, 2, 1, 3, 5, 2, 4, 2 };
        for (int i = 0; i <= n-3; i++) {
            idx=0;
                for (int j = i; j < (i + 3); j++) {
                    arr1[idx] = arr[j];
                    idx++;
                }
            if (arr1[0] + arr1[2] == arr1[1]) {
                cnt++;
            }
        }
        System.out.println(cnt);

        // Optimized solution
         cnt = 0;

        for (int i = 0; i <= arr.length - 3; i++) {
            int a = arr[i];
            int b = arr[i + 1];
            int c = arr[i + 2];

            if (a + c == b) {
                cnt++;
            }
        }

        System.out.println(cnt);

    }
}
