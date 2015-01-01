package reverseInteger;

import java.util.*;

public class reverseInteger {

	public static int reverse(int inputInteger){
		Boolean isNegative = sign(inputInteger);
		int integerToConvert = integerToConvert(isNegative, inputInteger);
		String string = Integer.toString(integerToConvert);
		String reversed = reverseCharArray(string);
		int integer = parsedInt(isNegative, reversed);
		return integer;
	}
	
	public static int parsedInt(Boolean isNegative, String inputString){
		int integer = Integer.parseInt(inputString);
		if(isNegative == true){
			integer = integer * -1;
		}
		return integer;
	}
	
	public static Boolean sign(int inputInteger){
		if(inputInteger < 0)
			return true;
		else
			return false;
	}
	
	public static String reverseCharArray(String inputString){
		String reversed = new StringBuilder(inputString).reverse().toString();
		return reversed;
	}
	
	public static int integerToConvert(Boolean isNegative, int inputInteger){
		int integerToConvertNum;
		if(isNegative == true)
			integerToConvertNum = inputInteger*-1;
		else
			integerToConvertNum = inputInteger;
		return integerToConvertNum;
	}
}
