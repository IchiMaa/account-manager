import java.util.ArrayList;

public class AccountDatabase {

	private ArrayList<Account> accounts; 
	
	//Can possibly add new constructor for maximum of accounts
	//Account database for different class
	
	public AccountDatabase()
	{
		this.accounts = new ArrayList<Account>();
	}
	

	public void addAccount(Account newAccount)
	{
		accounts.add(newAccount);
	}
	
	
	public int getCount()
	{
		return accounts.size();
	}
	
	public ArrayList<Account> getAccounts() 
	{
		return accounts;
	}

	public void setAccounts(ArrayList<Account> accounts) 
	{
		this.accounts = accounts;
	}
}
