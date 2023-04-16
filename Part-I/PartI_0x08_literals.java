public class PartI_0x08_literals {
    /*
        In computer programming, a literal is a value that appears directly in the code 
        and is not the result of a computation or variable reference. Literals can take 
        various forms depending on the data type of the value they represent.
    */
    public static void main(String args[]){
        
        // Integer Literals
        long hexa = 0x7fff_ffff_ffff_ffffL; // The value 0x7fffffffffffffff will be assigned to the variable hexa and the underscores will be ignored.
        System.out.println(hexa);

        int bin = 0b0111_1111_1111_1111_1111_1111_1111_1111;
        System.out.println(bin);

        int decimal = 17987;
        System.out.println(decimal);

        // Floating-Point Literals
        float pi = 3.14159f;
        System.out.println("Value Of pi: " + pi);

        double hexafloating = 0xf.fp0;
        System.out.println(hexafloating);

        double efloating = 2.5e-3;
        System.out.println(efloating);

        // Character Literals
        char newline = '\n'; // Java's "char" data type is of 16 bytes unlike that of C/C++.
        System.out.print(newline);

        char japchar = '\ua432';
        System.out.println("This Is A Japanese Character: " + japchar);

        // String Literals
        String hw = "Hello World!\n";
        System.out.println(hw);
    }

}
