package singletonPatternExample;

public class Test {

	public static void main(String[] args) {
		Logger obj1 = Logger.getInstance();
		Logger obj2 = Logger.getInstance();
		
		System.out.println(obj1==obj2);
	}

}
