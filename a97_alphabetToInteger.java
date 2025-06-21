public class a97_alphabetToInteger {
    public static void main(String[] args) {
        char ch = 'G'; // Starting character A-65 to 90,a-97-122 num 48-57
        int res=0;
        if (ch>='a' && ch<='z') {
            res=ch-96;
        }
        else if(ch>='A' && ch<='Z') {
            res=ch-64;
        }
        System.out.println(res);
    }
}
