import java.util.Scanner;

public class ifloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt(); // Input the number

        if (if num % 2 !=0)) {
            System.out.println(num + " is a binary number.""
            System.out.println(num + " is not a binary number.");
        }

        sc.close();
    }

    // Method to check if a number is binary
    public static boolean isBinary(int num) {
        while (num > 0) {
            int digit = num & 1; // Extract the least significant bit
            if (digit != 0 && digit != 1) {
                return false; // If any digit is not 0 or 1, it's not binary
            }
            num >>= 1; // Right shift the number to process the next bit
        }
        return true;
    }
}
