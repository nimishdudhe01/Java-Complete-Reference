class PartI_0x03_if_statements{
	public static void main(String args[]){
		int x,y;

		x = 20;
		y = 10;

		if(x > y) System.out.println("x is greater than y");

		y = y*3;
		if(y > x) System.out.println("y is greater than x");

		y = y - 10;
		if(x == y) System.out.println("x is equal to y");
	}
}
