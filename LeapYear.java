import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year (4 digits): ");
        
        
        int year = 0;
        while (true) {
            try {
                year = Integer.parseInt(scanner.nextLine());
                if (String.valueOf(year).length() == 4) {
                    break;
                } else {
                    throw new NumberFormatException();
                }
            } catch (NumberFormatException e) {
                System.out.print("Invalid input. Please enter a 4-digit number: ");
            }
        }

        
        if (isLeapYear(year)) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }

       
        scanner.close();
    }

    
    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
