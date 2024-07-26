package stringStudy;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StringCharAtTest {

	@DisplayName("abc 값이 주어졌을 때 String의 charAt() 메소드를 활용해 특정 위치의 문자를 가져옴")
	@Test
	void stringCharAt() {
		StringCharAt stringCharAt = new StringCharAt("abc");
		Character stringItem = stringCharAt.getByStringMethodCharAt(0);
		assertThat(stringItem).isEqualTo('a');
	}

	@DisplayName("인덱스가 0보다 작거나 문자열보다 크면 StringIndexOutBoundException을 리턴")
	@Test
	void stringIndexOutBoundException() {
		String testTarget = "3123123123";
		int indexBound  = testTarget.length();
		StringCharAt stringCharAt = new StringCharAt(testTarget);

		assertThatThrownBy(() -> stringCharAt.getByStringMethodCharAt(indexBound)).isInstanceOf(StringIndexOutOfBoundsException.class);
	}
}
