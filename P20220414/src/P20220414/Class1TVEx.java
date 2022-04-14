package P20220414;

public class Class1TVEx {
	public static void main(String[] args) {
		int num = 10; // 변수형
		String str = "Hello"; // 문자형

		Television tv = new Television();
		tv.company = "삼성";
		tv.calor = "검은색";
		tv.price = 30000;
		tv.model = "30Inch";
		tv.turnOn();
		tv.changeChanel(10);
		tv.turnOff();

		Television tv1 = new Television();

		tv1.company = "삼성";
		tv1.calor = "검은색";
		tv1.price = 30000;
		tv1.model = "30Inch";

		System.out.println(tv == tv1); // 서로 다른 주소값을 가지고 있어서 정보가 같아도 false
		System.out.println(tv);
		System.out.println(tv1);

		Student stud1 = new Student(); // 정의되어져있는 생성자를 지울경우 에러가 뜸
		stud1.name = "홍길동";
		stud1.stuNo = "22-1234567";
		stud1.age = 20;
		stud1.height = 174.5;

		Student stud2 = new Student();
		stud2.name = "김길동";
		stud2.stuNo = "22-7654321";
		stud2.age = 25;
		stud2.height = 190.5;
		
		Student stud3 = new Student("황하경", "22-852345");// 컨트롤키 누른상태로 클릭하면 지정된 생성자로 이동됨
		stud3.age = 19;
		stud3.height = 250.5;
		
		Student stud4 = new Student("최홍기", "22-125452", 44);
		
		stud1.study();
		stud2.study();
		
		stud1.showInfo();
		stud2.showInfo();
		stud4.showInfo(); //값을 넣지 않아서 null이라고 나옴
						  //생성자에 nm과 sn를 지정해서 넣으면 값이 나옴
	}
}
