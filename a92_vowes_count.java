public class a92_vowes_count {
    public static void main(String[] args) {
        String str="miscellaneous";
        int acnt=0;
        int ecnt=0;
        int icnt=0;
        int ocnt=0;
        int ucnt=0;

        for(char ch:str.toCharArray()) {
            if(ch=='a' || ch=='A') {
                acnt++;
            } else if(ch=='e' || ch=='E') {
                ecnt++;
            } else if(ch=='i' || ch=='I') {
                icnt++;
            } else if(ch=='o' || ch=='O') {
                ocnt++;
            } else if(ch=='u' || ch=='U') {
                ucnt++;
            }
        }
        System.out.println("Count of vowels in the string \"" + str + "\":");
        System.out.println("A/a: " + acnt);
        System.out.println("E/e: " + ecnt);
        System.out.println("I/i: " + icnt);
        System.out.println("O/o: " + ocnt);
        System.out.println("U/u: " + ucnt);
        int totalVowels = acnt + ecnt + icnt + ocnt + ucnt;
    }
}
