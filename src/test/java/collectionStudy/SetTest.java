package collectionStudy;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class SetTest {
	private Set<Integer> numbers;
	@BeforeEach
	void setUp() {
		numbers = new HashSet<>();
		numbers.add(1);
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
	}

	@DisplayName("Set 의 size() 메소드를 활용해 Set의 크기를 확인하는 학습테스트를 구현")
	@Test
	void checkSetSize(){
		assertThat(numbers.size()).isEqualTo(3);
	}

	@DisplayName("Set 의 contains() 메소드를 활용해 1, 2, 3의 값이 존재하는지를 확인")
	@ParameterizedTest
	@ValueSource(ints = {1, 2, 3})
	void contains(int argument) {
		assertThat(numbers.contains(argument)).isTrue();
	}


	@DisplayName(". 입력 값에 따라 결과 값이 다른 경우에 대한 테스트도 가능하도록 구현")
	@ParameterizedTest
	@CsvSource(value = {"1,2,3:true", "4,5:false"}, delimiter = ':')
	void containsOther(String argument, boolean expected) {
		String[] split = argument.split(",");
		for (String s : split) {
			assertThat(numbers.contains(Integer.valueOf(s))).isEqualTo(expected);
		}
	}

}
