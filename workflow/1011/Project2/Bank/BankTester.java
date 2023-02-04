class BankAccount
{
	String ownerName;
	int accountNumber;
	float balance;
	

	public BankAccount()
	{
		ownerName = "";
		accountNumber = 999999;
		balance = 0.0f;
	}
	//public BankAccount(){this("",999999,0.0f);}
	
	public BankAccount(String name,int num, float bal)
	{
		ownerName = name;
		accountNumber = num;
		balance = bal;
	
	}
	public BankAccount(String name, int num)
	{
		ownerName = name;
		accountNumber = num;
		balance = 0.0f;
	}

}

public class BankTester
{
	public static void main(String[] args)
	{
		BankAccount myAccount = new BankAccount();

		System.out.println("ownerName="+myAccount.ownerName);
		System.out.println("accountNumber="+myAccount.accountNumber);
		System.out.println("balance="+myAccount.balance);
		

		BankAccount a1 = new BankAccount("Wangli",1234,1000.0f);
		System.out.println("ownerName="+a1.ownerName);
		System.out.println("accountNumber="+a1.accountNumber);
		System.out.println("balance="+a1.balance);

		
		BankAccount a2 = new BankAccount("Zhengli",1000123,100.0f);
		BankAccount a3 = new BankAccount("LiMing",1000124,100.0f);

	
	}
}
