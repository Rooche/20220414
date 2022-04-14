package P20220414;

public class Class3CalEx {
	public static void main(String[] args) {
		Calculator c1 = new Calculator();

		c1.printPI();
		c1.getArea(2.4);

		int result = c1.sum(9, 1);
		System.out.println("두수의 합: " + result);
		double result1 = c1.sum(20.4, 30);
		System.out.println("두 수의 합" + result1);

		double result2 = c1.getTriangleArea(10.5, 5.5);
		System.out.println("삼각형 " + result2);

		int[] inary = { 10, 20, 30, 40 };
		result = c1.sum(inary);
		System.out.println("배열의 합: " + result);
		
		result1 = c1.average(10, 20, 25);
		System.out.println("평균: " + result1);
		
		result1 = c1.average(10, 20, 30, 33, 22, 55);
		System.out.println("평균: " + result1);

	}

}
