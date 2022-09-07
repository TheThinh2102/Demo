package view;

public class Ex01TestMainMethod {
	// data structure(cấu trúc dữ liệu): attributes(thuộc tính), variables(biến)
	//algorithm(thuật toán, phương thức): functions(hàm), methods(phương thức)
	public static void main(String[] args) {
		System.out.println("Main method");
		anotherMainMethod();
	}
	
	private static void anotherMainMethod() {
		System.out.println("Fake main method");
	}
}
