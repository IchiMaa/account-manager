import java.util.Scanner;

public class Main {
	
	private Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("========== Account Manager ==========");
		System.out.println("(1) Login Account");
		System.out.println("(2) Register Account");
		System.out.println("(3) Load Accounts");
		Account peter = new Account("Peter","123");
		System.out.println(peter);
		peter.manageAccount("123");

	}

}
