public class Person
{
	protected String name,phoneNumber,address;

	public Person()
	{
		this("","","");//无参构造函数，使用this传递空字符串调用
	}
	public Person(String _name, String _phoneNumber,String _address)
	{
		name = _name;
		phoneNumber = _phoneNumber;
		address = _address;
	}
	
	public void showMsg()
	{
		System.out.println("My name is:"+name);
		System.out.println("My PhoneNumber is: "+phoneNumber);
		System.out.println("My address is: " + address);
	}
}
