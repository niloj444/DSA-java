public class Reverse {
    public static void main(String[] args) {

                int num =  1234;   // example number
                int rev = 0;       // variable to store reversed number

                while (num > 0) {
                    int remainder = num % 10;          // extract last digit
                    //zrev = rev * 10 + remainder;        // build reversed number
                    num = num / 10;                    // remove last digit
                    rev = rev * 10 + remainder;        // build reversed number
                }

                System.out.println("Reversed number: " + rev);
    }
}


