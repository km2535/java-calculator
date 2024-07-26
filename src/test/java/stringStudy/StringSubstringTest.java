package stringStudy;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StringSubstringTest {

	@DisplayName("(1,2) 값이 주어졌을 때 String의 substring() 메소드를 활용해 () 을 제거하고 1,2를 반환")
	@Test
	void substringTest(){
		StringSubstring substring = new StringSubstring("(1,2)");
		String result = substring.stringSubstringThanReturnString();
			assertThat(result).isEqualTo("1,2");

	}
}
