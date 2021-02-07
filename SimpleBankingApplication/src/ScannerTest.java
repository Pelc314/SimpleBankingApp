import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Type in value");
		int a = scanner.nextInt();
		System.out.println("value = "+a);
		char c = scanner.next().charAt(0);
		System.out.println("value = "+c);
		
	}

}
