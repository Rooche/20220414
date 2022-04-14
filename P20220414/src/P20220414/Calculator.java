package P20220414;

public class Calculator {
	private double pi = 3.14;

	// 리턴타입 없는것
	void printPI() {
		System.out.println("원주율은 " + pi);
	}

	void getArea(double radius) {
		double area = pi * radius * radius;
		System.out.println("반지름 " + radius + "의 넓이는 " + area);
	}

	// 리턴 타입 있는것
	// 메소드의 오버로딩 => 동일한 이름의 메소드를 정의해서 사용하려면 타입이 다르거나 갯수가 달라야함
	int sum(int num1, int num2) {
		return num1 + num2;
	}

	double sum(double n1, double n2) { // 똑같은 메소드이지만 처리해주는 매개변수타입이 달라서 다시 정의가 가능함
		return n1 + n2;

	}
	// 밑변과 높이를 입력 받아서 삼각형의 넓이를 계산해주는 메소드를 만드세요
	// 이름은 getTriangleArea

	double getTriangleArea(double width, double height) {

		return width * height / 2.0;
	}

	// 매개변수 클래스, 배열,
	int sum(int[] ary) {
		int sum = 0;
		for (int i = 0; i < ary.length; i++) {
			sum += ary[i];
		}
		return sum;
	}

	// 평균을 계산
	double average(int n1, int n2, int n3) {
		return (n1 + n2 + n3) / 3.0;
	}

	double average(int... args) { //들어오는게 몇개인지는 모르겠지만 들어오는 만큼
		int sum = 0;
		for (int i = 0; i < args.length; i++) {
			sum += args[i];
		}
		return (double) sum / args.length;//들어오는게 몇개인지는 모르겠지만 들어오는 만큼 나눠주겠다
	}
}
