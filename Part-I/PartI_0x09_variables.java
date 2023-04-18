public class PartI_0x09_variables {
    /*
        In Java, a variable is a named memory location that
        can store a value of a particular data type.
     */
    public static void main(String args[]){

        // Constant Initialization
        int a,b;
        int d = 56, f = 10;

        float pi = 3.14159f;
        double e = 2.71828;

        char ch = 'x';
        String hw = "Hello World String!";

        // Dynamic Initialization
        double c = Math.sqrt(d*d + f*f); // c is dynamically initialized
        System.out.println(c);

        // Scope and Lifetime Of Variables
        int x = 90;
        {
            int y = 70;
            System.out.println(y);
            System.out.println(x);
        }

        // System.out.println(y); // Error! y is not known here
        System.out.println(x);
    }
}
