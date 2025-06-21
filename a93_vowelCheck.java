public class a93_vowelCheck {
    public static void main(String[] args) {
        String str = "education is powerful"; // You can change the string
        str = str.toLowerCase(); // make case-insensitive

        boolean a = false, e = false, i = false, o = false, u = false;

        for (char ch : str.toCharArray()) {
            switch (ch) {
                case 'a': a = true; break;
                case 'e': e = true; break;
                case 'i': i = true; break;
                case 'o': o = true; break;
                case 'u': u = true; break;
            }
        }

        if (a && e && i && o && u) {
            System.out.println("The string contains all vowels.");
        } else {
            System.out.println("The string does not contain all vowels.");
        }
    }
    public static boolean containsAllVowels(String str) {
        str = str.toLowerCase();
        return str.contains("a") && str.contains("e") && str.contains("i") &&
               str.contains("o") && str.contains("u");
    }
}
