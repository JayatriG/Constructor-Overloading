class BatchA
{
	String name,address;
	int id,ph_no;
	BatchA()
	{
		name="Tania";
		id=1001;
		address="195/6F";
		ph_no=9007;
	}
	BatchA(String name,String address)
	{
		this.name=name;
		this.address=address;
	}
	BatchA(int id,String name,String address,int ph_no)
	{
		this(name,address);
		this.id=id;
		this.ph_no=ph_no;
	}
	void show()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(address);
		System.out.println(ph_no);
	}
	public static void main(String args[])
	{
		BatchA b1=new BatchA();
		b1.show();
		BatchA b2=new BatchA(1020,"Jayatri","15/A",9051);
		b2.show();
	}
}
		