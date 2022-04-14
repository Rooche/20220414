package P20220414;

public class Student {
	// 3가지의 멤버가 있음
	// 필드
	//필드는 괄호가 없음
	String name;
	String stuNo;
	int age;
	double height;
	

	// 생성자
	//생성자는 인스턴스를 만들어줄때 처리할 기능을 정의
	//매개값(괄호안)이 없는 생성자를 기본생성자라고 말함.
	public Student() {
		System.out.println("Student() 생성자가 호출되었습니다.");
	}
	
	//생성자는 필드의 값을 지정할때 많이 사용됨
	public Student(String nm, String sn) {
		name = nm;
		stuNo = sn;
		
	}
	
	//생성자는 이름 하번 나이 채워주는 생성자 만들기
	public Student(String nm, String sn, int ag) {
		name = nm;
		stuNo = sn;
		age = ag;
	}
	
	//알트 + 쉬프트 + s -> generate Constructor using Fields.. 클릭해서
	public Student(String name, String stuNo, int age, double height) {
		this.name = name;
		this.stuNo = stuNo;
		this.age = age;
		this.height = height;
	}

	// 메소드
	void study() {
		System.out.println(name + "가 공부를 합니다.");
	}

	void eat() {
		System.out.println(name + "가 식사를 합니다");
	}

	void showInfo() {
		System.out.println("이름은 " + name + " 학번은 " + stuNo + " 키는 " + height + " 나이는 " + age + "입니다.");
	}

}
