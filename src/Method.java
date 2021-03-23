
public class Method {
	
	public static void main(String[] args) {
		
		bark();
		
		ChangeType();
		
		final String finalString = "Hello";
//		finalString = "h";
		System.out.println(finalString);
	}
	public static void bark() {
		String dogName = "Milo";
		System.out.println("The Dog name = "+dogName+" bark");
	}
	public static void ChangeType() {
		float myFloat = 1.99f;
		int myInt = 50;
		double myDouble = 4.55;
		char myChar = 'D';
		
		System.out.println((int) myFloat);
		System.out.println((float) myInt);
		System.out.println((float) myDouble);
		System.out.println((int) myChar);
	}

}
