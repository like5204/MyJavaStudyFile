public class Employee extends Person
{
	
	protected int employeeNumber;
	protected String workPhoneNumber;
	public Employee()
	{
		this(0,"");
	}

	public Employee(int _eNumber, String aPhoneNumber)
	{
		employeeNumber = _eNumber;
		workPhoneNumber = aPhoneNumber;
	}

	public int getEmployeeNumber()
	{
		return employeeNumber;
	}
}
