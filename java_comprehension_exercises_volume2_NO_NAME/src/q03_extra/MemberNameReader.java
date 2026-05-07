package q03_extra;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MemberNameReader implements IConsoleReader {
	public String setErrorMsg() {
		return "名前は半角英字16文字以内で入力してください";
	}

	public boolean isValid(String inputString) {
		Pattern p = Pattern.compile("^[a-zA-Z0-9\\s]{1,16}$");
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
