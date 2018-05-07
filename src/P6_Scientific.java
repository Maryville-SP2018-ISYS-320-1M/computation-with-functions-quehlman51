/*
	ISYS 320
	Name(s): Anthony Quehl
	Date: 
*/

public class P6_Scientific {

	public static void main(String[] args) {
		System.out.println(computeScientificValue( 6.5, 3));
	}
	public static double computeScientificValue( double number, double powerNumber ) {
		return number * Math.pow(10, powerNumber);

	}

}
