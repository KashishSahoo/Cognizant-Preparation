public class a24_decimalToBinary {
    public static void main(String[] args) {
        StringBuilder str=new StringBuilder();
        int decimal=13;
        // while (n!=0) {
        //     str.append(n%2);
        //     n=n/2;
        // }
        // str.reverse();
        // System.out.println(str);
         int[] binary = new int[32]; // max 32 bits for an int
        int index = 0;

        while (decimal > 0) {
            binary[index] = decimal % 2;
            index++;
            decimal = decimal / 2;
        }

        System.out.print("Binary representation: ");
        for (int i = index - 1; i >= 0; i--) {
            System.out.print(binary[i]);
        }
    }
        public static int decimalToBinary(int decimal) {
        int binary = 0;
        int place = 1;

        while (decimal > 0) {
            int remainder = decimal % 2;
            binary += remainder * place;  // Add remainder at the correct place
            place *= 10;                  // Move to next binary digit position
            decimal /= 2;                 // Divide decimal by 2
        }

        return binary;
    }
}