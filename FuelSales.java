/*Jan 27, 2023
 * developed by Bahati308
 * This program is aimed at 
 * easy management of a fuel station
 */


 // this class handles all
 // the variables we shall be using 
 //through out the program 
 class Variables {
        // products
        char pms; // petrol
        char ago; // diesel

        // opening and closing meters of the products

        //PETROL
        double opening_pms;
        double closing_pms;
        int rate_pms;

        // these are litres rea from the pump
        double day_sales_pms;
        double night_sales_pms;

        //these are litres read from the tanks
        double morning_dips_pms;
        double evening_dips_pms;
        
        //DIESEL
        double opening_ago;
        double closing_ago;
        int rate_ago;

        //these are litres read from the pump
        double day_sales_ago;
        double night_sales_ago;

        // these are litres read from the tanks
        double morning_dips_ago;
        double evening_dips_ago;

        //SHIFTS (WE NORMALLY HAVE TWO)
        char day;
        char night;

        double day_sales;
        double night_sales;

        // day and night sales
        double total_sales;

 }

public class FuelSales {
    public static void main(String[] args) {

// we have taken the case of 2 pumps here. 
        Variables pump1 =new Variables();
        Variables pump2 =new Variables();


    }
}