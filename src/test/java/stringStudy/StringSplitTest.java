package stringStudy;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StringSplitTest {

	@DisplayName("1,2을 , 로 split 했을 때 1과 2로 분리")
	@Test
	void testStringSplitMethod(){
		StringSplit string = new StringSplit("1,2");
		String[] result = string.stringSplitReturnList();
		assertThat(result).isEqualTo(new String[] {"1", "2"});
	}

	@DisplayName("1을 , 로 split 했을 때 1만 포함하는 배열 반환")
	@Test
	void testStringSingleMethod(){
		StringSplit string = new StringSplit("1");
		String[] result = string.stringSplitReturnList();
		assertThat(result).isEqualTo(new String[] {"1"});
	}

}
