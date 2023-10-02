public class MinMaxCalculation {
    public static void main (String[] args) {
        double [] numarray = { 1.0, 2.0, 3.0, 4.0, 5.0 };
        double maxNo = getMaximumNumber (numarray) ;
        System.out.println ("Maximum value: " + maxNo) ;
    }

    /**
     * Calculates the maximum number from an array
     * @param numarray is an array of double numbers
     * @return maximum number
     */
    public static double getMaximumNumber (double ... numbers) {
        double maxNo = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maxNo) {
                maxNo = numbers[i];
            }
        }
        return maxNo;
    }
}