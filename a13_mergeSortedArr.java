import java.util.Arrays;

public class a13_mergeSortedArr {
    public static void main(String[] args) {
        int[] arr1={23,45,67,89};
        int[] arr2={12,55,77,90,100,108};
        int n=arr1.length;
        int m=arr2.length;

        int[] ans=new int[n+m];

        int i=0,j=0,idx=0;
        while (i<n && j<m) {
            if (arr1[i]<arr2[j]) {
                ans[idx]=arr1[i];
                idx++;
                i++;
            }
            else{
                ans[idx]=arr2[j];
                idx++;
                j++;
            }
        }
        while (i<n) {
                ans[idx]=arr1[i];
                idx++;
                i++; 
        }
        while (j<m) {
              ans[idx]=arr2[j];
                idx++;
                j++;
        }
        System.out.println(Arrays.toString(ans));

    }
}
