package q03_extra;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MemberBirthdayReader implements IConsoleReader {
	public String setErrorMsg() {
		return "正しい形式(yyyy/MM/dd)で入力してください";
	}

	public boolean isValid(String inputString) {
		Pattern p = Pattern.compile("^\\d{4}/\\d{2}/\\d{2}$");
		Matcher m = p.matcher(inputString);
		if (m.find()) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isParseInt() {
		return false;
	}
}
