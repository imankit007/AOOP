public class a1q1 {
    public static void main(String[] args) {
        // Divide by zero exception
        try {
            int a = 30, b = 0;
            int c = a / b;
            System.out.println("Result = " + c);
        } catch (ArithmeticException e) {
            System.out.println("Can't divide a number by 0");
        }
        // Index out of bound exception
        // We are referencing to an index which is greater than the last index of the
        // array
        try {
            int a[] = new int[5];
            a[9] = 133;

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index is Out Of Bounds");
        }
        // Nullpointerexception
        // The variable has null value but we are trying to refer it
        try {
            String a = null;
            System.out.println(a.charAt(0));
        } catch (NullPointerException e) {
            System.out.println("NullPointerException..");
        }

    }
}
