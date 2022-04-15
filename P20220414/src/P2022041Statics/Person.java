package P2022041Statics;

public class Person {
	//final은 최종 필드라는 뜻으로 한번 값을 할당하면 바꿀수없다
	final String nation = "korea";
	final String ssn;
	String name;
	
	public Person (String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}
