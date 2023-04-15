class PartI_0x07_data_types{ 
	/*
		Data types refer to the classification of different types of data that a 
		programming language can handle. A data type defines the type of value 
		that a variable or expression can have, the operations that can be 
		performed on it, and how the value is stored in memory
	*/
	public static void main(String args[]){

	// Integer Data Types(long - 64 bit, int - 32 bit, short - 16 bit, byte - 8 bit)
	byte a = 0x7f;
	System.out.println(a);

	short b = 0x7fff;
	System.out.println(b);

	int c = 0x7fffffff;
	System.out.println(c);

	long d = 0x7fffffffffffffffL;
	System.out.println(d);

	// Floating-point Numbers(float, double)
	float pi = (float)3.1416;
	double r = 15.42375;
	System.out.println(pi);

	double area = pi*r*r;
	System.out.println(area);

	// Characters(char)
	char c1 = 'n';
	char c2 = 'v';
	char c3 = 65;

	System.out.println(c1);
	System.out.println(c2);
	System.out.println(c3);


	// Boolean(boolean)
	boolean bool1 = true;
	boolean bool2 = false;

	System.out.println(bool1 + " " + bool2);

	}

}