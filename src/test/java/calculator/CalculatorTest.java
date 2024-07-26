package calculator;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import stringStudy.calculator.Calculator;

public class CalculatorTest {
	@DisplayName("쉼표(,) 또는 콜론(:)을 구분자로 가지는 문자열을 전달하는 경우 구분자를 기준으로 분리한 각 숫자의 합을 반환")
	@Test
	public void testAdd1() {
		Calculator calculator = new Calculator("");
		assertThat(calculator.add()).isEqualTo(0);
	}

	@DisplayName("앞의 기본 구분자(쉼표, 콜론)외에 커스텀 구분자를 지정할 수 있다")
	@Test
	public void testAdd2() {
		Calculator calculator = new Calculator("//;\n1;2;3");
		assertThat(calculator.add()).isEqualTo(6);
	}
	@DisplayName("문자열 계산기에 숫자 이외의 값 또는 음수를 전달하는 경우 RuntimeException 예외를 throw 한다")
	@Test
	public void testAdd3() {
		Calculator calculator = new Calculator("1,-1");
		assertThatThrownBy(calculator::add).isInstanceOf(RuntimeException.class);
	}

}
