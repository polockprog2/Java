import java.lang.*;

public interface ICustomer
{
	public abstract boolean insertAccount(Account a);
	boolean removeAccount(Account a);
	Account searchAccount(int accountNumber);
	void showAllAccounts();
}