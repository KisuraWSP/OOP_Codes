//Exercise 1
class Calculation{
	public static int AddNumbers(int x, int y) {
		return x+y;
	}
	public static int SubNumbers(int x, int y) {
		return x-y;
	}
	
}

public class DemoApp {

	public static void main(String[] args) {
		System.out.println("The addition of 10 & 1 is "+Calculation.AddNumbers(10, 1));
		System.out.println("The subtraction of 10 & 1 is "+Calculation.SubNumbers(10, 1));
	}

}
