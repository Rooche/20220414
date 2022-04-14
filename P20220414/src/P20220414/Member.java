package P20220414;

public class Member {
	// 필드
	// 회원아이디, 회원이름, 회원연락처, 회원나이를 넣자
	// 글자가 합쳐지면 2번째 글자때 대문자로
	private String memberId;
	private String memberName;
	private String memberPhone;
	private int memberAge; // 나이는 무조건 0보다 커야하니 -14이런게 들어가며 안됨
							// private을 사용하여 필드에 마음대로 접근하는걸 막아야함
							// ex) private을 안쓴다면 나이를 -25로 쓸수도 있기때문.

	// 생성자
	public Member(String memberId, String memberName, String memberPhone, int memberAge) {
		super();
		this.memberId = memberId;
		this.memberName = memberName;
		this.memberPhone = memberPhone;
		this.memberAge = memberAge;
	}

	// 메소드
	//void는 반환하는 값이 없다는 뜻
	//get이랑 set은 세트
	//set은 정보저장 get은 들고옴
	void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	
	//아이디를 반환해서 받아야하니 get을 써야함
	String getMemberId() {
		return memberId;
	}
	
	void setMemberAge(int age) {
		if (age < 0) {
			memberAge = 10;
		} else {
			memberAge = age;
		}
	}
	
	//memberage가 int타입이라 void가 아닌 int타입으로 해줘야함
	int getMemberAge() {
		return memberAge;
	}

	void showInfo() {
		System.out.printf("회원이름은 %4s \n연락처는 %13s \n나이는 %2d \n", memberName, memberPhone, memberAge);
	}
	
	
	
	// 알트 + 쉬프트 + s -> generate getters and setters 클릭해서
	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getMemberPhone() {
		return memberPhone;
	}

	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
	}

}
