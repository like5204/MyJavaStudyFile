public class TestComplex
{
	public static void main(String[] args)
	{
		Complex c1 = new Complex(2.0f,3.0f);
		Complex c2 = new Complex(4.0f,5.0f);

		Complex cAdd = c1.add(c2);
		System.out.println(cAdd);


		Complex cSub = c1.sub(c2);
		System.out.println(cSub);

		Complex cMul = c1.mul(c2);
		System.out.println(cMul);



	}
}
