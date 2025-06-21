import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class a59_buyGrocery {
    public static void main(String[] args) {
        int n1=3;
        int n2=4;
        int n3=5;
        String arr1[]={"A","B","C"};
        String arr2[]={"B","C","D","E"};
        String arr3[]={"B","C","D","E","F"};    

        HashSet<String> set1=new HashSet<>(Arrays.asList(arr1));
        HashSet<String> set2=new HashSet<>(Arrays.asList(arr2));
        HashSet<String> set3=new HashSet<>(Arrays.asList(arr3));

        HashMap<String,Integer> map=new HashMap<>();

       for(String str:set1){
        map.put(str,map.getOrDefault(str, 0)+1);
       }
        for(String str:set2){
        map.put(str,map.getOrDefault(str, 0)+1);
       }
        for(String str:set3){
        map.put(str,map.getOrDefault(str, 0)+1);
       }

       ArrayList<String> result=new ArrayList<>();

       for(Map.Entry<String,Integer> el:map.entrySet()){
        if(el.getValue()>=2){
            result.add(el.getKey());
        }
       }
      

    //    if(result.isEmpty()){
    //      ans[]= new String[]{"-1"};
    //    }
    // else{
     Collections.sort(result); // Lexicographic order
       String ans[]= result.toArray(new String[0]);
    //    }

    System.out.println(Arrays.toString(ans));






    }
}
