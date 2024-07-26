package stringStudy;

public class StringSplit {
	final String string;


	StringSplit(String string) {
		this.string = string;
	}

	//string 을 분리해서 리턴하는 메서드
	String[] stringSplitReturnList(){
		return this.string.split(",");
	}
}
