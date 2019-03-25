
public class IntToHex {
	
	public static String getHexValue(int num) {
		
		int remainder;
		
		StringBuilder resultStr = new StringBuilder();
		
		char[] hexValues = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
				'A', 'B', 'C', 'D', 'E', 'F'};
		
		while (num > 0) {
			remainder = num % 16;
			resultStr.insert(0,hexValues[remainder]);
			num = num / 16;
		}
		
		return resultStr.toString();
	}

}
