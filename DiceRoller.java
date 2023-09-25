import javax.swing.JOptionPane;

public class DiceRoller {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        /*
         * Author:Precious Sani
         * Date: 09/19/2023
         * Lab 4
         * Question 2
         */

        int diceNumber;
        double betAMT = 0;

        int selection = JOptionPane.showConfirmDialog(null,
                "would you like to roll the dice", "Dice Roll", JOptionPane.YES_NO_OPTION);

        if (selection == 0) {
            String bet = JOptionPane.showInputDialog("Enter the amount to bet");
            betAMT = Double.parseDouble(bet);

            diceNumber = (int) (Math.random() * 6 + 1);

            switch (diceNumber) {
                case 1:
                case 2:
                case 3:
                    System.out.println("You rolled  " + diceNumber);
                    System.out.println("You forfeit your bet of $" + betAMT);
                    break;
                case 4:
                    System.out.println("You rolled  " + diceNumber);
                    System.out.println("You get back your bet of $" + betAMT);
                    break;
                case 5:
                    System.out.println("You rolled  " + diceNumber);
                    System.out.println("You get half your bet of $" + betAMT);
                    break;
                case 6:
                    System.out.println("You rolled  " + diceNumber);
                    System.out.println("Your bet of $" + betAMT + " is doubled");
                    break;

            }
        } else {
            System.out.println("Thanks for coming, Bye");
        }

    }
}