import javax.swing.JOptionPane;

public class InchesToFeet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Author:Precious Sani
		 * Date: 09/05/2023
		 * Lab 2
		 */
		
		//variable declaration
		int inches, feet, resultInches;
		String inchesSTR;
		
		//Prompt user to supply length in inches
		inchesSTR = JOptionPane.showInputDialog(null, "Enter length in inches ", 
				"Inch Converter", JOptionPane.INFORMATION_MESSAGE);
		//Convert String to integer
		inches = Integer.parseInt(inchesSTR);
		//Convert the given length to feet
		feet = inches/12;
		resultInches = inches%12;
		
		
		//Display result in dialog box
		JOptionPane.showMessageDialog(null, inches + " inches is " + "\n" +
				feet + "  feet and " + resultInches + "  inches");

	}

}
