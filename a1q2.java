import java.util.Scanner;

public class a1q2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int input = sc.nextInt();
        sc.close();
        // first check if entered number is negative
        // if the number is negative throw NegativeNumberNotAllowedException
        // and if the number is not prime throw NumberNotPrimeException
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

    // this method checks whether the number is prime or not
    // Input Parameter - num(int)
    // Return Type - boolean(true if prime, false otherwise)
    public static boolean isPrime(int num) {

        for (int i = 2; i < num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

// user-defined exception
class NegativeNumberNotAllowedException extends Exception {
    NegativeNumberNotAllowedException() {
        System.out.print("Negative numbers are not allowed as input!!");
    }
}

// user-defined exception
class NumberNotPrimeException extends Exception {
    NumberNotPrimeException() {
        System.out.println("The number entered is not prime!!");
    }
}