import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class a63_duplicates {
    public static void main(String[] args) {
        int[] arr={1,5,8,9,8,9,6,5,4,3};
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);   
        }
        ArrayList<Integer> ans=new ArrayList<>();
        for(Map.Entry<Integer,Integer>el:map.entrySet()){
            if(el.getValue()>1){
              ans.add(el.getKey());
            }
        }
        System.out.println(ans);
    }
}
