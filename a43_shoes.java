public class a43_shoes {
    public static void main(String[] args) {
        String str = "5 7R 7L 8R 10R 10L";
        String arr[] = str.split(" ");
        int n = Integer.parseInt(arr[0]);
        char reqP = 0;
        int size = 0;
        char pos;
        int cnt = 0;

        for (int i = 1; i <= n; i++) {
            if (arr[i] != null) {
                size = Integer.parseInt(arr[i].substring(0, arr[i].length() - 1));
                pos = arr[i].charAt(arr[i].length() - 1);
                if (pos == 'L') {
                    reqP = 'R';
                } else {
                    reqP = 'L';
                }
            } else {
                continue; // skip if arr[i] is null
            }

            for (int j = 1; j <= n; j++) {
                if (arr[j] != null) {
                    int sizeT = Integer.parseInt(arr[j].substring(0, arr[j].length() - 1));
                    char posT = arr[j].charAt(arr[j].length() - 1);
                    if (sizeT == size && posT == reqP) {
                        cnt++;
                        arr[i] = null;
                        arr[j] = null;
                        break;  // break after pairing to avoid multiple counts for same i
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}
// The code takes a string input representing shoe sizes and positions (left/right) and counts the number of pairs of shoes that can be formed.