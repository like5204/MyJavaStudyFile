public class Complex
{
	private float real;
	private float unreal;

	public Complex(float real,float unreal)
	{
		this.real = real;
		this.unreal = unreal;
	}

	public float getReal(){return this.real;}
	public float getUnreal(){return this.unreal;}
	public void setReal(float real){this.real=real;}
	public void setUnreal(float unreal){this.unreal=unreal;}

	public Complex add( Complex b)
	{
		float real = getReal() + b.getReal();
		float unreal = getUnreal() + b.getUnreal();
		
		Complex c = new Complex(real,unreal);

		return c;
	}

	public Complex sub(Complex b)
	{
		float real = getReal() - b.getReal();
		float unreal = getUnreal() - b.getUnreal();

		Complex c = new Complex(real,unreal);

		return c;
	}

	public Complex mul(Complex b)
	{
		float x1 = getReal() * b.getReal();
		float x2 = getReal() * b.getUnreal();
		float x3 = getUnreal() * b.getReal();
		float x4 = -(getUnreal() * b.getUnreal());

		float real = x1 + x4;
		float unreal = x2 + x3;

		Complex c = new Complex(real,unreal);
		return c;
	}
	
	public String toString()
	{
		return getReal()+"+"+getUnreal()+"i";
	}

}
