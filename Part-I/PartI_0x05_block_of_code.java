class PartI_0x05_block_of_code{
	public static void main(String args[]){
		int x = 0;
		int y = 20;

		for(x = 0; x < 10; ++x){
			// Here's a block of code inside the curly braces.
			System.out.println("This is x: " + x);
			System.out.println("This is y: " + y);
			y = y - 2;
		}
	}

}
