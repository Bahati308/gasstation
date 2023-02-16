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

   // constructor

   Variables() {

       day_opening_pms=1;
       day_closing_pms=5;
       night_opening_pms=5;
       night_closing_pms=10;
       rate_pms=5099;
      pms_litres=0;
      pms_sales=0;

      //litres read from the pump
      day_pms_litres=0;
       night_pms_litres=0;

      // these are sales made 
      day_sales_pms=0;
      night_sales_pms=0;

      //these are litres read from the tanks
       morning_dips_pms =0;
       evening_dips_pms =0;
   }

   // methods are listed below
   // pms litres

   double dayPmsLitres() {
      return day_closing_pms - day_opening_pms;

   }

   double nightPmsLitres() {
      return night_closing_pms - night_opening_pms;

   }

   // pms sales

   double DaypmsSales() {
      return rate_pms * day_pms_litres;

   }

   double NightpmsSales() {
      night_sales_pms = rate_pms * night_pms_litres;
      return night_sales_pms;
   }

   // ago litres

   double dayAgoLitres() {
      return day_closing_ago - day_opening_ago;

   }

   double nightAgoLitres() {
      return night_closing_ago - night_opening_ago;

   }

   // pms sales

   double DayagoSales() {
      return rate_ago * day_ago_litres;

   }

   double NightagoSales() {
      return rate_ago * night_ago_litres;

   }

}

class FuelSales {
   public static void main(String[] args) {
      Variables dA = new Variables();
      double dayAgol;
      dayAgol = dA.dayAgoLitres();
      System.out.println("day shift ago litres :"+dayAgol);
   }
}
