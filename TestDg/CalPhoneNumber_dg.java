mport java.util.Scanner;
public class CalPhoneNumber_dg
{
	public static void main(String[] args)
	{
		String[] sign = {" "," ","ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"};
		Scanner sc = new Scanner(System.in);
		String pn = sc.next();
		int k = 0;
		for(int i = 0; i < pn.length(); i++)
		{
			k++;
			System.out.print(pn.substring(i,i+1) + " ");
		}
	}

	public static void fac(int pn)
	{
		
	}
}
