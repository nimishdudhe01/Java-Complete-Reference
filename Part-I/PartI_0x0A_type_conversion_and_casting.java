public class PartI_0x0A_type_conversion_and_casting{
    /*
        Type conversion and casting are two different concepts that are 
        used to convert a variable from one data type to another. Type 
        conversion is an automatic process performed by the compiler, 
        whereas casting is an explicit process that is performed by the programmer.
     */
    public static void main(String args[]){
        // Automatic Conversion : happens when two types are compatible and the destination is larger than the source.
        byte a = 90, b = 39;
        int c = a * b;
        System.out.println(c);

        // Casting incompatible types
        int x = 1092;
        byte y = (byte)x; // If integer's value is larger than range of byte, it will be reduced to modulo byte's range.
        System.out.println(y);

        // Automatic Type Promotion
        byte d = 50;
        d = (byte)(d * 2); // Here though d*2 is a perfectly valid byte value, when the expression was evaluated the result
                           // has also been promoted to int. Thus result is an int and must be casted back to byte.
        System.out.println(d);
    }
}
