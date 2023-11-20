public class PowerOf2 {
    public static void main(String[] args) {
       
  
        System.out.println("Please provide a value for N as a command-line argument.");
          
      

        
        int n = Integer.parseInt(args[0]);

       
        if (n < 0 || n >= 31) {
            System.out.println("N should be in the range 0 <= N < 31.");
            return;
        }

        // Print the table of powers of 2
        System.out.println("Powers of 2 less than or equal to 2^" + n + ":");
        for (int i = 0; i <= n; i++) {
            int result = (int) Math.pow(2, i);
            System.out.println("2^" + i + " = " + result);
        }
    }
}
