import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static AccountDatabase accountList = new AccountDatabase();

	public static void main(String[] args) {
		

		displayMenu(); //Displays Account Manager Menu
		int input = validatePositiveNumber(1,3);
		switch(input)
		{
		case 1:
			loginAccount();
			break;
		case 2:
			registerAccount();
			break;
		case 3:
			loadAccounts();
			break;
		default:
			break;
		}
		
	}
	
    private static void loadAccounts() {
		// TODO Auto-generated method stub
		
	}

	private static void loginAccount() {
		// TODO Auto-generated method stub
		
	}

	private static int validatePositiveNumber(int min, int max) {

        int number;
        do {
            System.out.print("Please enter between " + min + " to " + max + ": ");
            while (!sc.hasNextInt()) {
                String input = sc.next();
                System.out.println(input + " is invalid, try again: ");
            }
            number = sc.nextInt();
        } while (number < min || number > max);
        return number;
    }
    
	private static void displayMenu()
	{
		System.out.println("========== Account Manager ==========");
		System.out.println("(1) Login Account");
		System.out.println("(2) Register Account");
		System.out.println("(3) Load Accounts");
	}
	
	//TODO
	//Add security for password by including numbers or symbols
	private static void registerAccount()
	{
		//New empty account created
		Account newAccount = new Account();
		String input;
		
		//Check if username exists
		System.out.print("Username: ");
		do
		{
			input = sc.next();
			if(accountExists(input))
			{
				System.out.println("Username already exists, try again: ");
			}
		} while(accountExists(input));
		
		//Set Username
		newAccount.setUsername(input); 
		
		//Set Password
		System.out.print("Password: ");
		input = sc.next();
		newAccount.setPassword(input);
	}
	
	private boolean verifyPassword(String password)
	{
		return false;
	}
	private static boolean accountExists(String username)
	{
		boolean accountExists = false;
		if (accountList.getCount() == 0)
		{
			return false;
		}
		for(int i = 0; i < accountList.getCount(); i++)
		{
			if(username.equalsIgnoreCase(accountList.getAccounts().get(i).getUsername())){
				accountExists = true;
			}
			else
			{
				accountExists = false;
			}
			
		}
		return accountExists;

	}

	
	

}
