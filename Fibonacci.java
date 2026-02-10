class Fibonacci {
    public static void main(String[] args) {


        // First two numbers of the Fibonacci series
        int a = 0, b = 1;
        //loop to get fibronacci series upto 30 terms
        for (int i = 1; i <= 30; i++) {
            //printing current number
            System.out.print(a + " ");

            // updating values for next iteration
            int next = a + b;
            a = b;
            b = next;
        }
    }
}
