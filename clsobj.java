// Variables in Java .
// local variable 
// (declared inside method and have local scope)

class clsobj
{	
	static int d; // class variable ..

	void add(int a , int b)
	{
		d = a+b;
		System.out.println("Output is "+d);

	}
	public static void main(String args[])
	{
		clsobj ob1 = new clsobj();
		clsobj ob2 = new clsobj();
		// calling function ..
		ob1.add(10,40);
		// printing instance variable ..

		System.out.println("Obect 1 : "+ob1.d);
		System.out.println("Obect 2 : "+ob2.d);




	}

}

