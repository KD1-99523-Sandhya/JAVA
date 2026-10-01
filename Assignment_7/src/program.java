

import java.util.Scanner;

public class program {
    public static void main(String[] args) throws ExceptionLineTooLong {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        int length = input.length();
        if (length > 80) {
            throw new ExceptionLineTooLong("The string is too long");
        }

        System.out.println("String length: " + length);
    }
}

class ExceptionLineTooLong extends Exception {
    public ExceptionLineTooLong(String message) {
        super(message);
    }
}



