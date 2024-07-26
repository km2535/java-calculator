package stringStudy.calculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator {
	final String target;
	public Calculator(final String target){
		this.target = target;
	}

	public Integer add(){
		int result = 0;
		if(target.isEmpty()) return result;

		String regex = "//(.)\n(.*)";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(target);

		if(matcher.find()) {
			String type = matcher.group(1);
			String[] strings = matcher.group(2).split(type);
			for (String string : strings) {
				if(isNotNumberOrNegative(string)){
					throw new RuntimeException();
				}
				result += Integer.parseInt(string);
			}
		return result;
		}

		String[] strings = target.split("[,|:]");
		for (String string : strings) {
			if(isNotNumberOrNegative(string)){
				throw new RuntimeException();
			}
			result += Integer.parseInt(string);
		}
		return  result;
	}

	boolean isNotNumberOrNegative(String number){
		if(number.isEmpty()) return true;
		return number.charAt(0) == '-';
	}
}
