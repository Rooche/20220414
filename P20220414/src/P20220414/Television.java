package P20220414;
//객체 -> 도면 -> 텔레비전(삼성,엘지)
// Object(실체) -> Class(도면) -> Instance
//추상화(텔레비전의 모든 속성들을 다 정의해서 쓸 필요는 없고 필요한부분만 정의를 함)
public class Television {
	//속성 (Class안에서는 필드라고 이야기함)
	String company;
	String model;
	int price;
	String calor;
	
	//기능(메소드로 정의(반환유형, 메소드명, 매개변수 근데 매개변수는 있어도 되고 업성도 됨))
	void turnOn(){
		System.out.println("텔레비전을 켭니다.");
	}
	
	void turnOff(){
		System.out.println("텔레비전을 끕니다.");
	}

	void changeChanel(int chanel){ //
		System.out.println(chanel + "번 채널로 변경합니다.");
	}
}
