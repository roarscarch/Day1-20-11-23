import java.util.Scanner;

public class CoinFlip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of times to flip the coin: ");
        String input = scanner.nextLine();

        int numberOfFlips;

        try {
            numberOfFlips = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid integer for the number of flips.");
            return;
        }

        if (numberOfFlips <= 0) {
            System.out.println("Please enter a positive integer for the number of flips.");
            return;
        }

        int headsCount = 0;
        int tailsCount = 0;

        for (int i = 0; i < numberOfFlips; i++) {
            if (Math.random() < 0.5) {
                tailsCount++;
            } else {
                headsCount++;
            }
        }

        double headsPercentage = (double) headsCount / numberOfFlips * 100;
        double tailsPercentage = 100.0-(headsPercentage);

        System.out.println("Percentage of Heads: " + headsPercentage + "%");
        System.out.println("Percentage of Tails: " + tailsPercentage + "%");

        scanner.close();
    }
}
