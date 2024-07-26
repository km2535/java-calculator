package stringStudy;

public class StringCharAt {
	final String string;

	StringCharAt(final String string) {
		this.string = string;
	}

	public Character getByStringMethodCharAt(final int i) {
		return string.charAt(i);
	}
}
