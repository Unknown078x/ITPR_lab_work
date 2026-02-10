public class PrimeNumbers {
    public static void main(String[] args) {

        System.out.println("Prime numbers between 1 and 100:");

        // Loop through numbers from 2 to 100 because 1 is not a prime number
        for (int num = 2; num <= 100; num++) {
            // Assume number is prime initially
            boolean isPrime = true;

            // Check divisibility from 2 to num/2
            for (int i = 2; i <= num / 2; i++) {
                // If divisible by any number, it's not prime
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

             // If number remained prime, print it
            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    }
}

