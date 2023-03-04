/*modified on 
Mar 04, 2023
 * developed by Bahati308
 * This program is aimed at 
 * easy management of a fuel station
 */

import java.util.*;
 class FuelSales {
    public static void main(String[] args) {
    try (Scanner scan = new Scanner (System.in)) {
        // these are litres read from the tanks
        System.out.print("Morning dips ago: ");
        double morning_dips_ago = scan.nextDouble();
System.out.println("ago morning dips : "+ morning_dips_ago);

        System.out.print("Evening dips ago: ");
        double evening_dips_ago =scan.nextDouble();
        System.out.println("ago evening dips : "+evening_dips_ago);

        System.out.print("day opening pms :");
        double day_opening_pms = scan.nextDouble();
        System.out.println("Day opening PMS :" + day_opening_pms);

        System.out.print("day closing pms :");
        double day_closing_pms = scan.nextDouble();
        System.out.println("Day closing PMS :" + day_closing_pms);

        System.out.print("PMS RATE : ");
        double rate_pms = scan.nextDouble();
        System.out.println("PMS RATE: "+ rate_pms);

        double day_pms_litres =day_closing_pms-day_opening_pms;
        System.out.println("Day Shift PMS Litres : "+day_pms_litres);


        double day_sales_pms = day_pms_litres*rate_pms;
        System.out.println("Day sales PMS : "+day_sales_pms);



        System.out.print("Morning dips pms: ");
        double morning_dips_pms = scan.nextDouble();
System.out.println("pms morning dips : "+ morning_dips_pms);

        System.out.print("Morning dips ago: ");
        double evening_dips_pms =scan.nextDouble();
        System.out.println("pms evening dips : "+evening_dips_pms);

        System.out.print("night opening pms :");
        double night_opening_pms = scan.nextDouble();
        System.out.println("night opening PMS :" + night_opening_pms);

        System.out.print("night closing pms :");
        double night_closing_pms = scan.nextDouble();
        System.out.println("night closing PMS :" + night_closing_pms);

        double night_pms_litres =night_closing_pms-night_opening_pms;
        System.out.println("Night Shift PMS Litres : "+night_pms_litres);


        double night_sales_pms = day_pms_litres*rate_pms;
        System.out.println("Day sales PMS : "+night_sales_pms);
    }
   }
 }
 
 
 
 // this class handles all
 // the variables we shall be using 
 //through out the program
 
 
 class Variables {
    // products
    char pms; // petrol
    char ago; // diesel
 
    // opening and closing meters of the products
 
    // PETROL
    double day_opening_pms;
    double day_closing_pms;
    double night_opening_pms;
    double night_closing_pms;
    double rate_pms;
    double pms_litres;
    double pms_sales;
 
    // litres read from the pump
    double day_pms_litres;
    double night_pms_litres;
 
    // these are sales made
    double day_sales_pms;
    double night_sales_pms;
 
    // these are litres read from the tanks
    double morning_dips_pms;
    double evening_dips_pms;
 
    // DIESEL
    double day_opening_ago;
    double day_closing_ago;
    double night_opening_ago;
    double night_closing_ago;
    double rate_ago;
    double ago_litres;
    double ago_sales;
    double total_ago_sales;
 
    // litres read from the pump
    double day_ago_litres;
    double night_ago_litres;
 
    // these are sales
    double day_sales_ago;
    double night_sales_ago;
 
    // these are litres read from the tanks
    double morning_dips_ago;
    double evening_dips_ago;
 
    // SHIFTS (WE NORMALLY HAVE TWO)
    char day;
    char night;
 
    double day_sales;
    double night_sales;
 
    // day and night sales
    double total_sales;
    double total_pms_sales;
    double grand_sales;
 
    // constructor
 
    Variables() {
        night_opening_pms=5;
        night_closing_pms=10;
        rate_pms=5099;
       pms_litres=0;
       pms_sales=0;
 
       //litres read from the pump
       
        night_pms_litres=0;
 
       // these are sales made 
     day_sales_pms=0;
    night_sales_pms=0;
 
       //these are litres read from the tanks
        morning_dips_pms =0;
        evening_dips_pms =0;
 
        //diesel
 
    day_opening_ago=0.0;
    day_closing_ago=10.0;
    night_opening_ago=10.0;
    night_closing_ago=50.0;
     rate_ago=5339.0;
    ago_litres=0;
     ago_sales=0;
 
    // litres read from the pump
     day_ago_litres=0;
     night_ago_litres=0;
 
    // these are sales
    day_sales_ago=0;
    night_sales_ago=0;
    
    }
 
    // methods are listed below
    // pms litres
 
    double nightPmsLitres() {
      night_pms_litres =(night_closing_pms - night_opening_pms);
      return night_pms_litres;
 
    }
 
    // ago litres
 
    double dayAgoLitres() {
       day_ago_litres= day_closing_ago-day_opening_ago;
       return day_ago_litres;
 
    }
 
    double nightAgoLitres() {
       night_ago_litres= night_closing_ago - night_opening_ago;
       return night_ago_litres;
 
    }
 
    // pms sales
 
    double DayagoSales() {
       day_sales_ago =rate_ago * (day_closing_ago-day_opening_ago);
       return day_sales_ago;
 
    }
 
    double NightagoSales() {
       night_sales_ago= rate_ago * (night_closing_ago-night_opening_ago);
             return night_sales_ago;
 
    }
 
    double TotalAgoSAles(){
       total_ago_sales = ((rate_ago * (night_closing_ago-night_opening_ago))+(rate_ago * (day_closing_ago-day_opening_ago)));
       return total_ago_sales;
    }
 
 
    double TotalPmsSAles(){
       total_pms_sales = ((rate_pms * (night_closing_pms-night_opening_pms))+(rate_pms * (day_closing_pms-day_opening_pms)));
       return total_pms_sales;
    }
    double TotalDaySales(){
       day_sales=((rate_ago * (day_closing_ago-day_opening_ago))+(rate_pms * (day_closing_pms - day_opening_pms)));
       return day_sales;
    }
 
    double TotalNightSales(){
       night_sales=((rate_ago* (night_closing_ago-night_opening_ago))+(rate_pms * (night_closing_pms - night_opening_pms)));
       return night_sales;
    }
 
    double GrandSales(){
       grand_sales=(((rate_ago* (night_closing_ago-night_opening_ago))+
       (rate_pms * (night_closing_pms - night_opening_pms)))+((rate_ago * (day_closing_ago-day_opening_ago))+
       (rate_pms * (day_closing_pms - day_opening_pms))));
       
       return grand_sales;
    }
 
 }