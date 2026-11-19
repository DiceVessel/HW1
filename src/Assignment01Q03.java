public class Assignment01Q03 {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);

        System.out.println("The first " + x + " Fibonacci numbers are:");

        int numOdd = 0;
        int n0 = 1, n1 = 1;
        System.err.println("1 1");
        for (int i=0;i+2<x;i++) {
            if ((n0+n1)%2 == 0) {
                numOdd++;
            }
            System.err.println(n0+n1);
            int temp = n1+n0;
            n0 = n1;
            n1 = temp;
        }
        
        ////////////////////////////////////////////////////////////////
        
        System.out.println("The number of odd numbers is: " + numOdd);
    }
}
