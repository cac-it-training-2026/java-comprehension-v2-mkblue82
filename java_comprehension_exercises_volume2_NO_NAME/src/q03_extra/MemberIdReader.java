package q03_extra;

/**
 * メンバーIDクラス
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MemberIdReader implements IConsoleReader {
	public String setErrorMsg() {
		return "1-9の整数を入力してください";
	}

	public boolean isValid(String inputString) {
		Pattern p = Pattern.compile("^[0-9]$");
		Matcher m = p.matcher(inputString);
		if (m.find()) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isParseInt() {
		return true;
	}
}
