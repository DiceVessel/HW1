public class Assignment01Q02 {
    public static void main(String[] args) {
        double actualPi = Math.PI;
        double approxPi = 0;
        int lim = Integer.parseInt(args[0]);
        for (int i = 1, k = 0, sign=1; i<= lim; i++, k++) {
            approxPi+= (1.0/(2*k+1))*sign;
            sign = -1*sign;
        }

        approxPi = 4*approxPi;

        
                
        System.out.println(approxPi + " " + actualPi);
    }
}
