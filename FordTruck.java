public class FordTruck {
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        /*
         * Author:Precious Sani
         * Date: 09/19/2023
         * Lab 4
         */

        // declaring variables
        double MSRP = 75000;
        double savings = 2000;
        int year = 0;
        double totalAMT = 0;
        double rate = 0.025;

        for (int i = 1; i > 0; i++) {

            year = i;
            totalAMT += savings * Math.pow(1.0 + rate, year);
            System.out.println(year + " " + totalAMT);

            if (totalAMT >= MSRP) {
                i = -1;
                System.out.println("It will take me " + year + " years to save $"
                + String.format("%.2f",totalAMT));
            }

        }
    }
}