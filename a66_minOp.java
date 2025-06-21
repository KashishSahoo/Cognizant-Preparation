import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeSet;

public class a66_minOp {
    public static void main(String[] args) {
        int arr[]={7,6,6,4,1,1,2};
        int n=arr.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        TreeSet<Integer> set=new TreeSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        int cnt=0;
            for(int i=1;i<=n;i++){
                if(map.get(i)==null){
                  set.add(i);
                  cnt++;
                }
            }
            int idx=0;
            for(int num:set){
                arr[idx]=num;
                idx++;
            }
            System.out.println(Arrays.toString(arr));
            System.out.println("Missing Count: "+cnt);
           
    }
}
