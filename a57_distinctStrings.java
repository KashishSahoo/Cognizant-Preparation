import java.util.HashSet;

public class a57_distinctStrings {
    public static void main(String[] args) {
        String arr[]={"abc","ABC","aaa","yes","AAA","chant"};
        HashSet<String> set=new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i].toLowerCase());
        }
        System.out.println(set);
    }
}
