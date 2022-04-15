package P2022041Statics;

public class Person {
	//final은 최종 필드라는 뜻으로 한번 값을 할당하면 바꿀수없다
	final String nation = "korea";
	final String ssn;
	// 클래스에 소속이 되어있고 값을 변경도 불가능 => 상수필드(static final)
	static final double PI = 3.14;
	String name;
	
	public Person (String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}
