public class PartI_0x0C_operators {
    /* 
        
    */
    public static void main(String args[]){
        int a = 16, b = 9;
        
        // Arithmetic Operators

        int c = a + b; // Addition
        System.out.println("a + b = " + c);
        
        int d = a - b; // Substraction
        System.out.println("a - b = " + d);

        int e = a * b; // Multiplication
        System.out.println("a * b = " + e);

        double f = a / b; // Division
        System.out.println("a / b = " + f);

        int g = b % a; // Modulus
        System.out.println("b % a = " + g);

        System.out.println("++a = " + ++a);
        --a;

        System.out.println("--b = " + --b);
        ++b;

        System.out.println("a = " + a);
        System.out.println("performing a += 20;\na = " + (a += 20));

        System.out.println("b = " + b);
        System.out.println("performing b -= 5;\nb = " + (b -= 5));

        System.out.println("*= and /= work in a similar way as += and -= but they multiply and divide instead of add and substract");

        // Bitwise Operators

        int bin1 = 0b1111_1111;
        String b1 = Integer.toBinaryString((int)bin1);
        System.out.println("bin1 is " + String.format("%8s", b1).replace(' ', '0'));

        int bin2 = 0b0101_0101;
        String b2 = Integer.toBinaryString((int)bin2);
        System.out.println("bin2 is " + String.format("%8s", b2).replace(' ', '0'));

        System.out.println("bin1 AND bin2 = " + String.format("%8s", Integer.toBinaryString(bin1 & bin2)).replace(' ', '0')); // Bitwise AND Operation 
        System.out.println("NOT bin1 = " + String.format("%8s", Integer.toBinaryString(~bin1).replace(" ", "0"))); // Bitwise NOT Operation

        
    }
}