class  a64_validAnagram{
    public boolean isAnagram(String s, String t) {
        int n=s.length();
        if(s.length()!=t.length()){
            return false;
        }
        int[] arr=new int[26];
        for(int i=0;i<n;i++){
            int idx1=s.charAt(i)-'a';
            arr[idx1]++;
            int idx2=t.charAt(i)-'a';
            arr[idx2]--;
        }
        for(int i=0;i<26;i++){
            if(arr[i]!=0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        a64_validAnagram obj = new a64_validAnagram();
        String s = "anagram";
        String t = "nagaram";
        System.out.println(obj.isAnagram(s, t)); // Output: true
    }
}
