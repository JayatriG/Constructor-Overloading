class Complex
{
	private double real;
	private double imag;
	Complex()
	{
		real=5.8;
		imag=3.6;
	}
	Complex(double real,double imag)
	{
		this.real=real;
		this.imag=imag;
	}
	void addComplex(Complex c2)
	{
		real=real+c2.real;
		imag=imag+c2.imag;
	}
	void show()
	{
		System.out.println("The compex no. is :"+real+"+"+imag+"i");
	}
	public static void main(String args[])
	{
		Complex c1=new Complex();
		Complex c2=new Complex(3.5,4.2);
		c1.show();
		c2.show();
		c1.addComplex(c2);
		c1.show();
	}
}