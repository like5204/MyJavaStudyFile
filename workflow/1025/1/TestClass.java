public class TestClass
{
	public static void main(String[] args)
	{
		//创建Employ对象，并给属性赋值
		Employee li = new Employee();
		li.name = "Li Ming";
		li.employeeNumber = 123456;

		System.out.println(li.getName());
		System.out.println(li.getEmployeeNumber());
	
		//
		Manager he = new Manager();
		he.name="He xia";
		he.employeeNumber=543469;
		he.responsibilities = "Internet project";

		System.out.println(he.getName());
		System.out.println(he.getEmployeeNumber());
		System.out.println(he.getResponsibilities());

	}
}
