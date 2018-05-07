/*
	ISYS 320
	Name(s):
	Date: 
*/

/*
 What were the errors you found?
 Using double tempc will constantly cause the program to return 0.0. Remove it and
 have the method return a double. Then simply have the print statement print the
 method.
 
 */

public class P4_FixTempConverter {
	public static void main(String[] args) {
		double tempf = 98.6;
		double tempc = 0.0;
		ftoc(tempf);
		System.out.println("Body temp in C is: " + ftoc(tempf));
	}

	// converts Fahrenheit temperatures to Celsius
	public static double ftoc(double tempf) {
	      return (tempf - 32) * 5 / 9;
    }
}
