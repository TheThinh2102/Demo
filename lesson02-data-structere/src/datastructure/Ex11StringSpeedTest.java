package datastructure;

public class Ex11StringSpeedTest {
	private static final int COUNT = 100000;

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		for (int i = 1; i <= COUNT; i++) {
			// Stack  = 200.000, HEAP = 200.000
			String s1 = new String("hello");
			String s2 = new String("hello");
			
			// Stack = 200.00, HEAP = 1
			// String o1 = "hello";
			// String o2 = "hello";
		}
		long end = System.currentTimeMillis();
		System.out.println("duration: " + (end - start) + " ms");
	}

}
