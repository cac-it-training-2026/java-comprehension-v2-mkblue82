package q03_extra;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MemberPasswordReader implements IConsoleReader {

	public String setErrorMsg() {
		return "8文字以上16文字以内の半角英数字で入力してください";
	}

	public boolean isValid(String inputString) {
		Pattern p = Pattern.compile("^[a-zA-Z0-9]{8,16}$");
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
