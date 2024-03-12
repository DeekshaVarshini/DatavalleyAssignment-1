import java.util.*;

class CustomValidationException extends Exception {
    public CustomValidationException(String message) {
        super(message);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        try {
            validateNumber(num);
            System.out.println("Number is valid.");
        } catch (CustomValidationException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    public static void validateNumber(int num) throws CustomValidationException {
        if (num < 0) {
            throw new CustomValidationException("Number cannot be negative");
        }
    }
}
