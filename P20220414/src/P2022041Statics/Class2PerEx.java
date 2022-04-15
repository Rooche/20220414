package P2022041Statics;

public class Class2PerEx {
	public static void main(String[] args) {
		Person p1 = new Person("12345-12345", "홍길동");
		p1.name = "김길동"; // 홍길동 -> 김길동으로 이름변경
	//	p1.ssn = "35243-51234"; // 번호변경 하지만 Person에서 Final로 해둬서 변경불가능
		
	//	Person p2 = 
	}

}
