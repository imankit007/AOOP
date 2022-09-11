import java.util.Scanner;

public class a1q2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int input = sc.nextInt();
        sc.close();

        try {
            if (input < 0) {
                throw new NegativeNumberNotAllowedException();
            } else {
                try {
                    if (isPrime(input)) {
                        System.out.println("The number is prime");
                    } else {
                        throw new NumberNotPrimeException();
                    }
                } catch (NumberNotPrimeException e) {
                    e.printStackTrace();
                }
            }
        } catch (NegativeNumberNotAllowedException e) {
            e.printStackTrace();
        }

    }

    public static boolean isPrime(int num) {

        for (int i = 2; i < num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

class NegativeNumberNotAllowedException extends Exception {
    NegativeNumberNotAllowedException() {
        System.out.print("Negative numbers are not allowed as input!!");
    }
}

class NumberNotPrimeException extends Exception {
    NumberNotPrimeException() {
        System.out.println("The number entered is not prime!!");
    }
}