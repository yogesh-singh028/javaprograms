// java program to find the area of rectangle and square.

class squr
{
	void rec_area(int w, int h)
	{
		// area of rectangle
		int area = w*h;
		System.out.println("Area of rectangle is "+area);

	}

	void squr_area(int side)
	{
		// area of square .
		int area = side*side; 
		System.out.println("Area of Square is "+area);

	}

	public static void main(String args[])
	{
		// creating object ...
		squr ob1 = new squr();;
		// calling area of rectangle ..
		ob1.rec_area(12,6); // width and height of rectangle
		// calling area of square ..
		ob1.squr_area(6); // length of side..

	}
}