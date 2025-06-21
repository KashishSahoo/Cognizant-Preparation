import java.util.HashMap;
import java.util.Map;

public class a89_charMaxFreqPattern {
    public static void main(String[] args) {
        String str="abbcdbbrrt";
        char maxChar=0;
        int maxFreq=0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
        }
        for(Map.Entry<Character,Integer>el:map.entrySet()){
            if(el.getValue()>maxFreq){
                maxChar=el.getKey();
                maxFreq=el.getValue();
            }
        }
        for(int i=1;i<=maxFreq;i++){
            for(int j=1;j<=i;j++){
                    System.out.print(maxChar);
            }
            System.out.println();
        }

    }
}
