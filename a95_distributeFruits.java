public class a95_distributeFruits {
    public static void main(String[] args) {
//         Problem:
// Ram went to a programming contest to distribute apples and oranges.
// He has N apples and M oranges, and he wants to:
// Distribute them equally among contestants.
// No fruit should be left over.
// Goal:
// Find the maximum number of contestants such that:
// Each gets an equal number of apples and oranges.
// No fruit remains.
  int apples = 12; // Number of apples 3 3 3 3,0 2 2 2 2
  int oranges = 8; // Number of oranges    
  
  int ans= findMaxContestants(apples, oranges);
  System.out.println("Maximum number of contestants: " + ans);
  

    }
    public static int findMaxContestants(int apples, int oranges) {
        // Find the GCD of apples and oranges
        int a=apples;
        int b=oranges;
        while (a%b!=0) {
            int rem=a%b;
            a=b;
            b=rem;
        }
        return b;
       
    }
}
