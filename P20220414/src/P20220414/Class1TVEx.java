package P20220414;

public class Class1TVEx {
		public static void main(String[] args) {
			int num = 10; // 변수형 
			String str = "Hello"; // 문자형
			
			Television tv = new Television(); // 
			tv.company = "삼성";
			tv.calor = "검은색";
			tv.price = 30000;
			tv.model = "30Inch";
			tv.turnOn();
			tv.changeChanel(10);
			tv.turnOff();
			
			
			Television tv1 = new Television(); // 
			tv != tv1;
			
		}
}
