import java.util.Scanner;
public class Account {
	
	private AccountDatabase accountList = new AccountDatabase();

	private static int id = 1000;
	private String username;
	private String password;
	private Scanner sc = new Scanner(System.in);
	private int attempts = 3; //password attempts
	private boolean validInput; //validation bool
	
	public Account(){}

	public Account(String username, String password)
	{
		this.username = username;
		this.password = password;
		accountList.addAccount(this);
		id++;
	}
	
	public boolean manageAccount(String password)
	{
		boolean accountManaged;
		
		if (password.equals(this.password))
		{
			System.out.println("Welcome back! " + this.username);
			System.out.println("What would you like to do?");
			
			while(!validInput)
			{
				System.out.println("(1) Change Password");
				int input = sc.nextInt();
				if(input < 1 || input > 3)
				{
					System.out.println(input + " is not a valid option, try again.");
				}
				else
				{
					validInput = true;
					System.out.print("Enter new password: ");
					String newPassword = sc.next();
					System.out.println("Verify new password: ");
					String verifyPassword = sc.next();
					
					if (newPassword.equals(verifyPassword))
					{
						this.changePassword(newPassword);
						System.out.println("Password successfully changed!");
					}
					else
					{
						
					}
				}
			}
			accountManaged = true;
			
			
		}
		else
		{
			System.out.println("Incorrect password," + attempts + " attempts left.");
			accountManaged = false;
		}
		return accountManaged;
	

		
	}
	
	private void changePassword(String newPassword)
	{
		this.password = newPassword;
	}
	
	/*
	 * GETTER AND SETTER METHODS
	 * */
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	//Object to String method
	@Override
	public String toString()
	{
		return "ID: " + this.id + "| User: " + this.username + "| Pass: " + this.password;
	}
	
}
