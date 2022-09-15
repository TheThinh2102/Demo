package datastructure;

public class Ex01Delare {
	public static int largeNumber = 55;

	public static void main(String[] args) {
		int myNum = 8;
		long myBigNum = 999;
		float avgPoint = 8.6f;
		boolean isValid = false;

		System.out.println("Dữ liệu " + myNum);
		System.out.println("Số lớn " + myBigNum);
		System.out.println("Điểm trung bình " + avgPoint);
		System.out.println("Hợp lệ " + isValid);
		
		System.out.println("Main largeNumber" + largeNumber);
		
		showData();

	}

	private static void showData() {
		int number = 20;
		System.out.println("Dữ liệu " + number);
		System.out.println("ShowData largeNumber" + largeNumber);
	}
}
