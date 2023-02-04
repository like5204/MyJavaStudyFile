import java.util.Scanner;

public class GetSuperClassByGetClass
{
	public GetSuperClassByGetClass()
	{

	}

	public static void main(String[] args)
	{
		GetSuperClassByGetClass g  = new GetSuperClassByGetClass();

		System.out.println(g.getClass().getName());
		System.out.println(g.getClass().getSuperclass());

	}
}

