package datastructure;

public class Ex10ObjectTypeDiff {
	public static void main(String[] args) {
		// Java: Float, Double, Long, Character
		String s1 = "hello";
		String s2 = "welcom";
		String s3 = "hello";

		System.out.println("s1 hash: " + System.identityHashCode(s1));
		System.out.println("s2 hash: " + System.identityHashCode(s2));
		System.out.println("s3 hash: " + System.identityHashCode(s3));

		s3 = "welcom";
		System.out.println("s3 hash: " + System.identityHashCode(s3));
		System.out.println("==========================");
		
		String o1 = new String("hello");
		String o2 = new String("welcom");
		String o3 = new String("hello");
		System.out.println("o1 hash: " + System.identityHashCode(o1));
		System.out.println("o2 hash: " + System.identityHashCode(o2));
		System.out.println("o3 hash: " + System.identityHashCode(o3));

	}
}
