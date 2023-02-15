/*Jan 27, 2023
 * developed by Bahati308
 * This program is aimed at 
 * easy management of a fuel station
 */


 // this class handles all
 // the variables we shall be using 
 //through out the program

 import java.util.*;
 class Variables {
        // products
        char pms; // petrol
        char ago; // diesel

        // opening and closing meters of the products

        //PETROL
        double opening_pms;
        double closing_pms;
        int rate_pms;
        double pms_litres;
        double pms_sales;

        //litres read from the pump
        double day_pms_litres;
        double night_pms_litres;

        // these are sales made 
        double day_sales_pms;
        double night_sales_pms;

        //these are litres read from the tanks
        double morning_dips_pms;
        double evening_dips_pms;
        
        //DIESEL
        double opening_ago;
        double closing_ago;
        int rate_ago;
        double ago_litres;
        double ago_sales;


        //litres read from the pump
        double day_ago_litres;
        double night_ago_litres;

        //these are sales
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
    

 //constructors

 //pms litres

 double PmsLitres (){
    pms_litres = closing_pms - opening_pms;
    return pms_litres;
 }

 //pms sales

 double DaypmsSales(){
    day_sales_pms=rate_pms*day_pms_litres;
    return day_sales_pms;
 }

 double NightpmsSales(){
    night_sales_pms=rate_pms*night_pms_litres;
    return night_sales_pms;
 }

 // ago litres

 double AgoLitres (){
        ago_litres = closing_ago-opening_ago;
        return ago_litres;
 }

 //pms sales

 double DayagoSales(){
    day_sales_ago=rate_ago*day_ago_litres;
    return day_sales_ago;
 }

 double NightagoSales(){
    night_sales_ago=rate_ago*night_ago_litres;
    return night_sales_ago;
 }

 

public class FuelSales {
    public void main(String[] args) {
    }
}
}