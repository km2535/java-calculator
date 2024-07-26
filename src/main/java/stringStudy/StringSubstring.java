package stringStudy;

public class StringSubstring {
	final String string;

	StringSubstring(final String string) {
		this.string = string;
	}

	public String stringSubstringThanReturnString() {
		return string.substring(1, string.length() - 1 );
	}
}
