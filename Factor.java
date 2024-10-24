import java.util.Scanner;

public class Factor {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        System.out.println("Factors of " + num + ":");
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(" " + i);
            }
        }
        
        System.out.println("\nPrime factors of " + num + ":");
        for (int i = 1; i <= num; i++) {
            if (num % i == 0 && isPrime(i)) {
                System.out.print(" " + i);
            }
        }

        System.out.println("\nNon-prime factors of " + num + ":");
        for (int i = 1; i <= num; i++) {
            if (num % i == 0 && !isPrime(i)) {
                System.out.print(" " + i);
            }
        }
    }
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
