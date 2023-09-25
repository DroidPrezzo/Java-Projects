import java.util.Scanner;

public class FordTruckInteractive {
    /**
     * 
     */
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

        // declare Scanner
        Scanner keyBoard = new Scanner(System.in);
        System.out.println("Enter the amount you want to save>>>>>>>>");
        savings = keyBoard.nextDouble();

        //creating the Loop
        if (savings <= MSRP)
        {
        for (int i = 1; i > 0; i++) {

            year = i;
            totalAMT += savings * Math.pow(1.0 + rate, year);
            System.out.println(year + " " +String.format("%.2f",totalAMT));

            if (totalAMT >= MSRP) {
                i = -1;
                System.out.println("It will take me " + year + " years to save $"
                + String.format("%.2f",totalAMT));
            }
            
        }
    }
        else
        {
                System.out.println("You have enough savings to purchase your car ");
            }
    }
}