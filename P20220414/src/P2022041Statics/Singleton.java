package P2022041Statics;

public class Singleton {
	// private 클래스 외부에서는 접근금지
	private static Singleton singleton = new Singleton();
	
	private Singleton() {
		
	}
	
	//모든 패키지에서 접근하려면 public을 써야함
	public static Singleton getInstance() {
		return singleton;
		
	}

}
