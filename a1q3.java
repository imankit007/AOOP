import java.util.Scanner;

class a1q3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();

        str = str.toLowerCase();
        try {
            if (str.contains("sdmcet")) {
                System.out.println("The substring sdmcet was found in the given string");
            } else {
                throw new SubStringNotFoundException();
            }
        } catch (SubStringNotFoundException e) {
            e.printStackTrace();
        }
    }

}

class SubStringNotFoundException extends Exception {

    SubStringNotFoundException() {
        System.out.println("The substring SDMCET is not found in the given String!");
    }
}
