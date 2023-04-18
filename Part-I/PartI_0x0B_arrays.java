public class PartI_0x0B_arrays {
    /* 
        Java array is an object which contains elements of a similar data type. 
        Additionally, The elements of an array are stored in a contiguous memory location.
    */
    public static void main(String args[]){
        // One-Dimensional Arrays

        String month[];
        month = new String[12];

        month[0] = "January";
        month[1] = "February";
        month[2] = "March";
        month[3] = "April";
        month[4] = "May";
        month[5] = "June";
        month[6] = "July";
        month[7] = "August";
        month[8] = "September";
        month[9] = "October";
        month[10] = "November";
        month[11] = "December";

        int month_days[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for(int i = 0; i < 12; ++i){
            System.out.println("Month " + month[i] + " Is of " + month_days[i] + " Days");
        }

        // Multi-Dimensional Arrays
        int twoDarray[][] = new int[5][6];

        for(int i = 0; i < 5; ++i){
            for(int j = 0; j < 6; ++j){
                twoDarray[i][j] = (i+1)*(j+1);
                System.out.print(twoDarray[i][j] + "\t");
            }
            System.out.println("");
        }
    }
}
