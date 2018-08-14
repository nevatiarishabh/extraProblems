

/**
Input will be a String - a valid expression.

Expressions have operators and operands.
Operators can be * or + or - or /
Operands are valid numbers (from 10^-6 upto 10^6)

Output should be a String with reversed expression

Example:

Input: "123+456/23*2"
Output: "2*23/456+123"

Note: Test for extreme cases.

*/
public class ReverseExpression {

	public static void main(String args[]){
		String sampleInput = ("123+456/23*2");
		String sampleOutput = reverse(sampleInput);
		System.out.println(sampleOutput);
	}

	public static String reverse(String input){
		return "";
	}

}
